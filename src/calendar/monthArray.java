package calendar;

import java.util.Scanner;

public class monthArray {
	public static void main(String... args){
	int[] maxDays = {31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
	
	Scanner scan = new Scanner(System.in);
	System.out.println("달을 입력하세요.");
	int month = scan.nextInt();
	System.out.printf("%d월은 %d일까지 있습니다.",month, maxDays[month-1]);
	scan.close();
	}
}
