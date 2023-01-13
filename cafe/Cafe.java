import java.util.ArrayList;
import java.util.Scanner;

public class Cafe {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);  // for nextLine()
		Scanner s1 = new Scanner(System.in);	// for nextInt()
		
		Menu menu = new Menu();
//		Order order = new Order(menu);
		Sales sales = new Sales();
		
		String job="";
		do {
			System.out.println("카페관리작업을 입력하시오: [m:메뉴관리, o:주문관리, s:매출관리, '':프로그램종료]");
			job=s.nextLine();
			if(job.equals("m")) {
				String mJob="";
				do {
					System.out.println("메뉴작업을 선택하시오: [c:메뉴추가, r:메뉴목록표시, u:메뉴수정, d:메뉴삭제]");
					mJob=s.nextLine();
					if(mJob.equals("c")) {
						menu.build();
					} else if(mJob.equals("r")) {
						menu.display();
					} else if(mJob.equals("u")) {
						menu.modify();
					} else if(mJob.equals("d")) {
						menu.remove();
					}
				} while(!mJob.equals(""));
				menu.save();
			} else if(job.equals("o")) {
				String mJob="";
				Order order = new Order(menu); // Order order;
				do {
					System.out.println("주문작업을 선택하시오: [c:주문추가, r:주문내역표시, d:주문삭제]");
					mJob = s.nextLine();
					if(mJob.equals("c")) {
						
						order.build();		
					} else if(mJob.equals("r")) {
						order.display();
					} else if(mJob.equals("d")) {
						order.remove();
					}
				} while(!mJob.equals(""));
				
				System.out.println("마일리지를 적립할 모바일번호를 입력하세요 ['':적립안함] :");
				String mobile = s.nextLine();
				// 주문내역 -> 매출내역에 추가.
				sales.build(order,mobile);
				
			} else if(job.equals("s")) {
				sales.getTotal();
			}
		} while(!job.equals(""));
		s.close();
		s1.close();
		System.out.println("Program terminated.");
	}
}
