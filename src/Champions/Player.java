package Champions;

import java.util.ArrayList;
import java.util.Arrays;

import Bullets.Bullet;
import Scenes.GamePane;
import javafx.application.Platform;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.Pane;
import javafx.scene.layout.StackPane;
import javafx.scene.transform.Rotate;

public class Player {
	Image mario;
	ImageView marioImageView;
	private GamePane mainPane;
	private double health;
	private double mana;
	private double money;
	private double sizeX;
	private double sizeY;
	private double angle;
	private double firstTree;
	private double secondTree;
	private double thirdTree;
	private double possitionX;
	private double possitionY;
	public boolean keys[] = new boolean[5];
	public ArrayList<Bullet> lista = new ArrayList<>();
		

	public Player(GamePane Pane,ArrayList<Bullet> listOfBullets,double possitionX,double possitionY,double sizeX, double sizeY) {
		Arrays.fill(keys, Boolean.FALSE);
		this.lista=listOfBullets;
		this.mainPane=Pane;
		this.sizeX = sizeX;
		this.sizeY = sizeY;
		this.possitionX = possitionX;
		this.possitionY = possitionY;
		this.angle=0;
		health = 100;
		mana = 100;
		money = 0;
		firstTree = 0;
		secondTree = 0;
		thirdTree = 0;
		makeImageView();
		mainPane.setOnMouseMoved(e->{
			mathAngle(e.getX(),	e.getY());
			
		
		});
	}
	
	public void makeImageView() {
		mario = new Image("Images/Mario.png", sizeX, sizeY, false, false);
		marioImageView = new ImageView(mario);
		marioImageView.setTranslateX(possitionX);
		marioImageView.setTranslateY(possitionY);
		mainPane.getChildren().add(marioImageView);
	}

	public synchronized void  move() {
	
		if ( keys[1] == true) {
	
			marioImageView.setTranslateX(marioImageView.getTranslateX() - 5);
		}
		if ( keys[0] == true) {
			marioImageView.setTranslateX(marioImageView.getTranslateX() + 5);
		}
	
		if (keys[2] == true) {

			marioImageView.setTranslateY(marioImageView.getTranslateY() - 5);
		}
		if (keys[3] == true) {
			marioImageView.setTranslateY(marioImageView.getTranslateY() + 5);
		}
		if (keys[4] == true) {
			Platform.runLater(() -> {
			//System.out.println("respiê w ("+ marioImageView.getTranslateX()+","+ marioImageView.getTranslateY()+")");
			Bullet fire = new Bullet(mainPane, "Bullets/bulletImage.png", 50, 50, 5, 0,5, marioImageView.getTranslateX(), marioImageView.getTranslateY());
			fire.addBulletToPane();
			lista.add(fire);
			
			});
		}

	}
	public void mathAngle( double x ,double y) {
		System.out.println("theta =  "+ Math.atan2(y, x));
		//System.out.println();
		
		//angle = Math.tan(x/y)angle;
	}
	public void rotate() {
		
			
		
		//System.out.print("obracam w dooka³o ("+(marioImageView.getTranslateX())+","+(marioImageView.getTranslateY())+")");
		System.out.println();
		mainPane.getMouseX();
		marioImageView.getTransforms().add(Rotate.rotate(angle,50, 50));
	}
	
}










