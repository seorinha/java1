package Loop_3;

import java.util.Scanner;

public class Quiz01 {

	public static void main(String[] args) {

		//1.while문과 복합 대입 연산자
		Scanner scan = new Scanner(System.in);
		//1번
		System.out.print("횟수를 입력하세요 : ");
		int count = scan.nextInt();
		
		int i = 0; // 0 ~ (count-1) : count개 만큼
		while (i < count) {
			System.out.println("화이팅!!");
			i++;
		}
		
		//2번
		System.out.print("카운트 다운 수를 입력하세요 : ");
		int countDown = scan.nextInt();
		
		while (countDown >= 0) {
			System.out.println(countDown);
			countDown--;
		}
		System.out.println("발사");
		
		//3번 
		i = 0;
		while (i < 5) {
			System.out.print("수를 입력하세요 : ");
			int num = scan.nextInt();
			System.out.println("출력: " + num);
			i++;
		}
		
		//4번
		int num1 = 3;
		i = 1;
		while (i <= 9) {
			System.out.println(num1 + " X " + i + " = " + (num1 * i));
			i++;
		}
		
		
		
	}

}
