package calendar;
import java.util.Calendar;
import java.util.Scanner;

public class month {

	public static void main(String... args){
		//java.time api�� ��ġ��
		//month�� 0���� �����Ѵ�
		Scanner scan = new Scanner(System.in);
		System.out.println("���� �Է��ϼ���.");
		int month = scan.nextInt();
		Calendar cal = Calendar.getInstance();
		cal.set(Calendar.MONTH, month+1);
		
		int day = cal.getActualMaximum(Calendar.DAY_OF_MONTH);
		System.out.printf("%d���� %d�ϱ��� �ֽ��ϴ�.",month, day);
		
		System.out.println("Changed year is :- " + cal.get(Calendar.YEAR));
        System.out.println("Changed month is :- " + cal.get(Calendar.MONTH));
		System.out.println("----------------------------------------");
		
		
		
    }
}
