package io;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileInputEx6 {

	public static void main(String[] args) {
		
		try (FileInputStream fis = new FileInputStream("C:\\source\\java source\\ch7\\iu.mp4");
				FileOutputStream fos = new FileOutputStream("C:\\source\\java source\\ch7\\love.mp4")){
			
			int data = 0;
			
			long start = System.currentTimeMillis(); // 시작시간
			
			while((data=fis.read())!=-1) {
				
			}
			
			long end = System.currentTimeMillis(); // 종료시간
			System.out.println("InputStream / OutputStream 걸린 시간 " + (end - start)+"ms");
			
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		// BufferedInputStream bis = new BufferedInputStream(new FileInputStream("C:\\source\\java source\\ch7\\iu.mp4"));
		// BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream("C:\\source\\java source\\ch7\\love.mp4"))
		try (FileInputStream fis = new FileInputStream("C:\\source\\java source\\ch7\\iu.mp4");
				BufferedInputStream bis = new BufferedInputStream(fis);
				FileOutputStream fos = new FileOutputStream("C:\\source\\java source\\ch7\\love.mp4");
				BufferedOutputStream bos = new BufferedOutputStream(fos)){
			
			int data = 0;
			
			byte b [] = new byte[8192]; // 8kb
			
			long start = System.currentTimeMillis(); // 시작시간
			
			while((data=fis.read(b))!=-1) {
				bos.write(b);
			}
			
			long end = System.currentTimeMillis(); // 종료시간
			System.out.println("InputStream+Buffered+Byte / OutputStream+Buffered+Byte 걸린 시간 " + (end - start)+"ms");
			
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
