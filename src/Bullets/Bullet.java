package Bullets;

import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.Pane;

public class Bullet {
	private double damage;
	private double angle;
	private double speed;
	private double sizeX;
	private double sizeY;
	private double possitionX;
	private double possitionY;
	private Pane mainPane;
	Image imageOfImageBulletImage;
	ImageView imageView;
	String pathToImage;

	public Bullet(Pane mainPane, String pathToImage, double sizeX, double sizeY, double damage, double angle,
			double speed, double possitionX, double possitionY) {

		this.mainPane = mainPane;
		this.pathToImage = pathToImage;
		this.sizeX = sizeX;
		this.sizeY = sizeY;
		this.possitionX = possitionX;
		this.possitionY = possitionY;
		this.speed = speed;
		this.damage = damage;
		this.angle = angle;
		makeImageView();
		
	}

	public void makeImageView() {
		imageOfImageBulletImage = new Image(pathToImage, sizeX, sizeY, false, false);
		imageView = new ImageView(imageOfImageBulletImage);
		imageView.setTranslateX(possitionX);
		imageView.setTranslateY(possitionY);
	}

	public void moveBullet() {

		double xMove = Math.sin(angle) * speed;
		double yMove = Math.cos(angle) * speed;
		possitionX -= xMove;
		possitionY -= yMove;

	}

	public void addBulletToPane() {
		mainPane.getChildren().add(imageView);
	}

	public void removeBulletFromPane() {
		mainPane.getChildren().remove(imageView);

	}

	public void upadateLocation() {

		mainPane.getChildren().remove(imageView);
		makeImageView();
		mainPane.getChildren().add(imageView);
	}

}
