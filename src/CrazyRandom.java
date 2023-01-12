import java.util.Random;

public class CrazyRandom {

	public static void main(String[] args) {

		Random randomgen;
		randomgen = new Random();
		// randomgen.setSeed(123456);
		int total = 0;
		int roll;
		int sides = 6;

		for (int i = 0; i < 10; i++) {
			roll = randomgen.nextInt(sides) + 1;
			System.out.println(roll);
			total = total + roll;
		}

		System.out.println(total);
	}

}
