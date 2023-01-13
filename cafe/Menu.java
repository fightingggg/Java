import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class Menu {

	static final float pi = 3.14f;	// 변경할수없는전역변수 실수 3.14f
	 ArrayList<String> alMenu;
	 ArrayList<Integer> alPrice;
	Scanner s, s1;
	
	
	public Menu() {
		this.alMenu = new ArrayList<String>();
		this.alPrice = new ArrayList<Integer>();
		this.s = new Scanner(System.in);
		this.s1 = new Scanner(System.in); // read from console
		
		try {
			Scanner fs = new Scanner(new File ("d://cafe//menu.txt"));
			
		while(fs.hasNext()) {
			String str=fs.next();
			String[] menuitem = str.split(",");
			this.append(menuitem[0], Integer.parseInt(menuitem[1]));
		//	this.alMenu.add(menuitem[0]);
			//this.alPrice.add(menuitem[1]);
		//	this.alPrice.add(Integer.parseInt(menuitem[1]));

			
		
		}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		}
		int getMenuSize() {
			return this.alMenu.size();
		}
		String getMenuName(int i) {
			return this.alMenu.get(i);
			
			
		}
		int getMenuPrice(int i) {
			return this.alPrice.get(i);
		}
		
	
	void save() {
		try {
			
		File f = new File("d:\\cafe\\menu.txt");
		FileWriter fw = new FileWriter(f);
		for(int i =0; i<this.alMenu.size(); i++) {
			String str = this.alMenu.get(i)+ "," + this.alPrice.get(i) + "\n";
					// fw = new FileWriter(f);
					fw.write(str);
		}
		fw.close();
		} catch(IOException e) {
			e.printStackTrace();
		}
	//	Menu.pi = 3.14159f;
	}
	
	void build() {
		System.out.println("메뉴명을 입력하시오:");
		String name = this.s.nextLine();
		while(!name.equals("")) {
			System.out.println("가격을 입력하시오:");
			int price = this.s1.nextInt();
			if(price==-1) break;
			this.append(name, price);
			
			System.out.println("메뉴명을 입력하시오:");
			name = this.s.nextLine();
		}
	}
	void modify() {
		System.out.println("수정할 메뉴번호를 입력하시오 -1 exit:");
		int ndx = this.s1.nextInt();
		while(ndx!=-1) {
			System.out.println("새 메뉴명을 입력하시오 -1 exit  :");
			String name = this.s.nextLine();
			if(name.equals("")) break;
			System.out.println("새 가격을 입력하시오:");
			int price = this.s1.nextInt();
			if(price==-1) break;
			this.update(ndx, name, price);
			
			System.out.println("수정할 메뉴번호를 입력하시오:");
			ndx = s1.nextInt();
		}
	}
	void remove() {
		System.out.println("삭제할 메뉴번호를 입력하시오:");
		int ndx = this.s1.nextInt();
		while(ndx!=-1) {
			this.delete(ndx);
			
			System.out.println("삭제할 메뉴번호를 입력하시오:");
			ndx = this.s1.nextInt();
		}
	}
	// Create
	void append(String name, int price) { // 메뉴,가격 추가
		this.alMenu.add(name);
		this.alPrice.add(price);
	}
	// Read
	void display() {	// 메뉴,가격 리스트 출력
		for(int i=0; i<this.alMenu.size(); i++) {
			System.out.println(i+"."+this.alMenu.get(i)+" "+this.alPrice.get(i)+"원");
		}
	}
	// Update
	void update(int menu_num, String name, int price) {	// 메뉴번호에 새 메뉴명, 새가격으로 수정
		this.alMenu.set(menu_num, name);
		this.alPrice.set(menu_num, price);
	}
	// Delete
	void delete(int menu_num) {	// 메뉴,가격 삭제
		this.alMenu.remove(menu_num);
		this.alPrice.remove(menu_num);
	}
	
}
