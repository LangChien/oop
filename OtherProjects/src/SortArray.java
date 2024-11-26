public class SortArray {
	public static void main(String[] args) {
		int[] arr = { 5, 2, 3, 1, 4 };
		sort(arr);
		for (int i : arr) {
			System.out.print(i + " ");
		}
		System.out.println();
		System.out.println("Sum: " + sum(arr));
		System.out.println("Average: " + avg(arr));
	}

	public static int sum(int[] arr) {
		int s = 0;
		for (int i : arr) {
			s += i;
		}
		return s;
	}

	public static int avg(int[] args) {
		return sum(args) / args.length;
	}

	public static void sort(int[] arr) {
		int n = arr.length;
		for (int i = 0; i < n - 1; i++) {
			int minIndex = i;
			for (int j = i + 1; j < n; j++) {
				if (arr[j] < arr[minIndex]) {
					minIndex = j;
				}
			}
			int temp = arr[minIndex];
			arr[minIndex] = arr[i];
			arr[i] = temp;
		}
	}
}
