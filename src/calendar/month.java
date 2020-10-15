package calendar;
import java.util.Calendar;
import java.util.Scanner;

public class month {

	public static void main(String... args){
		//java.time api로 고치기
		//month는 0부터 시작한대
		Scanner scan = new Scanner(System.in);
		System.out.println("달을 입력하세요.");
		int month = scan.nextInt();
		Calendar cal = Calendar.getInstance();
		cal.set(Calendar.MONTH, month+1);
		
		int day = cal.getActualMaximum(Calendar.DAY_OF_MONTH);
		System.out.printf("%d월은 %d일까지 있습니다.",month, day);
		
		System.out.println("Changed year is :- " + cal.get(Calendar.YEAR));
        System.out.println("Changed month is :- " + cal.get(Calendar.MONTH));
		System.out.println("----------------------------------------");
		
		
		
    }
}
