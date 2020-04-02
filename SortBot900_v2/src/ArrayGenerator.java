import java.util.Random;

public class ArrayGenerator {

	public static int random(int min, int max) {

		if (min >= max) {
			throw new IllegalArgumentException("max must be greater than min");
		}

		Random r = new Random();
		return r.nextInt((max - min) + 1) + min;
	}

	public static void generate() {
		System.out.println("BEFORE SORT");
		int[] a = new int[10];
		for (int i = 0; i < a.length; i++) {
			a[i] = random(0, 10);
			System.out.print(a[i]);
		}
		System.out.println("\n");
		

		//sort.insertion(a, 0, 9);
		System.out.println("AFTER SORT");
		//sort.insertion(a, 0, 9);
		for (int i = 0; i < a.length; i++) {
			System.out.print(a[i]);
		}
		System.out.println("\n");
	}

	public ArrayGenerator() {}
}
