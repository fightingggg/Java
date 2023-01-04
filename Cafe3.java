import java.util.ArrayList;
import java.util.Scanner;

public class Cafe3 {

   public static void main(String[] args) {
      
      
      System.out.println("명령어를 입력하시오");
      
      Scanner s = new Scanner(System.in);
      Scanner s1 = new Scanner(System.in);
      
      String read = "";
      String madd = "";
      String maddr = "";
      int maddp = 0;
      int maddrp = 0;
      int maddn = 0;
      int maddd = 0;
      int i = 0;
      ArrayList<String> alMenu = new ArrayList<String>();
      ArrayList<Integer>alPrice = new ArrayList<Integer>();

      
      do {
         System.out.println("---------------------------------------------");
         System.out.println("m.메뉴관리 | o.주문관리 | s.매출관리 | x.종료");
         System.out.println("---------------------------------------------");
         read = s.nextLine();
         if(!(read.equals("x"))) {
            
            if(read.equals("m")){
               String mread = " ";
               
            do {
               
               if(mread.equals("C")) {
                  
                  System.out.println("메뉴추가");
                  madd = s.nextLine();
                  alMenu.add(madd);
                  System.out.println("가격추가");
                  maddp = s1.nextInt();
                  alPrice.add(maddp);
                  System.out.println(madd+"는 "+maddp+"원 입니다. ");
                  
               }else if(mread.equals("R")) {
                  System.out.println("메뉴목록 표시");
                  for(i=0; i<alMenu.size(); i++) {
                     System.out.println((i+1)+" 번 메뉴 "+alMenu.get(i)+" : "+alPrice.get(i));
                  }
                  
               }else if(mread.equals("U")) {
                  System.out.println("메뉴 수정");
                  for(i=0; i<alMenu.size(); i++) {
                     System.out.println((i+1)+" 번 메뉴 "+alMenu.get(i)+" : "+alPrice.get(i));
                  }
                  System.out.println("수정 할 메뉴의 번호를 입력하시오");
                  maddn = s1.nextInt();
                  System.out.println("수정할 메뉴 번호 "+maddn+"번에 새로운 메뉴명 입력하시오");
                  maddr = s.nextLine();
                  System.out.println(maddn+"번"+maddr);
                  System.out.println(maddn+"번에 새로운 메뉴명 "+maddr+"에 가격을 입력하시오");
                  maddrp = s1.nextInt();
                  alMenu.set(maddn-1, maddr);
                  alPrice.set(maddn-1, maddrp);
                  
                     
               }else if(mread.equals("D")) {
                  System.out.println("메뉴삭제");
                  for(i=0; i<alMenu.size(); i++) {
                     System.out.println((i+1)+" 번 메뉴 "+alMenu.get(i)+" : "+alPrice.get(i));
                  }
                  System.out.println("삭제할 메뉴의 번호를 입력하시오");
                  maddd=s.nextInt();
                  alMenu.remove(maddd-1);
                  alPrice.remove(maddd-1);
                  
               }
               System.out.println("----------------------------------------------------");
               System.out.println("C.메뉴추가 | R.메뉴목록 표시 | U.메뉴수정 | D.메뉴삭제 | B.뒤로");
               System.out.println("----------------------------------------------------");
               mread=s.nextLine();
            }while(!mread.equals("B"));
            }
            if(read.equals("o")) {
            System.out.println("주문관리");
            }
            if(read.equals("s")){
            System.out.println("매출관리");
            }
            System.out.println("메뉴다시입력");
          }
         else {
            break;
            }
      } while(!(read.equals("x")));
      System.out.println("관리 시스템 종료");
   
   }
}
	