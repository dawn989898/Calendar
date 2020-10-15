package calendar;
import java.util.Calendar;
import java.util.Scanner;

public class month {

	public static void main(String... args){
		/*
		 * 달을 입력하세요. 3 (엔터) 3월은 31일까지 있습니다.
		 */
    	// create a calendar  
		Calendar cal = Calendar.getInstance();
		Scanner scan = new Scanner(System.in);
		System.out.println("달을 입력하세요.");
		int month = scan.nextInt();
		cal.set(Calendar.MONTH, month);

		int day = cal.getActualMaximum(Calendar.DAY_OF_MONTH);
		System.out.printf("%d월은 %d일까지 있습니다.",month, day);
		scan.close();
    }
}
