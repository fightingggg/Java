import java.util.ArrayList;
import java.util.Scanner;
import java.util.Scanner;

public class Cafe4 {

   public static void main(String[] args) {
      
      
      System.out.println("명령어를 입력하시오");
      
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
      int ndx = 0;
      int sum = 0;
      ArrayList<String> alMenu = new ArrayList<String>();
      ArrayList<Integer>alPrice = new ArrayList<Integer>();
      ArrayList<String>alName = new ArrayList<String>();
      ArrayList<Integer>alCount = new ArrayList<Integer>();
      ArrayList<Integer>alSum = new ArrayList<Integer>();

      
      do {
         System.out.println("---------------------------------------------");
         System.out.println("m.메뉴관리 | o.주문관리 | s.매출관리 | x.종료");
         System.out.println("---------------------------------------------");
         read = s.nextLine();
         if(!(read.equals("x"))) {
            
            if(read.equals("m")){
               String mread = "";
               
               do {
                  System.out.println("----------------------------------------------------");
                  System.out.println("C.메뉴추가 | R.메뉴목록 표시 | U.메뉴수정 | D.메뉴삭제 | B.뒤로");
                  System.out.println("----------------------------------------------------");
                  
                  // madd : 메뉴
                  // maddp: 가격
                  
                  
                  mread=s.nextLine();
                  
                  if(mread.equals("C")) {
                     System.out.println("메뉴추가");
                     System.out.println("B.뒤로");
                     madd = s.nextLine();
                        if(madd.equals("B")) {
                           continue;
                           }
                     
                        else {
                           alMenu.add(madd);
                           System.out.println("가격추가");
                           maddp = s1.nextInt();
                           alPrice.add(maddp);
                           System.out.println(madd+"는 "+maddp+"원 입니다. ");
                        }
                     
                     
                  }else if(mread.equals("R")) {
                     
                        if(alMenu.size()==0) {
                           System.out.println("메뉴 목록이 없습니다.");
                           continue;
                        }
                     
                     System.out.println("메뉴목록 표시");
                     
                        for(i=0; i<alMenu.size(); i++) {
                           System.out.println((i+1)+" 번 메뉴 "+alMenu.get(i)+" : "+alPrice.get(i));
                        }
                        
                     System.out.println("--------------------------------");
                     
                  }else if(mread.equals("U")) {
                     
                        if(alMenu.size()==0) {
                           System.out.println("수정할 메뉴가 없습니다.");
                           continue;
                        }
                     
                     System.out.println("메뉴 수정");
                     
                        for(i=0; i<alMenu.size(); i++) {
                           System.out.println((i+1)+" 번 메뉴 "+alMenu.get(i)+" : "+alPrice.get(i));
                        }
                     System.out.println("--------------------------------");
                     
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
                     
                        if(alMenu.size()==0) {
                           System.out.println("삭제할 메뉴가 없습니다.");
                           continue;
                        }
                     
                     System.out.println("메뉴삭제");
                     
                        for(i=0; i<alMenu.size(); i++) {
                           System.out.println((i+1)+" 번 메뉴 "+alMenu.get(i)+" : "+alPrice.get(i));
                        }
                     System.out.println("--------------------------------");
                     
                     System.out.println("삭제할 메뉴의 번호를 입력하시오");
                     maddd=s1.nextInt(); // 메뉴번호
                     
                     alMenu.remove(maddd-1);
                     alPrice.remove(maddd-1);
                     
                     
                  }
               
               } while(!mread.equals("B"));
            }
            
               if(read.equals("o")) {
                  String read1="";
                  do {
                     System.out.println("주문관리");
                     System.out.println("----------------------------------");
                     System.out.println("C.주문추가 | R.주문내역표시 | D.주문삭제| B.뒤로");
                     System.out.println("----------------------------------");
                     read1 = s.nextLine();
                     
                     if(read1.equals("C")) {
                        if(alMenu.size()==0) {
                           System.out.println("주문할 메뉴가 없습니다.");
                           System.out.println("메뉴부터 추가 하세요.");
                           continue;
                        }
                        
                        
                           ndx=0;
                           String ordername="";
                           String test = "";
                           
                           do {
                              for(i=0; i<alMenu.size(); i++) {
                                 System.out.println((i)+" 번 메뉴 "+alMenu.get(i)+" : "+alPrice.get(i));
                              }
                              System.out.println("--------------------------------");
                              System.out.println("나갈려면"+-1+"을 입력하시오");
                              System.out.println("---------------------");
                              
                              System.out.println("주문명을 입력하시오");
                              ordername=s.nextLine();
                              
                              if(ordername.equals("-1"))break;
                              
                              System.out.println("메뉴번호를 입력하시오");
                              ndx=s1.nextInt();
                              
                              System.out.println("수량을 입력하시오");
                              int count = s1.nextInt();
                              
                              sum=count*alPrice.get(ndx);
                              alName.add(ordername);
                              alCount.add(count);
                              alSum.add(sum);
                              System.out.println("");
                              
                           }while(true);
                        
                     }else if(read1.equals("R")){
                        if(alName.size()==0) {
                           System.out.println("주문목록이 없습니다.");
                           continue;
                        }
                        for(i=0; i<alName.size(); i++) {
                           
                           System.out.println("주문이름은 "+alName.get(i));
                           System.out.println("수량은 "+alCount.get(i));
                           System.out.println("총합은 "+alSum.get(i));
                           System.out.println("-----------------------");
                           
                        }
                        
                        
                     }else if(read1.equals("D")) {
                        if(alName.size()==0) {
                           System.out.println("지울 주문이 없습니다.");
                           continue;
                        }
                        
                           for(i=0; i<alName.size(); i++) {
                              
                              System.out.println("주문이름은 "+alName.get(i));
                              System.out.println("수량은 "+alCount.get(i));
                              System.out.println("총합은 "+alSum.get(i));
                              System.out.println("-----------------------");
                              
                           }
                        System.out.println("나갈려면"+-1+"을 입력하시오");
                        System.out.println("지울 주문의 이를을 입력하시오");
                        System.out.println("-----------------------");
                        String ndxname=s.nextLine();
                        
                        int d;
                        for(d=0; d<alName.size(); d++) {
                           
                           if(alName.get(d).equals(ndxname)) {
                              break;
                           }
                        }
                        
                        while(!ndxname.equals("-1")) {
                           
                           
                           alName.remove(d);
                           alCount.remove(d);
                           alSum.remove(d);
                           if(alName.size()==0) {
                              System.out.println("지울 주문이 없습니다.");
                              break;
                           }
                           
                              for(i=0; i<alName.size(); i++) {
                                 System.out.println("주문이름은 "+alName.get(i));
                                 System.out.println("수량은 "+alCount.get(i));
                                 System.out.println("총합은 "+alSum.get(i)+" 원");
                                 System.out.println("");
                                 }
                              System.out.println("나갈려면"+-1+"을 입력하시오");
                              System.out.println("지울 주문의 이를을 입력하시오");
                              System.out.println("-----------------------");
                              ndxname=s.nextLine();
                              
                              
                              for(d=0; d<alName.size(); d++) {
                                 
                                 if(alName.get(d).equals(ndxname)) {
                                    break;
                                 }
                              }
                           
                        }
   
                     }
                        
                     }while(!read1.equals("B"));
                  
                  }
           
            
            if(read.equals("s")){
               System.out.println("매출관리");
               int sumf = 0;
               for(int f = 0; f<alSum.size(); f++) {
                  
                  System.out.println((f+1)+"번째 주문 "+alName.get(f)+"의 총액: "+alSum.get(f)+"원");
                  sumf+=alSum.get(f);
               }
               System.out.println("---------------------------");
               System.out.println("주문내역의 총 매출 : "+sumf);
               System.out.println("---------------------------");
            System.out.println("매출관리");
            }
            System.out.println("명령어 재입력");
          }
         else {
            break;
            }
      } while(!(read.equals("x")));
      System.out.println("관리 시스템 종료");
   }
}
	