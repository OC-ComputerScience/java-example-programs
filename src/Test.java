
public class Test {

	public static void main(String[] args) {

		Dealer dealer;

		dealer = new Dealer("David's Car Lot", "Edmond, OK");

		Car car1 = new Car("JX123456708", "Chevrolet", "Malibu", 1976, "Maroon", "09/01/1977", 5400);
		Car car2 = new Car("LG12312489", "Triump", "TR6", 1973, "Green", "08/01/1984", 8000);
		Car car3 = new Car("TY12348908", "Alpha", "Spyder", 1985, "Red", "06/01/1995", 12000);
		Car car4 = new Car("QU12463484", "Porche", "911-Cabriolet", 1984, "Red", "10/01/2000", 24000);

		dealer.addCar(car4);
		dealer.addCar(car3);
		dealer.addCar(car1);
		dealer.addCar(car2);

		System.out.println(dealer + " car lot:");
		for (Car car : dealer.getCars()) {
			System.out.println(car);
		}

		System.out.println("Old Cars");
		for (Car car : dealer.oldInventory("01/01/1990")) {
			System.out.println(car);
		}
	}
}
