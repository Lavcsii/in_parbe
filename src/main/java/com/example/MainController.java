package com.example;

import java.io.IOException;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class MainController {

    Stage stage = new Stage();

    @FXML
    void onClickShowButton(ActionEvent event) {
        showDialog();
    }

    void showDialog() {
        try {
            tryShowDialog();
        } catch (IOException e) {
            System.err.println(e.getMessage());
        }
    }
    void tryShowDialog() throws IOException {
        FXMLLoader loader = new FXMLLoader(
            getClass().getResource("dialogScene.fxml"));
        Scene scene = new Scene(loader.load());
        
        stage.setScene(scene);
        stage.show();

        DialogController controller = loader.getController();
        controller.setMainController(this);
    }
    

}
