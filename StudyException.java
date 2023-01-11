
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


// Exception - > unexpected (기대하지않았던 상황)


// a/b =/ 불능
// a=5
// b=0

// try안에 있는 프로그램은 실행하다가 죽는다
// 시스템이 뻗으면 catch로 간다.
// 뻗으면 exception한 상황을 catch로 뛰면서 운영체제한테 알려준다
// 다 반납한다.
// 다 반납하고 정리한다.

// 예외적인 상황이 발생하면 빨간 메시지를 발생하고 죽는게 아니라
// 예외상황이 발생한 다음에 후처리를 한다.

// syso("e.getMessage());
// - 뭐 때문에 에러가 나는 거를 알려준다.

