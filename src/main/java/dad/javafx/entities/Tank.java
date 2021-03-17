package dad.javafx.entities;

public class Tank extends Entity{

	public Tank(Coordinates coordinates, int speed, Orientation orientation) {
		
		super(coordinates, new Dimensions(40, 40), speed, orientation);
		
	}
	
	public void shootBullets() {
		
		Coordinates coordinates = new Coordinates(this.getX(), this.getY());
		
		Bullet bullet = new Bullet(coordinates, 10, this.getOrientation());
		
		bullet.update();
		
	}

	@Override
	public void update() {
		
		
		
	}
	
}
