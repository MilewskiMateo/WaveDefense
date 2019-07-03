package Champions;

import javax.swing.plaf.basic.BasicInternalFrameTitlePane.MoveAction;

import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.input.KeyEvent;
import javafx.scene.layout.StackPane;

public class Player {
	Image mario;

	ImageView marioImageView;

	public Player(StackPane stackPane) {
		mario = new Image("Images/Mario.png", 100, 100, false, false);
		marioImageView = new ImageView(mario);
		stackPane.getChildren().add(marioImageView);
	}

	public void move(Integer number) {
		switch (number) {
		case 1:
			marioImageView.setTranslateX(marioImageView.getTranslateX()+5);
			break;

		case 2:

			marioImageView.setTranslateX(marioImageView.getTranslateX()-5);
			break;
		case 3:

			marioImageView.setTranslateY(marioImageView.getTranslateY()-5);
			break;
		case 4:

			marioImageView.setTranslateY(marioImageView.getTranslateY()+5);
			break;
		case 0:

			break;
		default:
			break;
		}
	}
}