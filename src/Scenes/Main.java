package Scenes;
import Threads.GameLoop;
import Threads.ThreadControlers;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.layout.Pane;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;
//nothink//
public class Main extends Application {

	public static void main(String[] args) {
		launch(args);

	}

	@Override
	public void start(Stage primaryStage) throws Exception {
		
		StackPane stackPane = new StackPane();
		Scene scene = new Scene(stackPane, 1280, 720);
		primaryStage.setTitle("WaveDefense");
		primaryStage.setScene(scene);
		primaryStage.setResizable(false);
		primaryStage.show();
		primaryStage.setOnCloseRequest(e->{
			ThreadControlers.setGameIsRunning(false);
			ThreadControlers.setKeyIsRunning(false);
		});
		MenuScene menuPane = new MenuScene();
		
		menuPane.setMenuPane(stackPane,scene);
	}

}
