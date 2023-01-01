import java.util.Scanner;
public class study {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		System.out.println("Enter a job");
		String str = s.nextLine();
		
		while(!str.equals("x")) {
			if(str.equals("m")) {
				System.out.println("Menu management");
			} else if(str.equals("o")) {
				System.out.println("Order Management");
			} else if(str.equals("s")) {
				System.out.println("Sales Management");
			}
			str = s.nextLine();
				
			}
	
		
	
	
		}
     
		   
	


}
