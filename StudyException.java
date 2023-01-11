
public class StudyException {

	public static void main(String[] args) {
		
		int a =5;
		int b =0;
		
		try {
		float x = a/b;
		System.out.println("x=" +x);
	} catch(Exception e) {
		System.out.println("Exception occurred");
		System.out.println(e.getMessage());

}
		System.out.println(("Program terminated"));
}
}