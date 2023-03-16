package ch7;

import java.util.Scanner;

/*Exception 클래스를 상속받아서 NoExistIdException,WrongPasswordException 작성
 * 
 * 
 * 
 * 
 * 
 * 
 */
public class LoginEx {
	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("아이디 입력 :");
	String id = sc.nextLine();
	System.out.println("비밀번호 입력 :");
	String pwd= sc.nextLine();

		try {
			login(id,pwd);
		} catch (NoExistIdException | WrongPasswordExeption e) {
			e.printStackTrace();
		}
	
	
	}
	
	public static void login(String id, String pwd) throws NoExistIdException, WrongPasswordExeption{
		//id가 blue 와 일치하지 않는다면 NoExistIdException 발생	
		//pwd가 12345와 일치하지 않는다면 WrongPasswordException 발생
			if(!id.equals("blue")){
				throw new NoExistIdException("아이디를 확인해 주세요.");
			}
			if(!pwd.equals("12345")) {
				throw new WrongPasswordExeption("비밀번호를 확인해 주세요.");
			}
		}
		
	}

