
import java.util.Scanner;

public class DayInMonth {
	public static boolean isLeapYear(int year) {
		return year % 4 == 0 && (year % 100 != 0 || year % 400 == 0);
	}

	public static int daysInMonth(int month, int year) {
		switch (month) {
		case 2:
			return isLeapYear(year) ? 29 : 28;
		case 4:
		case 6:
		case 9:
		case 11:
			return 30;
		default:
			return 31;
		}
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the month:");
		int month = sc.nextInt();
		System.out.println("Enter the year:");
		int year = sc.nextInt();
		int d = daysInMonth(month, year);
		System.out.println("There are " + d + " days in the month.");
	}
}
