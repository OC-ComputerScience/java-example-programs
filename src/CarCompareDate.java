import java.util.Comparator;

public class CarCompareDate implements Comparator<Car> {

	@Override
	public int compare(Car car1, Car car2) {

		return car1.getDatePurchased().compareTo(car2.getDatePurchased());
	}
}
