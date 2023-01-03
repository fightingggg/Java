
public class Sort {

	public static void main(String[] args) {
	
      int[] x= {10,5,1,0,3,7,9,50};
//      System.out.println(x[3]);
      int i = 0;
      int j = 0;
      int temp = 0 ;
      for(i=0; i<x.length; i++) {
         for(j=0; j<=i; j++) {
            if(x[i]<x[j]) {
               temp=x[i];
               x[i]=x[j];
               x[j]=temp;
               
            }
            
         }
      }
         
         for(i = 0; i<x.length; i++) {
            System.out.print(x[i]+" ");
         }
         
         
         
      }

   
		
		
		
	}
		
		
	
		
		
		
		
	
//		int [] arNum = {10,5,7,3,0,1,9};
//		
//		
//		for(int i=0; i<arNum.length; i++) {
//			System.out.println(arNum[i]+"");
//			
//		}		
//		//Ascending Sort code
//		// 중첩for문 , if 한개, 두자리 값 교환
//		for (int i=0; i<arNum.length; i++) {
//			System.out.println(arNum[i]+" ");
//		}
//		
//		
//		}
//
//	}
//
//}
