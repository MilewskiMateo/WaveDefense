package Scenes;

import java.util.ArrayList;

import Bullets.Bullet;
import Champions.Player;
import Threads.GameLoop;
import Threads.KeyThread;
import Threads.MouseThread;
import javafx.scene.Scene;
import javafx.scene.input.KeyCode;
import javafx.scene.input.KeyEvent;
import javafx.scene.layout.Pane;

public class GamePane extends Pane {

	public ArrayList<Bullet> lista = new ArrayList<>();
	Scene scene;
	Player player1;
	private double mouseX;
	private double mouseY;

	public GamePane(Scene scene) {
		this.scene = scene;
		this.setPrefSize(1280, 720);
		this.setStyle("-fx-background-color : blue;");

		player1 = new Player(this, lista, 100, 100, 100, 100);
		Thread mouseThread = new MouseThread(scene, player1);
		Thread gameThread = new GameLoop();
		Thread keyThread1 = new KeyThread(scene, player1);
		keysHandaling();
		mouseThread.start();
		gameThread.start();
		keyThread1.start();

	}

	public void keysHandaling() {
		
		scene.addEventFilter(KeyEvent.ANY, keyEvent -> {
			if (keyEvent.getCode() == KeyCode.D && keyEvent.getEventType() == keyEvent.KEY_PRESSED) {
				player1.keys[0]=true;
			}
			if (keyEvent.getCode() == KeyCode.A && keyEvent.getEventType() == keyEvent.KEY_PRESSED) {
				player1.keys[1] = true;
			}
			if (keyEvent.getCode() == KeyCode.W && keyEvent.getEventType() == keyEvent.KEY_PRESSED) {
				player1.keys[2] = true;
			}
			if (keyEvent.getCode() == KeyCode.S && keyEvent.getEventType() == keyEvent.KEY_PRESSED) {
				player1.keys[3] = true;
			}
			if (keyEvent.getCode() == KeyCode.SPACE && keyEvent.getEventType() == keyEvent.KEY_PRESSED) {
				player1.keys[4] = true;
			}

			if (keyEvent.getCode() == KeyCode.D && keyEvent.getEventType() == keyEvent.KEY_RELEASED) {
				player1.keys[0] = false;
			}
			if (keyEvent.getCode() == KeyCode.A && keyEvent.getEventType() == keyEvent.KEY_RELEASED) {
				player1.keys[1] = false;
			}
			if (keyEvent.getCode() == KeyCode.W && keyEvent.getEventType() == keyEvent.KEY_RELEASED) {
				player1.keys[2] = false;
			}
			if (keyEvent.getCode() == KeyCode.S && keyEvent.getEventType() == keyEvent.KEY_RELEASED) {
				player1.keys[3] = false;
			}
			if (keyEvent.getCode() == KeyCode.SPACE && keyEvent.getEventType() == keyEvent.KEY_RELEASED) {
				player1.keys[4] = false;
			}
		
		});
		
	}




	public double getMouseX() {
		return mouseX;
	}

	public void setMouseX(double mouseX) {
		this.mouseX = mouseX;
	}

	public double getMouseY() {
		return mouseY;
	}

	public void setMouseY(double mouseY) {
		this.mouseY = mouseY;
	}
}