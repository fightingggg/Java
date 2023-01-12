
public class Dog implements Behavior {
	String name;
	
	public Dog() {
		this.name="강아지";
	}
	@Override
	public void sound() {
		System.out.println(this.name+"멍멍");
	}

}
