import java.util.Scanner;

public class Triangular {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the first side of the triangle:");
		int d = scanner.nextInt();
		for (int i = 0; i < d; i++) {
			for (int j = 0; j < d * 2; j++) {
				if (Math.abs(j - d) <= i) {
					System.out.print("*");
				} else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
	}
}
