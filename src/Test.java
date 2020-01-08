import java.util.Random;

// Lydia K Fritz
// CST105
// Date: Jan 12, 2018
// This is my own work.

public class Test {

	public static void main(String[] args) {
		Random r = new Random();

		int[] arr = new int[40];
		for (int i = 0; i < arr.length; i++) {
			arr[i] = r.nextInt(100);
		}

		for (Integer i : arr)
			System.out.print(i + " ");
		System.out.println();

		
	}

}
