import java.util.ArrayList;
import java.util.Scanner;
import java.util.Scanner;

public class Cafe4 {

   public static void main(String[] args) {
      
      
      System.out.println("��ɾ �Է��Ͻÿ�");
      
System.out.println("��ɾ �Է��Ͻÿ�");
      
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
         System.out.println("m.�޴����� | o.�ֹ����� | s.������� | x.����");
         System.out.println("---------------------------------------------");
         read = s.nextLine();
         if(!(read.equals("x"))) {
            
            if(read.equals("m")){
               String mread = "";
               
               do {
                  System.out.println("----------------------------------------------------");
                  System.out.println("C.�޴��߰� | R.�޴���� ǥ�� | U.�޴����� | D.�޴����� | B.�ڷ�");
                  System.out.println("----------------------------------------------------");
                  
                  // madd : �޴�
                  // maddp: ����
                  
                  
                  mread=s.nextLine();
                  
                  if(mread.equals("C")) {
                     System.out.println("�޴��߰�");
                     System.out.println("B.�ڷ�");
                     madd = s.nextLine();
                        if(madd.equals("B")) {
                           continue;
                           }
                     
                        else {
                           alMenu.add(madd);
                           System.out.println("�����߰�");
                           maddp = s1.nextInt();
                           alPrice.add(maddp);
                           System.out.println(madd+"�� "+maddp+"�� �Դϴ�. ");
                        }
                     
                     
                  }else if(mread.equals("R")) {
                     
                        if(alMenu.size()==0) {
                           System.out.println("�޴� ����� �����ϴ�.");
                           continue;
                        }
                     
                     System.out.println("�޴���� ǥ��");
                     
                        for(i=0; i<alMenu.size(); i++) {
                           System.out.println((i+1)+" �� �޴� "+alMenu.get(i)+" : "+alPrice.get(i));
                        }
                        
                     System.out.println("--------------------------------");
                     
                  }else if(mread.equals("U")) {
                     
                        if(alMenu.size()==0) {
                           System.out.println("������ �޴��� �����ϴ�.");
                           continue;
                        }
                     
                     System.out.println("�޴� ����");
                     
                        for(i=0; i<alMenu.size(); i++) {
                           System.out.println((i+1)+" �� �޴� "+alMenu.get(i)+" : "+alPrice.get(i));
                        }
                     System.out.println("--------------------------------");
                     
                     System.out.println("���� �� �޴��� ��ȣ�� �Է��Ͻÿ�");
                     maddn = s1.nextInt();
                     
                     System.out.println("������ �޴� ��ȣ "+maddn+"���� ���ο� �޴��� �Է��Ͻÿ�");
                     maddr = s.nextLine();
                     
                     System.out.println(maddn+"��"+maddr);
                     System.out.println(maddn+"���� ���ο� �޴��� "+maddr+"�� ������ �Է��Ͻÿ�");
                     maddrp = s1.nextInt();
                     
                     alMenu.set(maddn-1, maddr);
                     alPrice.set(maddn-1, maddrp);
                     
                        
                  }else if(mread.equals("D")) {
                     
                        if(alMenu.size()==0) {
                           System.out.println("������ �޴��� �����ϴ�.");
                           continue;
                        }
                     
                     System.out.println("�޴�����");
                     
                        for(i=0; i<alMenu.size(); i++) {
                           System.out.println((i+1)+" �� �޴� "+alMenu.get(i)+" : "+alPrice.get(i));
                        }
                     System.out.println("--------------------------------");
                     
                     System.out.println("������ �޴��� ��ȣ�� �Է��Ͻÿ�");
                     maddd=s1.nextInt(); // �޴���ȣ
                     
                     alMenu.remove(maddd-1);
                     alPrice.remove(maddd-1);
                     
                     
                  }
               
               } while(!mread.equals("B"));
            }
            
               if(read.equals("o")) {
                  String read1="";
                  do {
                     System.out.println("�ֹ�����");
                     System.out.println("----------------------------------");
                     System.out.println("C.�ֹ��߰� | R.�ֹ�����ǥ�� | D.�ֹ�����| B.�ڷ�");
                     System.out.println("----------------------------------");
                     read1 = s.nextLine();
                     
                     if(read1.equals("C")) {
                        if(alMenu.size()==0) {
                           System.out.println("�ֹ��� �޴��� �����ϴ�.");
                           System.out.println("�޴����� �߰� �ϼ���.");
                           continue;
                        }
                        
                        
                           ndx=0;
                           String ordername="";
                           String test = "";
                           
                           do {
                              for(i=0; i<alMenu.size(); i++) {
                                 System.out.println((i)+" �� �޴� "+alMenu.get(i)+" : "+alPrice.get(i));
                              }
                              System.out.println("--------------------------------");
                              System.out.println("��������"+-1+"�� �Է��Ͻÿ�");
                              System.out.println("---------------------");
                              
                              System.out.println("�ֹ����� �Է��Ͻÿ�");
                              ordername=s.nextLine();
                              
                              if(ordername.equals("-1"))break;
                              
                              System.out.println("�޴���ȣ�� �Է��Ͻÿ�");
                              ndx=s1.nextInt();
                              
                              System.out.println("������ �Է��Ͻÿ�");
                              int count = s1.nextInt();
                              
                              sum=count*alPrice.get(ndx);
                              alName.add(ordername);
                              alCount.add(count);
                              alSum.add(sum);
                              System.out.println("");
                              
                           }while(true);
                        
                     }else if(read1.equals("R")){
                        if(alName.size()==0) {
                           System.out.println("�ֹ������ �����ϴ�.");
                           continue;
                        }
                        for(i=0; i<alName.size(); i++) {
                           
                           System.out.println("�ֹ��̸��� "+alName.get(i));
                           System.out.println("������ "+alCount.get(i));
                           System.out.println("������ "+alSum.get(i));
                           System.out.println("-----------------------");
                           
                        }
                        
                        
                     }else if(read1.equals("D")) {
                        if(alName.size()==0) {
                           System.out.println("���� �ֹ��� �����ϴ�.");
                           continue;
                        }
                        
                           for(i=0; i<alName.size(); i++) {
                              
                              System.out.println("�ֹ��̸��� "+alName.get(i));
                              System.out.println("������ "+alCount.get(i));
                              System.out.println("������ "+alSum.get(i));
                              System.out.println("-----------------------");
                              
                           }
                        System.out.println("��������"+-1+"�� �Է��Ͻÿ�");
                        System.out.println("���� �ֹ��� �̸��� �Է��Ͻÿ�");
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
                              System.out.println("���� �ֹ��� �����ϴ�.");
                              break;
                           }
                           
                              for(i=0; i<alName.size(); i++) {
                                 System.out.println("�ֹ��̸��� "+alName.get(i));
                                 System.out.println("������ "+alCount.get(i));
                                 System.out.println("������ "+alSum.get(i)+" ��");
                                 System.out.println("");
                                 }
                              System.out.println("��������"+-1+"�� �Է��Ͻÿ�");
                              System.out.println("���� �ֹ��� �̸��� �Է��Ͻÿ�");
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
               System.out.println("�������");
               int sumf = 0;
               for(int f = 0; f<alSum.size(); f++) {
                  
                  System.out.println((f+1)+"��° �ֹ� "+alName.get(f)+"�� �Ѿ�: "+alSum.get(f)+"��");
                  sumf+=alSum.get(f);
               }
               System.out.println("---------------------------");
               System.out.println("�ֹ������� �� ���� : "+sumf);
               System.out.println("---------------------------");
            System.out.println("�������");
            }
            System.out.println("��ɾ� ���Է�");
          }
         else {
            break;
            }
      } while(!(read.equals("x")));
      System.out.println("���� �ý��� ����");
   }
}
	