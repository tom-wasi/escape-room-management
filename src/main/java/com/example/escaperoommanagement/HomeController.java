package com.example.escaperoommanagement;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextInputDialog;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;

public class HomeController {

    @FXML
    private Button sendHintButton;

    @FXML
    private Button setTimeButton;

    @FXML
    private Button openEscapeRoomButton;

    @FXML
    void onSendHintButtonClick(ActionEvent event) {
        TextInputDialog dialog = new TextInputDialog();
        dialog.setTitle("Send Hint");
        dialog.setHeaderText("Enter Hint Text:");
        dialog.setContentText("Hint:");

        // Show the dialog and capture the result
        // Process the hint text (e.g., send it to the timer window)
        dialog.showAndWait().ifPresent(this::processHint);
    }
    private void processHint(String hint) {
        // Add your logic to process the hint text here
        // For example, you can send it to the timer window or perform any other action
        System.out.println(hint);
    }

    @FXML
    private void onSetTimeButtonClick(ActionEvent event) {
        // Create a TextInputDialog
        TextInputDialog dialog = new TextInputDialog();
        dialog.setTitle("Set Time");
        dialog.setHeaderText("Enter Game Time (in minutes):");
        dialog.setContentText("Time (minutes):");

        // Show the dialog and capture the result
        // Process the entered time (e.g., update the game time)
        dialog.showAndWait().ifPresent(this::processGameTime);
    }
    private void processGameTime(String timeText) {
        try {
            // Convert the entered text to an integer (assuming it's in minutes)
            int gameTime = Integer.parseInt(timeText);

            // Add your logic to process the game time here
            // For example, update the game timer with the new time
            System.out.println("Game Time (minutes): " + gameTime);
        } catch (NumberFormatException e) {
            // Handle the case where the user enters an invalid number
            System.err.println("Invalid input. Please enter a valid number.");
        }
    }

    @FXML
    private void openEscapeRoomWindow() {
        try {
            // Create a new Stage for the escape room window
            Stage escapeRoomStage = new Stage();

            // Load the FXML file for the escape room window (if applicable)
            // FXMLLoader loader = new FXMLLoader(getClass().getResource("EscapeRoom.fxml"));
            // Parent root = loader.load();

            // Alternatively, you can create the escape room window programmatically:
            Pane root = new Pane();


            Scene scene = new Scene(root);
            escapeRoomStage.setScene(scene);

            // Set the title and show the window
            escapeRoomStage.setTitle("Escape Room");
            escapeRoomStage.show();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    @FXML
    void onOpenEscapeRoomButtonClick(ActionEvent event) {
        // Create and show the escape room window
        openEscapeRoomWindow();
    }
}
