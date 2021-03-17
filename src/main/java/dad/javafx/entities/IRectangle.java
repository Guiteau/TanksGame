package dad.javafx.entities;

public interface IRectangle {

	public int getX();

	public int getY();

	public int getHeight();

	public int getWidth();
	
	public int getSpeed();

	public default boolean isColliding(IRectangle iRectangle) {
				
		return 	
				getX() < iRectangle.getX() + iRectangle.getWidth()
				& iRectangle.getX() < getX() + getWidth()
				& getY() < iRectangle.getY() + iRectangle.getHeight()
				& iRectangle.getY() < getY() + getHeight();
	}

}
