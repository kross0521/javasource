package collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

public class SetEx2 {

	public static void main(String[] args) {
		Set<Integer> set = new HashSet<>();
		
		for (int i = 0; set.size() < 6; i++) {
			int num = (int)(Math.random()*45)+1;
			set.add(num);
		}
		System.out.println(set);
		
		// sort(List<T> list)  : List 인터페이스가 처리 가능한 객체가 들어와야 한다.
		// ArrayList, LinkedList, Stack, Queue, Vector
		//Collections.sort(set); // ==> 해결법 : set을 List로 바꿔주면 된다.
		
		// set ->list
		List<Integer> list = new ArrayList<>(set);
		Collections.sort(list);
		System.out.println("정렬 후 "+list);
	}

}
