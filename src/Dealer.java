import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.TreeMap;

public class Dealer {

	private String name;
	private String address;
	private TreeMap<String, Car> cars;

	public Dealer() {
		cars = new TreeMap<String, Car>();
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

	public TreeMap<String, Car> getCars() {
		return cars;
	}

	public void addCar(Car car) {
		cars.put(car.getSerialNumber(), car);
	}

	public void removeCar(Car car) {
		cars.remove(car.getSerialNumber());
	}

	public int getCarCount() {
		return cars.size();
	}

	public ArrayList<Car> oldInventory(String date) {
		ArrayList<Car> oldList = new ArrayList<Car>();
		LocalDate oldDate = LocalDate.parse(date, DateTimeFormatter.ofPattern("MM/dd/yyyy"));
		for (Car car : getCars().values()) {
			if (car.getDatePurchased().isBefore(oldDate)) {
				oldList.add(car);
			}

		}
		return oldList;
	}

	public Car getCarForID(String serialNumber) {
		return getCars().get(serialNumber);
	}

	@Override
	public String toString() {
		return name;
	}
}
