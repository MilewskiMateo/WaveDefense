package Threads;

import Champions.Player;
import javafx.scene.Scene;

public class MouseThread extends Thread {
	Scene gameScene;
	Player player;

	public MouseThread(Scene gameScene, Player player) {
		this.gameScene = gameScene;
		this.player = player;
	}

	@Override
	public void run() {
		System.out.println("MouseThread odpalam");
		while (ThreadControlers.isMouseIsRunning()) {
			try {
				this.sleep(20);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		
			player.rotate();
		}
	}

}
