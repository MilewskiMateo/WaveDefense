package Scenes;

import com.sun.javafx.scene.EnteredExitedHandler;

import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.Pane;
import javafx.scene.layout.StackPane;
//nothink//
public  class MenuScene extends Pane {
	static Pane menuInterface = new Pane();
	StackPane stackPane;
	Scene scene;
	public void setMenuPane(StackPane stackPane ,Scene scene){
		this.scene=scene;
		this.stackPane= stackPane;
		menuInterface.setPrefSize(1280, 720);
		menuInterface.setStyle("-fx-background-color : black;");
		
		Button startButton = new Button("Start");
		startButton.setPrefSize(200, 70);
		startButton.setTranslateX(50);
		startButton.setTranslateY(100);
		startButton.setOnAction(e->{setGameScene();});
		
		
		
		Button optionsButton = new Button("Options");
		optionsButton.setPrefSize(200, 70);
		optionsButton.setTranslateX(100);
		optionsButton.setTranslateY(200);
		
		Button exitButton = new Button("Exit");
		exitButton.setPrefSize(200, 70);
		exitButton.setTranslateX(150);
		exitButton.setTranslateY(300);
		
		
		menuInterface.getChildren().addAll(startButton,optionsButton,exitButton);
		stackPane.getChildren().add(menuInterface);
	}
	
	public void setGameScene() {
		GamePane gameInterface = new GamePane(scene);
		stackPane.getChildren().remove(menuInterface);
		stackPane.getChildren().add(gameInterface);
		
	}
	
}
