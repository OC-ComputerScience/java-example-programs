
public class Car {

	// instance variables
	private String serialNumber;
	private String make;
	private String model;
	private int year;
	private String color;
	private int mileage;
	private int speed;
	private char gear;

	// default constructor
	public Car() {
		mileage = 0;
		this.gear = 'P';
		this.speed = 0;
	}

	// constructor
	public Car(String serialNumber, String make, String model, int year, String color) {
		this();
		this.serialNumber = serialNumber;
		this.make = make;
		this.model = model;
		this.year = year;
		this.color = color;
	}

	// getters and setters
	public String getSerialNumber() {
		return serialNumber;
	}

	public void setSerialNumber(String serialNumber) {
		this.serialNumber = serialNumber;
	}

	public String getMake() {
		return make;
	}

	public void setMake(String make) {
		this.make = make;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public int getMileage() {
		return mileage;
	}

	public void setMileage(int mileage) {
		this.mileage = mileage;
	}

	public int getSpeed() {
		return speed;
	}

	public void setSpeed(int speed) {
		this.speed = speed;
	}

	public char getGear() {
		return gear;
	}

	public void setGear(char gear) {
		this.gear = gear;
	}

	public int timeToTravel(int miles) {
		return miles / getSpeed();
	}

	public void changeGear() {
		if (speed == 0)
			setGear('1');
		else if (speed > 15 && speed < 25 && gear != '2')
			setGear('2');
		else if (speed >= 25 && speed < 40 && gear != '3')
			setGear('3');
		else if (speed >= 40 && gear != '4')
			setGear('4');

	}

	@Override
	public String toString() {
		return year + " " + make + " " + model + " SN:" + serialNumber;
	}

}
