import java.util.ArrayList;
import java.util.Scanner;

public class Printf {

	public static void main(String[] args) {
		

		
		Scanner s = new Scanner(System.in);
		Scanner l = new Scanner(System.in);
		
	
		ArrayList<String> alMenu = new ArrayList<String>();
		// []
		
		String job = "";
		
		do {
			System.out.println("menu / order / sales or exit?");
			// 메뉴관리 들어갈건가, 주문관리 들어갈건가, 판매량관리 들어갈건가, 아니면 끌건가?
			job = l.nextLine();
			
			// 프로그램종료
			
			
			
			// 메뉴관리
			if(job.equals("m")) {
					
				String mjob = "";
				do {
					// 메뉴관리에서 어떤 작업을 할것인가?
					mjob = l.nextLine();
					if(mjob.equals("")){break;}
					// 1. 메뉴보기
					if(mjob.equals("r")) {
						System.out.println("메뉴");
					}
					
					// 2. 메뉴추가
					if(mjob.equals("c")) {
						//추가할 음료의 이름을 입력하세요
						String drink_name = l.nextLine();
						alMenu.add(drink_name);
					}
				
					
					
					// 3. 메뉴수정
					if(mjob.equals("u")) {
						// 바꿀 메뉴의 번호를 입력하세요
						int MenuNumber = s.nextInt();
						// 바꿀 이름을 입력하세요
						String newMenu = l.nextLine();
				    //   0            1
					// [americano, Latte]	
						alMenu.set(MenuNumber, newMenu);
					// [americano, 녹차]
					}
					
					
					// 4. 메뉴삭제
					
					if(mjob.equals("d")) {
						
						int p = s.nextInt();
						alMenu.remove(p);
					}
					
					
					
					
				}while(true);	
			}
			
			
			
			// 주문관리
			// 판매량관리
			
			
			
			
		} while(!job.equals(""));
		
		
		
		System.out.println("program terminated");
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	
		
	}
}
