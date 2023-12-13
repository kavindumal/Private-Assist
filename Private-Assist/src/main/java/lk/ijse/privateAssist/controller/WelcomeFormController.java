package lk.ijse.privateAssist.controller;

import javafx.animation.KeyFrame;
import javafx.animation.Timeline;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.control.Label;
import javafx.scene.image.ImageView;
import javafx.scene.image.Image;
import javafx.scene.layout.AnchorPane;
import javafx.util.Duration;

import java.io.IOException;
import java.net.URL;
import java.util.Objects;
import java.util.ResourceBundle;

public class WelcomeFormController implements Initializable {
    @FXML
    private AnchorPane welcomePane;
    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        displayLoadingAnimation();
        Timeline timeline = new Timeline(new KeyFrame(Duration.seconds(2), e -> navigateToLoginPage()));
        timeline.play();
    }

    private void displayLoadingAnimation() {
        Image loadingImage = new Image(Objects.requireNonNull(getClass().getResourceAsStream("/img/gif/chatbot.gif")));
        ImageView loadingImageView = new ImageView(loadingImage);
        loadingImageView.setFitHeight(150);
        loadingImageView.setFitWidth(150);
        loadingImageView.setLayoutX(925);
        loadingImageView.setLayoutY(515);
        welcomePane.getChildren().add(loadingImageView);
    }

    private void navigateToLoginPage() {
        welcomePane.getChildren().clear();
        try {
            Parent dashboard = FXMLLoader.load(Objects.requireNonNull(getClass().getResource("/view/loginForm.fxml")));
            welcomePane.getChildren().add(dashboard);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
