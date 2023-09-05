package Array_6;

import java.nio.file.spi.FileSystemProvider;

public class Quiz01 {

	public static void main(String[] args) {

		int[] numbers = {3, 8, 9, 4, 2, 1, 7, 5};
		
		//1
		numbers[3] = 6;
		
		//2
		System.out.println(numbers); //hash
		for (int i = 0; i < numbers.length; i++) {
			System.out.print(numbers[i] + " ");
		}
		
		System.out.println();
		
		//3
		for (int i = numbers.length - 1; i >= 0; i--) { 
			System.out.print(numbers[i] + " ");
		}
		
		System.out.println();

		//4
		for (int i = 0; i < numbers.length; i++) {
			if (i % 2 != 0) {
				System.out.print(numbers[i] + " ");
			}
		}
		
		System.out.println();
		//5
		for (int i = 0; i < numbers.length; i++) {
			if (numbers[i] == 2) {
				System.out.println("2가 들어있는 index는 " + i);
			}
		}
		
		
		
		
		
		
	}

}
