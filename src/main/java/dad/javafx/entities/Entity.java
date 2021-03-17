package dad.javafx.entities;

public abstract class Entity implements IRectangle {

	private Coordinates coordinates;
	private Dimensions dimensions;
	private int speed;
	private Orientation orientation;

	public Entity(Coordinates coordinates, Dimensions dimensions) {

		coordinates = new Coordinates(coordinates.getX(), coordinates.getY());
		dimensions = new Dimensions(dimensions.w(), dimensions.h());
		this.orientation = Orientation.NORTH;

	}

	public Entity(Coordinates coordinates, Dimensions dimensions, int speed, Orientation orientation) {

		this(coordinates, dimensions);
		this.orientation = orientation;
		this.speed = speed;

	}

	public abstract void update();

	public void move() {

		switch (this.orientation) {
		
		case NORTH: {

			coordinates.setY(this.getY() - speed);
		}
		case SOUTH: {

			coordinates.setY(this.getY() + speed);
		}
		case WEST: {

			coordinates.setX(this.getX() - speed);
		}
		case EAST: {

			coordinates.setX(this.getX() + speed);
		}
		default:
			throw new IllegalArgumentException("Unexpected value: " + this.getOrientation());
		}

	}

	@Override
	public int getX() {
		return coordinates.getX();
	}

	@Override
	public int getY() {
		return coordinates.getY();
	}

	@Override
	public int getHeight() {
		return dimensions.h();
	}

	@Override
	public int getWidth() {
		return dimensions.w();
	}

	@Override
	public int getSpeed() {
		return this.speed;
	}

	public Orientation getOrientation() {
		return orientation;
	}

}
