package io;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

/*
 * 직렬화(Serialization)
 * 객체를 데이터 스트림으로 만드는 것 => 객체에 저장된 데이터를 스트림에 쓰기 위해 연속적인 데이터로 변환
 * 
 * 역직렬화(deserialization)
 * 스트림으로부터 데이터를 읽어서 객체를 만드는 것
 * 
 */
public class SerializationEx1 {
	public static void main(String[] args) {
//		person p1 = new person("김유신", "엔지니어");
//		person p2 = new person("이순신", "선생님");
//		// 직렬화 된 객체 => 역직렬화(ObjectInputStream)
//		try (FileInputStream fos = new FileInputStream("c:\\ch7\\serial.dat");
//			BufferedInputStream bos = new BufferedInputStream(fos);
//			ObjectInputStream oos = new ObjectInputStream(bos)){
//		
//			for(int i=0; i<2; i++) {
//				person p = (person) oos.readObject();
//				System.out.println(p);
//			}
//		
//		
//		
//		} catch (Exception e) {
//			e.printStackTrace();
//		}
		
		person p1 = new person("김유신", "엔지니어");
		person p2 = new person("이순신", "선생님");
		// 직렬화 된 객체 => 역직렬화(ObjectInputStream)
		try (FileInputStream fos = new FileInputStream("c:\\ch7\\serial.dat");
			BufferedInputStream bos = new BufferedInputStream(fos);
			ObjectInputStream oos = new ObjectInputStream(bos)){
		
			for(int i=0; i<2; i++) {
				person p = (person) oos.readObject();
				System.out.println(p);
			}
		
		
		
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}

}
