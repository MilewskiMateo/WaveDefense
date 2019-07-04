package Threads;
//nothink//
public class ThreadControlers {
    private volatile static boolean gameIsRunning = true;
    private volatile static boolean keyIsRunning = true;
	public static boolean isGameIsRunning() {
		return gameIsRunning;
	}

	public static void setGameIsRunning(boolean gameIsRunning) {
		ThreadControlers.gameIsRunning = gameIsRunning;
		System.out.println(" zamykam gre");
	}
	


	public static boolean isKeyIsRunning() {
		return gameIsRunning;
	}

	public static void setKeyIsRunning(boolean gameIsRunning) {
		ThreadControlers.gameIsRunning = gameIsRunning;
		System.out.println(" zamykam klucze");
	}
	
}
