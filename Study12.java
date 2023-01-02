import java.util.ArrayList;
import java.util.Scanner;
public class Study12 {

// 01.02 

	   public static void main(String[] args) {
	      Scanner s = new Scanner (System.in);
	      
	  // Array(배열) => int [] m = new int[5];
	      ArrayList<Integer> m = new ArrayList<Integer>();
	      
	      System.out.println("Enter a print");
	      int n = s.nextInt();
	      while(n!=-1) {
	    	  m.add(n);	 // ArrayList가 하나 늘어나면서, 새값을 추가
	    	  System.out.println("Enter a print");
	    	  n = s.nextInt();
	      }
	      
//	      int[] m = new int[5];
//	      int i=0;
//	      int sum=0;
//	      int pp=0;
//	      while(i<m.length) {
//	         System.out.println("입력하시오");
//	         m[i]=s.nextInt();
//	         sum+=(m[i]);
//	         i++;
//	      }
	      
//	      System.out.println("------------------");
//	      i=0;
	      
//	      while(i<m.length) {
//	         //점수의 합계를 누적 total
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
	      System.out.println("프로그램종료.");
	      
	      //평균점수 (총합/갯수) 계산 & 출력
	     // System.out.println("프로그램종료.");
	   }

	}
	
	

	// Array int[]m = new in[5];
//1. array는 길이 고정이 한계다
// 2. 일단 넣으면 값을 넣거나 빼는게 안된다. 실제 업무에서는 몇명의 데이터가 들어갈지 잘 모른다. Array를 대체 할만한게 필요하다
// 그래서 나온게 ArrayList 가 나왔다 처음에 나왔을떄는 잘 안썼다 얘는 길이 고정도 아니고 단점이 내부적으로 처리하다 보니까 속도가 너무 느리다
// 초창기에는 잘 안썼다. 시간이 지날수록 컴퓨터가 좋아져서 실무에서는 80프로 정도 어레이를 잘 안쓴다. 
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
//			// 점수의 합계를 누적 total =
//			
//			
//			i++;
//		}
//		
//		System.out.println("");
//		total=();
//		// 평균점수 (총합/갯수) 계산 & 출력
//		System.out.println("program terminated.");
//		
//
//	}
//
//}
