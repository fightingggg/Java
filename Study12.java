import java.util.ArrayList;
import java.util.Scanner;
public class Study12 {

// 01.02 

	   public static void main(String[] args) {
	      Scanner s = new Scanner (System.in);
	      
	  // Array(�迭) => int [] m = new int[5];
	      ArrayList<Integer> m = new ArrayList<Integer>();
	      
	      System.out.println("Enter a print");
	      int n = s.nextInt();
	      while(n!=-1) {
	    	  m.add(n);	 // ArrayList�� �ϳ� �þ�鼭, ������ �߰�
	    	  System.out.println("Enter a print");
	    	  n = s.nextInt();
	      }
	      
//	      int[] m = new int[5];
//	      int i=0;
//	      int sum=0;
//	      int pp=0;
//	      while(i<m.length) {
//	         System.out.println("�Է��Ͻÿ�");
//	         m[i]=s.nextInt();
//	         sum+=(m[i]);
//	         i++;
//	      }
	      
//	      System.out.println("------------------");
//	      i=0;
	      
//	      while(i<m.length) {
//	         //������ �հ踦 ���� total
//	         System.out.println(m[i]);
//	         
//	         i++;
//	      }
	      
	      System.out.println("-------------------------");
	      int i = 0;
	      int total = 0;
	      while(i<m.size()) {
	    	  System.out.println(m.get(i));
	    	  i++;
	      }
	      
	      i= 0;
	      while(i<m.size()) {
	    	  if(m.get(i)==0) {
	    		  m.remove(i);
	    		  
	    	  }
	    	  i++;
	      }
	      i = 0;
	      while(i<m.size()) {
	    	  System.out.println(m.get(i));
	    	  i++;
	      }
	      
	      System.out.println("----------------");
	      i=0;
	      int total1 = 0;
	      while(i<m.size()) {
	    	  System.out.println(m.get(i));
	    	  total1 = total1+m.get(i);
	    	  i++;
	      }
	      
	      float avg = (float)total1/m.size();
	      System.out.println("average "+avg);
	      System.out.println("���α׷�����.");
	      
	      //������� (����/����) ��� & ���
	     // System.out.println("���α׷�����.");
	   }

	}
	
	

	// Array int[]m = new in[5];
//1. array�� ���� ������ �Ѱ��
// 2. �ϴ� ������ ���� �ְų� ���°� �ȵȴ�. ���� ���������� ����� �����Ͱ� ���� �� �𸥴�. Array�� ��ü �Ҹ��Ѱ� �ʿ��ϴ�
// �׷��� ���°� ArrayList �� ���Դ� ó���� ���������� �� �Ƚ�� ��� ���� ������ �ƴϰ� ������ ���������� ó���ϴ� ���ϱ� �ӵ��� �ʹ� ������
// ��â�⿡�� �� �Ƚ��. �ð��� �������� ��ǻ�Ͱ� �������� �ǹ������� 80���� ���� ��̸� �� �Ⱦ���. 
// 3. 
	
	
	
//	public static void main(String[] args) {
//		Scanner s = new Scanner(System.in);
//		
//		int [] m = new int[5];
//		int i = 0;
//		while(i<m.length) {
//			System.out.println("Enter a point:");
//			m[i]=s.nextInt();
//			i++;
//		}
//		System.out.println("--------------------");
//		i=0;
//		int total=0;
//		while(i<m.length) {
//			System.out.println(m[i]);
//			
//		total=total+m[i];
//			// ������ �հ踦 ���� total =
//			
//			
//			i++;
//		}
//		
//		System.out.println("");
//		total=();
//		// ������� (����/����) ��� & ���
//		System.out.println("program terminated.");
//		
//
//	}
//
//}
