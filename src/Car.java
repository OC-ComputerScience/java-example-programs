
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Car implements Comparable<Car> {

	// instance variables
	private String serialNumber;
	private String make;
	private String model;
	private int year;
	private String color;
	private int mileage;
	private int speed;
	private char gear;
	private LocalDate datePurchased;
	private int price;

	// default constructor
	public Car() {
		this.mileage = 0;
		this.gear = 'P';
		this.speed = 0;
	}

	// constructor
	public Car(String serialNumber, String make, String model, int year, String color, String date, int price) {
		this();
		this.serialNumber = serialNumber;
		this.make = make;
		this.model = model;
		this.year = year;
		this.color = color;
		this.setDatePurchased(LocalDate.parse(date, DateTimeFormatter.ofPattern("MM/dd/yyyy")));
		this.price = price;
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

	public LocalDate getDatePurchased() {
		return datePurchased;
	}

	public void setDatePurchased(LocalDate datePurchased) {
		this.datePurchased = datePurchased;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
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
	public int compareTo(Car car) {

		if (getPrice() < car.getPrice()) {
			return -1;
		} else if (getPrice() > car.getPrice()) {
			return 1;
		} else {
			return 0;
		}

	}

	@Override
	public String toString() {
		return year + " " + make + " " + model + "Price: " + price + " Purchased:" + datePurchased;
	}

}
