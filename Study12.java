import java.util.ArrayList;
import java.util.Scanner;
public class Study12 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		ArrayList<Integer> m = new ArrayList<Integer>();
		
		
		while(true) {
			System.out.println("Enter a point!");
			int n = s. nextInt();
			if(n==-1) break;
			if(n==0) {
				System.out.println("Invalid point");
				continue;
			}
			m.add(n);
			
		}
		do {
			System.out.println("Enter a point");
			int n = s.nextInt();
			if(n==1) break;
			if(n==0) {
				System.out.println("Invalid point");
				continue;
			}
		m.add(n);
		}
		while(true);
		
		System.out.println("---------------------------");
		
		int i = 0;
		while(i<m.size()) {   // 사용자가 메소드를 호출 시 데이터를 삽입해주는 역할을 담당합니다
			System.out.println(m.get(i));  // 배열 i[]0 하고 똑같 0하면 첫번째 1하면 2번째 2하면 3번째
			i++;
		}
		System.out.println("Program terminated.");

	}

}
