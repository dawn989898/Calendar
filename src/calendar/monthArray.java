package calendar;

import java.util.Scanner;

public class monthArray {
	private static final int[] maxDays = { 31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };

	public int maxDayOfMonth(int month) {
		return maxDays[month - 1];
	}

	public static void main(String... args) {

		Scanner scan = new Scanner(System.in);
		System.out.println("���� �Է��ϼ���.");
		int month = scan.nextInt();
		monthArray mon = new monthArray();
		System.out.printf("%d���� %d�ϱ��� �ֽ��ϴ�.", month, mon.maxDayOfMonth(month));
		scan.close();

	}
}
