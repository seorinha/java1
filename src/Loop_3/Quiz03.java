package Loop_3;

import java.util.Scanner;

public class Quiz03 {

	public static void main(String[] args) {

		//3.break문과 continue문
		Scanner scan = new Scanner(System.in);
		//1번
		while (true) {
			System.out.print("수를 입력하세요 : ");
			int number = scan.nextInt();
			if (number == 0) {
				System.out.println("끝");
				break;
			}
		}
		
		//2번
		int sum = 0;
		for (int i = 3; i <= 50; i++) {
			if (i % 3 != 0) {
				continue;
			}
			sum += i;
		}
		System.out.println(sum);
		

	}

}
