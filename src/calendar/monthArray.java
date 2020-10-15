package calendar;

import java.util.Scanner;

public class monthArray {
	private static final int[] maxDays = { 31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };

	public int maxDayOfMonth(int month) {
		return maxDays[month - 1];
	}

	public static void main(String... args) {

		Scanner scan = new Scanner(System.in);
		System.out.println("달을 입력하세요.");
		int month = scan.nextInt();
		monthArray mon = new monthArray();
		System.out.printf("%d월은 %d일까지 있습니다.", month, mon.maxDayOfMonth(month));
		scan.close();

	}
}
