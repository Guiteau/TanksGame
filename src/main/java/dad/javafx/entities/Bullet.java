package dad.javafx.entities;

public class Bullet extends Entity {

	public Bullet(Coordinates coordinates, int speed, Orientation orientation) {

		super(coordinates, new Dimensions(5, 5), speed, orientation);
	}

	@Override
	public void update() {

		this.move();

	}

}
