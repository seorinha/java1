package Variable_DataType_1;

public class Quiz03 {

	public static void main(String[] args) {

		// 3. 자료형 변환과 실수 연산
		
		//1번
		int korean = 93;
		int math = 88;
		int english = 94;
		
		double average = (korean + math + english) / 3.0;
		
		System.out.println("국어 " + korean + "점, 수학 " + math + "점, 영어" + english + "점" 
		+ "\n" + "평균 : " + average);
		
		System.out.println();
		
		//2번
		int celsius = 30;
		double fahrenheit = (double)9 / 5 * celsius + 32;
		
		System.out.println("섭씨 30도는 화씨 " + fahrenheit + "도 입니다.");
		
		
	}

}
