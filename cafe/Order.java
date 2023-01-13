
import java.util.ArrayList;
import java.util.Scanner;

public class Order {
	// 주문관리
	 ArrayList<String> alName; 	// 메뉴이름
	 ArrayList<Integer> alCount;	// 메뉴수량
	 ArrayList<Integer> alSum;	// 메뉴총액
	 private Menu m;
	 private Scanner s,s1;
	 
	 
	 
	public Order(Menu menu) {
		this.alName = new ArrayList<String>();
		this.alCount = new ArrayList<Integer>();
		this.alSum = new ArrayList<Integer>();
		this.m = menu;
		this.s = new Scanner(System.in);
		this.s1=new Scanner(System.in);
	}
	int getNameSize() {
		return this.alName.size();
	}
	String getName(int i) {
		return this.alName.get(i);
	}
	int getCount(int i) {
		return this.alCount.get(i);
	}
	int getSum(int i) {
		return this.alSum.get(i);
	}
	void build() {
		for(int i=0; i<this.m.getMenuSize(); i++) {
			System.out.println(i+"."+this.m.getMenuName(i)+ " " + this.m.getMenuPrice(i));
		}
		//this.m.display();
		System.out.println("메뉴번호를 입력하시오 [-1:종료]");
		int m_num = this.m.s.nextInt();
		while(m_num!=-1) {
			System.out.println("수량을 입력하시오 [-1 : 종료");
			int qty = this.m.s1.nextInt();
			String name = this.m.alMenu.get(m_num);
			int price = this.m.alPrice.get(m_num);
			
			this.append(name, qty, price);
			
			this.m.display();
			System.out.println("메뉴번호를 입력하시오 [-1: 종료]");
			m_num = this.m.s.nextInt();
		}
		
	}
	void append (String name, int qty, int net){
		this.alName.add(name);
		this.alCount.add(qty);
		this.alSum.add(qty*net);
	}
			
	
	void display() {
		for(int i=0; i<this.alName.size(); i++) {
			System.out.println(i+"."+this.alName.get(i)+" x "+this.alCount.get(i)+ " "
					+this.alSum.get(i));
		}
	}
	
	void remove() {
		this.display();
		System.out.println("삭제할 주문번호를 입력하시오");
		int o_num=this.m.s1.nextInt();
		while(o_num != -1) {
			this.delete(o_num);
			
		
		
		while(true) {
			this.display();
			System.out.println();
			int code = m.s.nextInt();
			if(code == -1 ) break;
			this.alName.remove(code);
			this.alCount.remove(code);
			this.alSum.remove(code);

			}
	}
		
		
	

		
		
		
//		System.out.println(m.alMenu);		
//		int m_num =  this.m.s.nextInt();
//		System.out.println("삭제할 주문 번호 입력");
//		while(m_num!=-1) {
//			System.out.println("삭제할 번호 입력");
//			this.delete(m_num);
//			System.out.println(m_num);
//			m_num = this.m.s.nextInt();
//			
			
			
		}
		
		
		// 주문내역출력
		// 삭제할 주문번호 입력
		// while(주문번호 !=-1){
		      //삭제(delete());
		//주문 내역 출력
		//삭제할 번호 입력
		//}
	
	
	void delete(int order_num) {
		this.alName.remove(order_num);
		this.alCount.remove(order_num);
		this.alSum.remove(order_num);
	}
}
