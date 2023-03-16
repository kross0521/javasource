package shop;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

// 배열로 선언된 부분 => ArrayList로 변경(프로그램 수)

public class MyShop implements IShop{
	//쇼핑몰 이름
	private String title;
	//user 정보 저장 배열'
	ArrayList<User> users = new ArrayList<>();
//	list.add(new users("홍길동",paytype.CARD));
//	list.add(new users("성춘향",paytype.CASH));
	//product 정보 저장 배열
	ArrayList<Product> products = new ArrayList<>();
//	list1.add(new Product("홍길동", "hong123", "hong123"));
//	list1.add(new Product("고길동", "kong123", "kong123"));
//	list1.add(new product("성춘향", "song123", "song123"));
//	list1.add(new product("강감찬", "kong123", "kong123"));
//	list1.add(new product("송혜교", "tong123", "tong123"));

	//구매한 제품을 저장 배열(cart)
	ArrayList<Product> carts = new ArrayList<>();
	// 선택된 유저 저장하기
	private int selUser;
	
	Scanner sc = new Scanner(System.in);
	
	@Override
	public void setTitle(String title) {
		this.title = title;
	}

	@Override
	public void genUser() {
		users.add(new User("홍길동",PayType.CARD));
		users.add(new User("성춘향",PayType.CASH));
		//User 2명 생성 후 배열에 저장
	}
	@Override
	public void genProduct() {
		//Product 4개(Cellphone 2개랑 , SmartTv 2개) 생성 후  배열에 저장
		products.add(new Cellphone("갤럭시S23", 130, "kt"));
		products.add(new Cellphone("아이폰pro13", 210, "LG U+"));
		products.add(new SmartTv("스마트삼성TV32인치", 50, "4K"));
		products.add(new SmartTv("LG롤러블TV60인치", 1500, "FHD"));
		
	}
	
	
	@Override
	public void start() {
		System.out.println(title + " : 메인화면 - 계정 선택");
		System.out.println("=========================================");

		for (int i = 0; i < users.size(); i++) {
			User user = users.get(i);
			System.out.printf("[%d] %s(%s)\n",i++,user.getName(),user.getPayType());
		}

			
			
			
		System.out.println("[x] 종 료");
		System.out.println("선택 : ");
		String sel = sc.nextLine();
		System.out.println("## "+sel+" 선택 ##");
		System.out.println();
		
		//  0,1 => productList() 호출
		//  다른걸 입력 시 => 메뉴를 확인해 주세요
		switch (sel) {
		case "x" : case "X" :
			System.exit(0); //프로그램 종료
			break;
		case "0" : case "1" :
			selUser = Integer.parseInt(sel);
			productList();
			break;
	
		default:
			System.out.println("메뉴를 확인해 주세요.\n");
			start();
			break;
		} 
	}
	public void productList() {
		System.out.println(title + " : 상품 목록 - 상품 선택");
		System.out.println("=========================================");
		int i = 0;
		for (Product product : products) {
			System.out.printf("[%d]",i++);
			product.printDetail();
			product.printExtra();
			//productList();
		}
		
		System.out.println("[h] 메인 화면");
		System.out.println("[c] 체크 아웃");
		System.out.println("선택 : ");
		String List = sc.nextLine();
		System.out.println("## "+List+" 선택 ##");
		// 상품선택 0~3
		// h ==> start 메소드 호출 , c ==> checkOut()호출
		System.out.println();
		
		switch (List) {
		case "0": case "1": case "2": case "3":
			for (Product cart : carts) {
				if (cart == null) {
					carts.add(products.get(Integer.parseInt(List)));
					break;
				}
			}
			
			productList();
			break;
		case "h" : case "H" :
			start();
			break;
		case "c" : case "C" :
			checkOut();
			break;
		default :
			System.out.println("입력값을 확인해 주세요");
			productList();
			break;
		}
	}
		public void checkOut() {
		System.out.printf("MyShop : 체크아웃");
		System.out.println("===============================");
		int total = 0;
		int i = 0;
		for (Product cart : carts) {
			if (carts != null) {
				System.out.printf("[%d] %s(%d)\n",i++,cart.getName(),cart.getPrice());
				total += cart.getPrice();
			}
		}
			System.out.println("===========================================");
			System.out.println("결제 방법 : "+users.get(selUser).getPayType());
			System.out.println("결제 금액 : "+total);			
			System.out.println("[p] 이전, [q] 결제완료");
			System.out.println("선택 : ");
			String sel = sc.nextLine();
			
			switch (sel) {
			case "p":
				productList();
				break;
			case "q":
				System.out.println("결제가 완료되었습니다.");
				System.exit(0);
				break;
			default:
				checkOut();
				break;
			}
		}
		
}
