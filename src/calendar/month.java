package calendar;
import java.util.Calendar;
import java.util.Scanner;

public class month {

	public static void main(String... args){
		/*
		 * ���� �Է��ϼ���. 3 (����) 3���� 31�ϱ��� �ֽ��ϴ�.
		 */
    	// create a calendar  
		Calendar cal = Calendar.getInstance();
		Scanner scan = new Scanner(System.in);
		System.out.println("���� �Է��ϼ���.");
		int month = scan.nextInt();
		cal.set(Calendar.MONTH, month);

		int day = cal.getActualMaximum(Calendar.DAY_OF_MONTH);
		System.out.printf("%d���� %d�ϱ��� �ֽ��ϴ�.",month, day);
		scan.close();
    }
}
