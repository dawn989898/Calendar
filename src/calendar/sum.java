package calendar;
import java.util.Scanner;

public class sum {

	public static void main(String[] args) {
		//�Է� : Ű����� �� ���� �Է��� �޴´�.
		//��� : ȭ�鿡 �� ���� ���� ����Ѵ�.
		int v1, v2, total;
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("�� ���� �Է����ּ���");
		v1 = scanner.nextInt();
		v2 = scanner.nextInt();
		total = v1 + v2;
		
		System.out.println(v1+", "+v2);
		System.out.printf("�� ���� ���� %d�Դϴ�.", total);
		scanner.close();
	}

}
