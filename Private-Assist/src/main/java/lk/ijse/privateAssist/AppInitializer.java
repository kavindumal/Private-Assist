package lk.ijse.privateAssist;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import java.util.Objects;
import javafx.scene.image.Image;
import javafx.stage.StageStyle;

public class AppInitializer extends Application {
    public static void main(String[] args) {
        launch(args);
    }
    @Override
    public void start(Stage stage) throws Exception {
//        Image cursorImage = new Image("img/icons/cursor2.png");
//        Cursor customCursor = new ImageCursor(cursorImage);
        Parent rootNode = FXMLLoader.load(Objects.requireNonNull(this.getClass().getResource("/view/welcomeForm.fxml")));
//        rootNode.setCursor(customCursor);
        Scene scene = new Scene(rootNode);
//        scene.setCursor(customCursor);
        Image icon = new Image("/img/logo/logo.png");
        stage.initStyle(StageStyle.UNDECORATED);
        stage.setTitle("Private Assist");
        stage.getIcons().add(icon);
        stage.setScene(scene);
        stage.show();
    }
}