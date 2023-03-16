package genrics;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

/*
 * 클래스 파일 하나에 여러 개의 클래스를 작성하는 것이 가능
 * 단, public 클래스는 하나만 존재해야 함
 */
class Product{}
class Tv extends Product{}
class Audio extends Product{}


public class GenericsEx2 {
	public static void main(String[] args) {
		ArrayList<Product> productList = new ArrayList<>();
		ArrayList<Tv> tvList = new ArrayList<>();
		// ? : 물음표가 오면 와일드 카드
		//<? extends T> : T와 그 자손들만 가능
		//<? super T> : T와 그 조상들만 가능
		//<?> : 제한 없음. 모든 타입 가능
		
		// <? extends Product> : Product와 그 자손들만 가능
		ArrayList<? extends Product> tvList2 = new ArrayList<Tv>();
		ArrayList<Tv> tvList3 = new ArrayList<>();
		
		// ArrayList<Product> : ArrayList에 Product 타입만 추가
		// 부모 - 자식 관계의 객체들은 부모타입으로 선언된 상태여도 자식 객체를 담는 것이 가능
		productList.add(new Product());
		productList.add(new Tv());
		productList.add(new Audio());
		
		tvList.add(new Tv());
		tvList.add(new Tv());
		tvList.add(new Tv());
		tvList.add(new Tv());
		//tvList.add(new Product())  (x)
		//tvList.add(new Audio());
		
		
		
		
		printAll(productList);
		
		// 지네릭 메서드
//		Collections.sort(list<T> list: 어떤 타입이든 상관없다.(참조타입), Comparator<? super T : T와 그 조상들만 올 수 있다> c);
//		Collections.sort(list<Student> list, Comparator<? super Student> c);
	}

	static void printAll(ArrayList<Product> list) {
		for (Product product : list) {
			System.out.println(product);
		}
	}
}
