package ch5;
/*
 * 
 * String : char 배열에 기능을 추가하는 개념 
 * 
 * 
 */
import java.util.Arrays;
import java.util.Iterator;

public class ArrayEx7 {

	public static void main(String[] args) {
		System.out.println(args[0]);
		//int numArr[] = new int[3];
		
		
		String name[]= new String[3];
		
		// System.out.println(name[0]); 
		
		// null : 아직 어떤 값이 할당이 안된 상황
		// steak에서 heap으로 넘어가지 않은 상황
		
		for (int i = 0; i < name.length; i++) {
			System.out.println(name[i]);
		}
		//초기화
		name[0] ="kim";
		name[1]	="park";
		name[2] ="yi";
		
		System.out.println(name[0]);
		System.out.println(name[0].charAt(1));
		
		
		String str = "ABCDE";
		System.out.println(str.charAt(3));
		System.out.println(str.charAt(4));
		//문자열(String) 비교 ==(!=) 을 사용하지 않음
		//equals(): 대소문자 그대로 비교,equlasIgnoreCase():대소문자 무시하고 비교
		//대소문자를 무시하냐 안하냐의 차이
		System.out.println(str.equals("abcde"));
		System.out.println(str.equalsIgnoreCase("abcde"));
		
		System.out.println(str.equals("abcde")?"일치함":"일치하지 않음");
		
		if (str=="abcde") {
			System.out.println("일치함");
		}else {
			System.out.println("일치하지 않음");
		}
	}	
	
}
