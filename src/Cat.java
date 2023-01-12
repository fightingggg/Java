
public class Cat implements Behavior {
	
	String name;
	
	public Cat() {
		this.name="고양이";
	}
	
	@Override
	public void sound() {
		System.out.println(this.name+"야옹");
	}

}
