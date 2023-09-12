package Array_6;

import java.util.Scanner;

public class Quiz02 {

	public static void main(String[] args) {
		
		//6-2. 배열 응용하기
		Scanner scan = new Scanner(System.in);
		//1.
		int[] numbers = {3, 5, 2, 10, 39};
		System.out.print("변경할 index와 값을 입력하세요 : ");
		int index = scan.nextInt();
		int num = scan.nextInt();
		
		numbers[index] = num;
		
		for (int i = 0; i < numbers.length; i++) {
			System.out.print(numbers[i] + " ");			
		}
		System.out.println();
		
		//2
		char[] scores = {'X', 'O', 'O', 'X', 'X', 'O', 'O', 'O', 'O', 'X'};
		int score = 0;
		for (int i = 0; i < scores.length; i++) {
			if (scores[i] == 'O') {
				score += 100 / scores.length;
			}
		}
		System.out.println(score + "점");
		
		
		//3
		int[] works = {3, 5, 5, 3, 5, 3, 5};
		
		int wage = 0;
		for (int i = 0; i < works.length; i++) {
			if (i > 4) { //주말
				wage += works[i] * 9500;
			} else {//평일
				wage += works[i] * 8500;
			}
		}
		System.out.print("일주일간 총 임금은 " +  wage + "원");
		System.out.println();
		
		//4
		//배열 채우기
		int [] evenNumbers= new int[5]; 
		index = 0;
		while (index < 5) {
			System.out.print("수를 입력하세요 : ");
			int num1 = scan.nextInt();
			if (num1 % 2 == 0) {
				evenNumbers[index] = num1;
				index++;
			}
		}
		
		//배열 출력
		for (int i = 0; i < evenNumbers.length; i++) {
			System.out.print(evenNumbers[i] + " ");
			
		}
		
		
		
		
		
	}

}
