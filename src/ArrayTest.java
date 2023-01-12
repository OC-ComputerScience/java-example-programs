
public class ArrayTest {

	public static void main(String[] args) {

		int[] numList = { 1, 2, 3, 5, 8, 9, 10 };

		for (int i = 0; i < numList.length; i++) {
			System.out.println(i + ": " + numList[i]);
		}

		String[] stringList = { "apple", "pear", "peach", "banana" };

		for (String s : stringList) {
			System.out.println(s);
		}

		int[][] numList2 = { { 1, 1 }, { 2, 2 } };

		for (int x = 0; x < 2; x++) {

			for (int y = 0; y < 2; y++) {
				System.out.println("x = " + x + " y = " + y + ": " + numList2[x][y]);
			}

		}

		for (int[] i : numList2) {
			for (int j : i) {
				System.out.println(j);
			}
		}

	}

}
