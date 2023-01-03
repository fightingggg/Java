

public class study {
	public static void main(String[] args) {

	String str = "Good Morning Vietnam";
	String sum ="";
    
   
    for(int i = 19, j =20; j>0; i--,j--) {
//       System.out.print(str.substring(i,j));
       sum+=str.substring(i,j);
    }
    System.out.println(sum);
    
		
// 	String str = "Good Morning Vietnam";
		
		String str1=" ";
		for (int i=0; i<str.length(); i++) {
			str1=str.substring(i,i+1)+str1;
		}
		System.out.println(str1);
		
		








	   
	   
	   
	   
	   
	   
//	   String str7 ="John,Jane,Jame,Jason,Jacob,Johanson,Jefferson";
//	   String[] token = str7.split(",");
//	   
//	   
//	   for(int i=0; i<token.length; i++) {
//		   System.out.println(token[i]);
	   
   }
}
