import java.util.Scanner;

public class aaaaaa {

	public static void main(String[] args) {
		
Scanner s = new Scanner (System.in);
		
		int[] m = new int[3];
		int i=0;
		int sum=0;
		int pp=0;
		
		while(i<m.length) {
			System.out.println("입력하시오");
			m[i]=s.nextInt();
			sum+=(m[i]);
			i++;
		}
		
		System.out.println("------------------");
		i=0;
		
		while(i<m.length) {
			//점수의 합계를 누적
			System.out.println(m[i]);
			
			i++;
		}
		System.out.println("총합 "+sum);
		System.out.println("평균은 "+(sum/(m.length)));
		
		//평균점수 계산
		System.out.println("프로그램종료.");


	}

}
