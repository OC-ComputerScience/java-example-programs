import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;

public class Dealer {

	private String name;
	private String address;
	private ArrayList<Car> cars;

	public Dealer() {
		cars = new ArrayList<Car>();
	}

	public Dealer(String name, String address) {
		this();
		this.setName(name);
		this.setAddress(address);
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public ArrayList<Car> getCars() {
		return cars;
	}

	public void addCar(Car car) {
		cars.add(car);
	}

	public void removeCar(Car car) {
		cars.remove(car);
	}

	public int getCarCount() {
		return cars.size();
	}

	public ArrayList<Car> oldInventory(String date) {
		ArrayList<Car> oldList = new ArrayList<Car>();
		LocalDate oldDate = LocalDate.parse(date, DateTimeFormatter.ofPattern("M/d/yyyy"));
		for (Car car : getCars()) {
			if (car.getDatePurchased().isBefore(oldDate)) {
				oldList.add(car);
			}
		}
		return oldList;
	}

	@Override
	public String toString() {
		return name;
	}
}
