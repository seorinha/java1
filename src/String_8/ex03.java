package String_8;

public class ex03 {

	public static void main(String[] args) {

		String s1 = "eclipse";
		
		//charAt: n번째 index에 무슨 문자가 있는지 확인 할 때ㅐ
		System.out.println(s1.charAt(4)); // p
		
		//contains: 특정 문자열이 문자열에 포함되어 있는지 확인 할 때 
		 System.out.println(s1.contains("lip")); // true
		
		//startsWith: 특정 문자열로 시작하는지 확인 할 때
		 System.out.println( s1.startsWith("ecl")); // true
		 
		//endsWith: 특정 문자열로 끝나는지 확인 할 때
		 System.out.println(s1.endsWith("aaa")); // false 
		 
		 //length: 문자열의 길이를 확인 할 때, 알파벳이 몇개인지 
		 System.out.println(s1.length());
		 
		 //replace: 포함된 문자열 부분을 교체
		 String s2 = "내가 지금 먹고싶은 것은 치킨이다";
		 s2 = s2.replace("치킨", "떡볶이");
		 System.out.println(s2); // 내가 지금 먹고싶은 것은 떡볶이이다
		 
		 //split: 특정 스트링을 기준으로 잘라서 배열에 넣는다
		 String s3 = "apple,melon,grape";
		 String[] fruits = s3.split(",");
		 System.out.println(fruits[0] + " " + fruits[1] + " " + fruits[2]);
		 
		 //substring: 문자열을 자른다
		 String s4 = "javastudy";
		 System.out.println(s4.substring(4)); //study
		 
		 //begin index: 시작 인덱스
		 //end index: 자르고 싶은 끝 인덱스 + 1
		 System.out.println(s4.substring(0, 4)); //java
		 System.out.println(s4.substring(4, 9)); //study
		 
		 
	}

}
