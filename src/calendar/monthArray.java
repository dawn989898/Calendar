package calendar;

import java.util.Scanner;

public class monthArray {
	public static void main(String... args){
	int[] maxDays = {31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
	
	Scanner scan = new Scanner(System.in);
	System.out.println("���� �Է��ϼ���.");
	int month = scan.nextInt();
	System.out.printf("%d���� %d�ϱ��� �ֽ��ϴ�.",month, maxDays[month-1]);
	scan.close();
	}
}
