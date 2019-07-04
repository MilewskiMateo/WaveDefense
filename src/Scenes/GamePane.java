package Scenes;
//nothink//
import Champions.Player;
import Threads.GameLoop;
import Threads.KeyThread;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.StackPane;

public class GamePane extends StackPane {

	public GamePane(Scene scene) {

	

		this.setPrefSize(1280, 720);
		this.setStyle("-fx-background-color : blue;");
		
		Player playerOnePlayer = new Player(this);

		Thread gameThread = new GameLoop();
		Thread keyThread1 = new KeyThread(scene,playerOnePlayer);

		gameThread.start();
		keyThread1.start();
		
		
	}

}
