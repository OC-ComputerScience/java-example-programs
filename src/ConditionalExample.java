
public class ConditionalExample {

	public static void main(String[] args) {

		int a = 1;
		int b = 2;
		int c = 3;

		System.out.println("a = " + a);
		System.out.println("b = " + b);
		System.out.println("c = " + c);

		if (a < b) {
			System.out.println("a < b");
		}
		if (a > b) {
			System.out.println("a > b");
		}
		if (a == b) {
			System.out.println("a = b");
		}

		if (a < b) {
			System.out.println("a < b");
		} else if (a > b) {
			System.out.println("a > b");
		} else {
			System.out.println("a = b");
		}

		if (a < b && b < c && a < c) {
			System.out.println("Numbers are in order");
		} else {
			System.out.println("Numbers are not in order");
		}

		switch (a) {
		case 1:
			System.out.println("a = 1");
			break;
		case 2:
			System.out.println("a = 2");
			break;
		default:
			System.out.println("Don't know what a is");
		}

	}

}
