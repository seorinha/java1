package Function_5;

public class Ex01 {

public static void main(String[] args) {

	//method 사용하기
	
	//반올림 : Math.round
	double d = 3.68;
	long roundNumber = Math.round(d);
	System.out.println(roundNumber); // 4
	System.out.println(Math.round(d)); // 4
	
	//큰 값 : Math.max
	int max = Math.max(10, 90);
	System.out.println(max); //90
	System.out.println(Math.max(10, 90)); //90
	
	//절대값 구하기 : Math.abs
	double abs = Math.abs(-5.5);
	System.out.println(abs); //5.5
	
	
	}

}
