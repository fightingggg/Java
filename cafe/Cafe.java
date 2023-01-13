import java.util.ArrayList;
import java.util.Scanner;

public class Cafe {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);  // for nextLine()
		Scanner s1 = new Scanner(System.in);	// for nextInt()
		
		Menu menu = new Menu();
//		Order order = new Order(menu);
		Sales sales = new Sales();
		
		String job="";
		do {
			System.out.println("ī������۾��� �Է��Ͻÿ�: [m:�޴�����, o:�ֹ�����, s:�������, '':���α׷�����]");
			job=s.nextLine();
			if(job.equals("m")) {
				String mJob="";
				do {
					System.out.println("�޴��۾��� �����Ͻÿ�: [c:�޴��߰�, r:�޴����ǥ��, u:�޴�����, d:�޴�����]");
					mJob=s.nextLine();
					if(mJob.equals("c")) {
						menu.build();
					} else if(mJob.equals("r")) {
						menu.display();
					} else if(mJob.equals("u")) {
						menu.modify();
					} else if(mJob.equals("d")) {
						menu.remove();
					}
				} while(!mJob.equals(""));
				menu.save();
			} else if(job.equals("o")) {
				String mJob="";
				Order order = new Order(menu); // Order order;
				do {
					System.out.println("�ֹ��۾��� �����Ͻÿ�: [c:�ֹ��߰�, r:�ֹ�����ǥ��, d:�ֹ�����]");
					mJob = s.nextLine();
					if(mJob.equals("c")) {
						
						order.build();		
					} else if(mJob.equals("r")) {
						order.display();
					} else if(mJob.equals("d")) {
						order.remove();
					}
				} while(!mJob.equals(""));
				
				System.out.println("���ϸ����� ������ ����Ϲ�ȣ�� �Է��ϼ��� ['':��������] :");
				String mobile = s.nextLine();
				// �ֹ����� -> ���⳻���� �߰�.
				sales.build(order,mobile);
				
			} else if(job.equals("s")) {
				sales.getTotal();
			}
		} while(!job.equals(""));
		s.close();
		s1.close();
		System.out.println("Program terminated.");
	}
}
