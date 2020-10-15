package calendar;

import java.util.Scanner;

public class monthArray {
	private static final int[] maxDays = { 31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };

	public int maxDayOfMonth(int month) {
		return maxDays[month - 1];
	}

	public static void main(String... args) {

		Scanner scan = new Scanner(System.in);
		System.out.println("�ݺ�Ƚ���� �Է��ϼ���");
		int loop = scan.nextInt();
		
		System.out.println("���� �Է��ϼ���.");
		
		int[] months = new int[loop];
		
		for(int i=0; i<loop; i++) {
		int month = scan.nextInt();
		months[i] += month;
		}
		
		for(int i=0; i<loop; i++) {
		monthArray mon = new monthArray();
		System.out.printf("%d���� %d�ϱ��� �ֽ��ϴ�. \n", months[i], mon.maxDayOfMonth(months[i]));
		scan.close();
		}
	}
}
