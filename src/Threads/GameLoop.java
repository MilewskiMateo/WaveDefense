package Threads;

public class GameLoop extends Thread{
	int i=0;
	//nothink//
	@Override
	public void run() {
		System.out.println("GameThread odpalam");
		while(ThreadControlers.isGameIsRunning()){
		i++;
			//System.out.println("Runnning");
	}
	}

}
