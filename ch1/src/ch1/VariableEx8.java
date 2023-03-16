package ch1;

// 형변환 : 강제형변환(casting), 자동형변환(작은 타입을 큰 타입으로 전환)
// boolean(논리)을 제외한 나머지 7개의 기본형은 서로 형변환이 가능
// 정수형을 실수형으로 전환이 가능하다. 같은 4바이트여도 정수형보다는 실수형이 더 크기 때문에 전환이 가능
// 실수형에서 정수형으로 변환이 되는가?
// 자동형 변환 : byte = short, char => int => long => float => double
public class VariableEx8 {
	public static void main(String[] args) {
		int i = 91234567;
		float f = (float)i;
		//큰 타임을 작은 타입에 담을 때 오류가 발생
		// 캐스링(casting) : 바꾸고자 하는 값 앞에서 변경하고자 하는 타입을 꼭 써야 함
		// 캐슬링을 하면 큰 타입을 작은 타입에 넣는 것으로 값이 손실이 된다.
		// 값이 이진수로 저장이 되었다가 다시 십진수로 표현하면서 값이 손실이 난다.
		int i2 = (int)f;
		
		System.out.printf("i=%d\n",i);
		System.out.printf("f=%f i2=%d\n",f,i2);
		
		//자동형변환 : 변경 타입 생략 가능
		byte byteValue = 10;
		int intVal = byteValue;
		System.out.printf("intVal = %d\n",intVal);
		
		
		char charVal = 'a';
		intVal = charVal;
		System.out.printf("intVal = %d\n",intVal);
		System.out.printf("charVal =%c\n",charVal);
		
		//연산을 할 경우 타입이 큰 쪽으로 결과 값이 도출되어야 한다.
		double d = 5.5;
		double result = intVal + d;
		System.out.printf("result =%f\n",result);
		
		//\n : 엔터, \t : tab
		//역슬레쉬(\)는 자체적으로 의미가 있기때문에 2번(ex : \\)을 기입해야 역슬레쉬를 기입할 수 있다.
		System.out.println("abc\tdef");
		System.out.println("abc\\def");
		System.out.println("c:\\");
	}
}
