import java.util.Arrays;

public class study {

   public static void main(String[] args) {
  

	   String str7 ="John,Jane,Jame,Jason,Jacob,Johanson,Jefferson";
	   String[] token = str7.split(",");
	   
	   System.out.println(Arrays.toString(token));
	   
	   
	   for(int i=0; i<token.length; i++) {
		   System.out.println(token[i]);
	   }
   }
}
