
public class Main00 {

	

		   public static void main(String[] args) {
		      int a = 1;
		      int b = 1;
		      int c = 0;
		      
		      int i  = 0;
		      
		      for(; c<1000;) {
		         c=a+b;
		         if(c<1000) {
		         System.out.print("a= "+a+" ");
		         System.out.print("b= "+b+" ");
		         System.out.print("c= "+c+" ");
		         }
		         a=b;
		         b=c;
		         
		         
		         
		         System.out.println("");
		         
		         
		         
		      }

		   }

		}