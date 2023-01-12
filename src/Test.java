
public class Test {

	public static void main(String[] args) {

		Dealer dealer;

		dealer = new Dealer("David's Car Lot", "Edmond, OK");

		Car car1 = new Car("JX123456708", "Chevrolet", "Malibu", 1976, "Maroon");
		dealer.addCar(car1);

		Car car2 = new Car("LG12312489", "Triump", "TR6", 1973, "Green");
		dealer.addCar(car2);

		Car car3 = new Car("TY12348908", "Alpha", "Spyder", 1985, "Red");
		dealer.addCar(car3);

		Car car4 = new Car("QU12463484", "Porche", "911-Cabriolet", 1984, "Red");
		dealer.addCar(car4);

		System.out.println(dealer);
		for (int i = 0; i < dealer.getCarCount(); i++) {
			System.out.println(dealer.getCars()[i]);
		}

		dealer.removeCar(car2);

		System.out.println(dealer);
		for (int i = 0; i < dealer.getCarCount(); i++) {
			System.out.println(dealer.getCars()[i]);
		}

	}
}
