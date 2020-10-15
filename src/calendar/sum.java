package calendar;
import java.util.Scanner;

public class sum {

	public static void main(String[] args) {
		//입력 : 키보드로 두 수의 입력을 받는다.
		//출력 : 화면에 두 수의 합을 출력한다.
		int v1, v2, total;
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("두 수를 입력해주세요");
		v1 = scanner.nextInt();
		v2 = scanner.nextInt();
		total = v1 + v2;
		
		System.out.println(v1+", "+v2);
		System.out.printf("두 수의 합은 %d입니다.", total);
		scanner.close();
	}

}
