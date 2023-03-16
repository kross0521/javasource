package ch4;


public class WhileEx1 {
	public static void main(String[] args) {
		
		
		int i=0;
		while (i < 10) {
			System.out.println(i+"  ");
			i++;
		}
		
		i = 10;
		while(i >= 1) {
			System.out.println(i+" ");
			i--;
		}
		
		i = 1;
		while (i<=10) {
			System.out.println(i+"");
			i++;
		}
		////////
//		System.out.println();
//		for (int i = 1; i <=10 ; i+=2) {
//			System.out.print(i+"  ");
//		}
//		i =1;
		while (i <=10) {
			System.out.println(i+"  ");
			i+=2;
		}
		
//		System.out.println();
//		for (int i = 0; i < 3; i++) {
//			System.out.println("Hello");
//		}
		i = 0;
		while (i < 3) {
			System.out.println("Hello");
			i++;
		}
		
//		System.out.println();
//		for (int i = 1; i <= 100; i+=2) {
//			System.out.print(i+" ");
//		}
		i = 1;
		while (i <= 100) {
			System.out.println(i+" ");
			i+=2;
		}
		
		
		//sum=1;
		//sum1=sum+2;
		//sum2=sum1+3;
		//......
//		System.out.println();
//		int sum=0;
//		for (int i = 1; i <= 10; i++) {
//			sum=sum+i; // sum+=1;
//		}
//		System.out.println("1~10까지의 합 : "+sum);
//	}
		int sum = 0;
		i = 1;
		while (i <=10) {
			sum=sum+i; // sum+=1;
			i++;
		}
		System.out.println("1~10까지의 합 : "+sum);
	}

}
