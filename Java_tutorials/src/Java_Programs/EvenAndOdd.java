package Java_Programs;

public class EvenAndOdd {

	public static void main(String[] args) {
		int[] U = { 1, 2, 3, 4 };
		int W = U.length;
		int even = 0;
		int odd = 0;
		for (int b = 0; b < W; b++) {

			if (U[b] % 2 == 0) {
				System.out.println("even" + "-" + U[b]);
				even = even + U[b];
			} else {
				System.out.println("odd" + "-" + U[b]);
				odd = odd + U[b];
			}

		}
		System.out.println(even + odd);
		System.out.println(even - odd);

	}

}
