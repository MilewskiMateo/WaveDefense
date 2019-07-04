package Threads;

import Champions.Player;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.input.KeyEvent;
//nothink//
public class KeyThread extends Thread {
	Scene gameScene;
	Player player;

	public KeyThread(Scene gameScene, Player player) {
		this.gameScene = gameScene;
		this.player = player;
	}

	@Override
	public void run() {
System.out.println("KeyThread odpalam");
		while (ThreadControlers.isKeyIsRunning()) {

			gameScene.setOnKeyPressed(new EventHandler<KeyEvent>() {
				@Override
				public void handle(KeyEvent event) {
					switch (event.getCode()) {
					case UP:
						System.out.println("gora");
						player.move(3);
						break;
					case DOWN:
						System.out.println("dol");
						player.move(4);
						break;
					case LEFT:
						System.out.println("lewo");
						player.move(2);
						break;
					case RIGHT:
						System.out.println("prawo");
						player.move(1);
						break;
					case SHIFT:
						System.out.println("Shift");
						break;
					default:
						break;
					}

				}
			});

			gameScene.setOnKeyReleased(new EventHandler<KeyEvent>() {
				@Override
				public void handle(KeyEvent event) {
					switch (event.getCode()) {
					case UP:
						break;
					case DOWN:
						break;
					case LEFT:
						break;
					case RIGHT:
						break;
					case SHIFT:
						break;
					default:
						break;
					}
				}
			});

		}
	}

}
