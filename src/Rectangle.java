public class Rectangle extends Shape {

	private int length;
	private int width;

	public Rectangle(int lenght, int width) {
		this.length = lenght;
		this.width = width;
	}

	@Override
	public double getArea() {
		return getLength() * getWidth();
	}

	@Override
	public String toString() {
		return super.toString() + " Rectangle: " + getLength() + " by " + getWidth();
	}

	public int getLength() {
		return length;
	}

	public void setLength(int length) {
		this.length = length;
	}

	public int getWidth() {
		return width;
	}

	public void setWidth(int width) {
		this.width = width;
	}

}