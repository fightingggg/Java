import java.util.ArrayList;
import java.util.Scanner;

public class Cafe3 {

   public static void main(String[] args) {
      
      
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
      ArrayList<String> alMenu = new ArrayList<String>();
      ArrayList<Integer>alPrice = new ArrayList<Integer>();

      
      do {
         System.out.println("---------------------------------------------");
         System.out.println("m.�޴����� | o.�ֹ����� | s.������� | x.����");
         System.out.println("---------------------------------------------");
         read = s.nextLine();
         if(!(read.equals("x"))) {
            
            if(read.equals("m")){
               String mread = " ";
               
            do {
               
               if(mread.equals("C")) {
                  
                  System.out.println("�޴��߰�");
                  madd = s.nextLine();
                  alMenu.add(madd);
                  System.out.println("�����߰�");
                  maddp = s1.nextInt();
                  alPrice.add(maddp);
                  System.out.println(madd+"�� "+maddp+"�� �Դϴ�. ");
                  
               }else if(mread.equals("R")) {
                  System.out.println("�޴���� ǥ��");
                  for(i=0; i<alMenu.size(); i++) {
                     System.out.println((i+1)+" �� �޴� "+alMenu.get(i)+" : "+alPrice.get(i));
                  }
                  
               }else if(mread.equals("U")) {
                  System.out.println("�޴� ����");
                  for(i=0; i<alMenu.size(); i++) {
                     System.out.println((i+1)+" �� �޴� "+alMenu.get(i)+" : "+alPrice.get(i));
                  }
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
                  System.out.println("�޴�����");
                  for(i=0; i<alMenu.size(); i++) {
                     System.out.println((i+1)+" �� �޴� "+alMenu.get(i)+" : "+alPrice.get(i));
                  }
                  System.out.println("������ �޴��� ��ȣ�� �Է��Ͻÿ�");
                  maddd=s.nextInt();
                  alMenu.remove(maddd-1);
                  alPrice.remove(maddd-1);
                  
               }
               System.out.println("----------------------------------------------------");
               System.out.println("C.�޴��߰� | R.�޴���� ǥ�� | U.�޴����� | D.�޴����� | B.�ڷ�");
               System.out.println("----------------------------------------------------");
               mread=s.nextLine();
            }while(!mread.equals("B"));
            }
            if(read.equals("o")) {
            System.out.println("�ֹ�����");
            }
            if(read.equals("s")){
            System.out.println("�������");
            }
            System.out.println("�޴��ٽ��Է�");
          }
         else {
            break;
            }
      } while(!(read.equals("x")));
      System.out.println("���� �ý��� ����");
   
   }
}
	