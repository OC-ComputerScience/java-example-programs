public abstract class Shape {

	private String color;

	public String getColor() {
		return this.color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public abstract double getArea();

	@Override
	public String toString() {
		return "Shape: " + getColor();
	}

}