package Array_6;

import java.util.Random;
import java.util.Scanner;

public class Quiz03 {

	public static void main(String[] args) {

		//6-3. 배열 고급 문제
		Scanner scan = new Scanner(System.in);
		//1
//		int[] numbers = {3, 5, 2, 10, 39};
//		System.out.print("두 개의 index를 입력하세요 : ");
//		int index1 = scan.nextInt();
//		int index2 = scan.nextInt();
//		
//		int temp = numbers[index1];
//		numbers[index1] = numbers[index2];
//		numbers[index2] = temp;
//		
//		for (int i = 0; i < numbers.length; i++) {
//			System.out.print(numbers[i] + " ");
//		}
//		System.out.println();
		
		//2
		int[] randnum = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
		Random rand = new Random();
		
		// 0번째 index와 random index와 교체를 100번 반복해서 뒤섞는다.     
		for (int i = 0; i < 100; i++) {
		    int randIndex = rand.nextInt(10); // 0 ~ 9까지의 숫자를 랜덤으로 뽑는다.
		    // swap 구현
		    int temp = randnum[0];
		    randnum[0] = randnum[randIndex];
		    randnum[randIndex] = temp;
		}
		
		for (int i = 0; i < randnum.length; i++) {
			System.out.print(randnum[i] + " ");
		}
		System.out.println();
		
		//3
		int[] numbers3 = {5, 3, 2, 1, 2, 4, 3, 3, 2, 1};
		int [] freq = new int[6]; // 0인덱스는 버린다. 1 2 3 4 5
		for (int i = 0; i < numbers3.length; i++) {
			freq[numbers3[i]] += 1;
		}
		for (int i = 0; i < freq.length; i++) {
			System.out.print(i + ":" + freq[i] + "개");
		}
		
		
		
	}

}
