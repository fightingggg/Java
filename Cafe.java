import java.util.ArrayList;
import java.util.Scanner;

public class Cafe {

	public static void main(String[] args) {
		
		
		String JOB = "";
		
		do {
			JOB="a";
		}while(JOB.equals(""));
		
		System.out.println(JOB);
		
		
		Scanner s = new Scanner(System.in);
		Scanner l = new Scanner(System.in);
		// 객체 지향 들어가기전에 프로그램 한번 만들어보자.
		
		// Study10 폴더에 cafe.java 가보자.
		
		
		ArrayList<String> alMenu = new ArrayList<String>(); // 여기는 메뉴리스트가 들어감
		ArrayList<Integer> alPrice = new ArrayList<Integer>();  // 메뉴에 해당하는 값이 들어감
		
		ArrayList<String> alName = new ArrayList<String>(); // 여기는 주문리스트가 들어감
		ArrayList<Integer> alCount = new ArrayList<Integer>();
		ArrayList<Integer> alSum = new ArrayList<Integer>();
		
		
		String job = "";
		
		
		do {
			System.out.println("Enter a job: [m:Menu, o:Order, s:salse]");
			System.out.println("or press the 'Enter key' to terminate this program.");
			
			job = l.nextLine();
			
			
			// 메뉴관리
			if(job.equals("m")){
				String mJob = "";
				
				do { 
					 System.out.println("choose a job for Menu management \n");
					 System.out.println("r to read a menu list");
					 System.out.println("c to create a new menu");
					 System.out.println("u for an update a menu list");
					 System.out.println("d to delete a menu");
					 System.out.println("'Enter key' for exit ");
					
					 mJob = l.nextLine();
					 
					 if(mJob.equals("r")) {		
						 System.out.println("Menu list:");
						 System.out.println("-------------------------------------");
						 
						 for(int i=0; i<alMenu.size() ;i++) {
							 System.out.println(i +"\t"+ alMenu.get(i) + ":" + alPrice.get(i)  );	 
						 }
						 
						 System.out.println("-------------------------------------");
					 }
					 
					 if(mJob.equals("c")) {  // else if 쓰면 안좋음!!! do바깥의 큰 if의 else if 로 인식할 수도 있음
						 
						 System.out.println("name of the new menu : ");
						 String newName = l.nextLine();
						 System.out.println("price of the new menu : ");
						 int newPrice = s.nextInt();
						 
						 alMenu.add(newName);
						 alPrice.add(newPrice);
						 
						 System.out.println("updated menu list:");
						 System.out.println("-------------------------------------");
						 
						 for(int i=0; i<alMenu.size() ;i++) {
							 System.out.println(i +"\t"+ alMenu.get(i) + ":" + alPrice.get(i)  );	 
						 }
						 
						 System.out.println("-------------------------------------");
					 }
					 
					 if(mJob.equals("u")) {
						 System.out.println("the number of the menu to upate:");
						 int i = s.nextInt();
						 System.out.println("new name of the menu to upate:");
						 String newName = l.nextLine();
						 System.out.println("new price of the menu to upate:");
						 int newPrice = s.nextInt();
						 
						 alMenu.set(i,newName);
						 alPrice.set(i,newPrice);
						 
						 System.out.println("updated menu list:");
						 System.out.println("-------------------------------------");
						 
						 for(i=0; i<alMenu.size() ;i++) {
							 System.out.println(i +"\t"+ alMenu.get(i) + ":" + alPrice.get(i)  );	 
						 }
						 
						 System.out.println("-------------------------------------");
					 } 
					 
					 if(mJob.equals("d")) {
						 System.out.println("the number of the menu to delete:");
						 int i = s.nextInt();
						 
						 alMenu.remove(i);
						 alPrice.remove(i);
						 
						 System.out.println("updated menu list:");
						 System.out.println("-------------------------------------");
						 
						 for(i=0; i<alMenu.size() ;i++) {
							 System.out.println(i +"\t"+ alMenu.get(i) + ":" + alPrice.get(i)  );	 
						 }
						 
						 System.out.println("-------------------------------------");
						 
					 }
					
					
				} while(!mJob.equals("") ); // 여기까지 메뉴관리

				
				
				
				
				
				// 주문관리
			} else if(job.equals("o")) {

				
				String oJob = "";
				
				do {
					 System.out.println("choose a job for Order management \n");
					 System.out.println("r to read an order list");
					 System.out.println("c to register a new order");
					 System.out.println("d to delete an order");
					 System.out.println("'Enter key' for exit ");
					
					 oJob = l.nextLine();
					
					// 주문목록 보기
					if(oJob.equals("r")) {
						 System.out.println("order list:");
						 System.out.println("-------------------------------------");
						 
						 for(int i=0; i<alName.size() ;i++) {
							 System.out.println(i +"\t"+ alName.get(i) + "\t" + alCount.get(i) + "\t" + alSum.get(i)  );	 
						 }
						 
						 System.out.println("-------------------------------------");	
					}
					
					// 주문등록
					if(oJob.equals("c")) {
						while(true) {
						 System.out.println("Menu list:");
						 System.out.println("-------------------------------------");
						 System.out.println(-1 +"\t" + "exit");
						 for(int i=0; i<alMenu.size() ;i++) {
							 System.out.println(i +"\t"+ alMenu.get(i) + ":" + alPrice.get(i)  );	 
						 }	 
						 System.out.println("-------------------------------------");
						
						 // 위에는 메뉴리스트, 아래는 order 등록과정
						 System.out.println("Enter the number of the menu to add to an order list");
						 
						 int i = s.nextInt();
						 if(i==-1){break;}
						 alName.add( alMenu.get(i)  );
						 
						 System.out.println("Enter the amounts of the order");
						 int j = s.nextInt();
						 alCount.add(j);
						 alSum.add(alPrice.get(i)*j);
						
						 
						 
						 System.out.println("updated order list:");
						 System.out.println("-------------------------------------");
						 
						 for(i=0; i<alName.size() ;i++) {
							 System.out.println(i +"\t"+ alName.get(i) + "\t" + alCount.get(i) + "\t" + alSum.get(i)  );	 
						 }
						 
						 System.out.println("-------------------------------------");	
					}
					}
					
					if(oJob.equals("d")) {
						
						while(true){
						 System.out.println("order list:");
						 System.out.println("-------------------------------------");
						 
						 System.out.println(-1 + "\t" + "exit");
						 
						 for(int i=0; i<alName.size() ;i++) {
							 System.out.println(i +"\t"+ alName.get(i) + "\t" + alCount.get(i) + "\t" + alSum.get(i)  );	 
						 }
						 
						 System.out.println("-------------------------------------");	
					    
					    
					    
					    System.out.println("Enter the number of the order to delete");
					    int i = s.nextInt();
					    if(i==-1){break;}
					    alName.remove(i);
					    alCount.remove(i);
					    alSum.remove(i);
						
						 System.out.println("updated order list:");
						 System.out.println("-------------------------------------");
						 
						 for(i=0; i<alName.size() ;i++) {
							 System.out.println(i +"\t"+ alName.get(i) + "\t" + alCount.get(i) + "\t" + alSum.get(i)  );	 
						 }
						 
						 System.out.println("-------------------------------------");	
					
					
					}
					}
					
				}while(!oJob.equals("")); // 여기까지 주문관리
				
				
				
				
				
				
				
			} else if(job.equals("s")) {
				System.out.println("Sales management");
			}
			
		} while(!job.equals(""));
		
		
		s.close();   // 이건 프로그램 다 끝나고 쓰면 좋은거.
		l.close();
		System.out.println("Program terminated");
		
		
		
		
		
		
		
		
		
		
		
		
		
		// Menu management 속에
		// 메뉴를 만듬
// 4가지 작업 : 기존의 메뉴리스트 가져옴(read, 조회) / create(추가, 생성) / delete(필요없는걸 지움) / update(수정, 가격수정/옵션추가)
		
		// Order Management 속에
		// create / read / update / delete(잘못주문시 삭제)
		
		// crud 라고 함 앞글자만따서.
		// 할 수 있는 모든 동작을 의미. 기본적으로 컴퓨터에서 할 수 있는 동작은 이 4개중에 하나임.
		
		// garbage collection 사용하던 변수를 더 이상 안쓰면 알아서 삭제되야함. 
		// java 에선 자동으로 해주는데 c나 c++ 에선 자동으로 안해줌.
		
		
		
//		String mjob="";
//		do {
//		
//			 메뉴작업을 선택하시오(sysoutprintln("Enter a job: [C:, R:, U:] D:")
//			 작업문자열을 읽어들인다
//			 C : 메뉴추가
//			 	메뉴명(alMenu.add())
//			 	메뉴가격(alPrice.add())
//			 R : 메뉴목록 표시             >> for문돌려서.. 
//			 	// for문에서 alMenu.get(i), alPrice.get(i)
//			 U : 메뉴수정
//			 	// 메뉴번호, 새 메뉴명, 새 가격을 입력받는다.
//			 	// alMenu.set(인덱스번호, 새 메뉴명)
//			 	// alPrice.set(인덱스번호, 새 가격)
//			 D : 메뉴삭제
//			 	// 메뉴번호입력받음
//			 	// alMenu.remove(인덱스번호)
//			    // alPrice.remove(메뉴번호)
//		
//		} while(!mJob.equals(""));
//		
//		이런식으로 
//		 여기까지가 젤 어려움. 여기가지만 해보셈.
		
		
		
		
		
		
		
		
		

	}
}
