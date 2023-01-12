

public interface Behavior {
	abstract void sound();
	default void run() { //인터페이스의 default 메소드 = 일반 클래스 일반 메소드
		System.out.println("달린다");
		
		
		
		
		
	};
	}