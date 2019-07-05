package Threads;

import Champions.Player;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.input.KeyCode;
import javafx.scene.input.KeyEvent;

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
			try {
				this.sleep(20);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			player.move();
		//	player.rotate();
		}
	}

}
