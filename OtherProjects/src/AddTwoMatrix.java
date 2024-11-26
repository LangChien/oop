
public class AddTwoMatrix {
	public static void main(String args[]) {
		int[][] matrix1 = { { 22, 29, 31 }, { 90, 82, 53 } };
		int[][] matrix2 = { { 59, 92, 77 }, { 75, 46, 66 } };

		int[][] sumMatrix = new int[2][3];

		for (int i = 0; i < matrix1.length; i++) {
			for (int j = 0; j < matrix1[0].length; j++) {
				sumMatrix[i][j] = matrix1[i][j] + matrix2[i][j];
			}
		}

		System.out.println("Sum of the two matrices:");
		for (int i = 0; i < sumMatrix.length; i++) {
			for (int j = 0; j < sumMatrix[0].length; j++) {
				System.out.print(sumMatrix[i][j] + " ");
			}
			System.out.println();
		}
	}
}
