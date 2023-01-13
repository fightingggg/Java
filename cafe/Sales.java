import java.util.ArrayList;

public class Sales {
	ArrayList<String> alMobile;
	ArrayList<String> alName;
	ArrayList<Integer> alCount;
	ArrayList<Integer> alSum;

	
	public Sales() {
		this.alMobile = new ArrayList<String>();
		this.alName = new ArrayList<String>();
		this.alCount = new ArrayList<Integer>();
		this.alSum = new ArrayList<Integer>();
	}
	
	public void build(Order order, String mobile) {
		for(int i = 0; i<order.alName.size(); i++) {
			
			this.alMobile.add(mobile);
			this.alName.add(order.getName(i));
			this.alCount.add(order.getCount(i));
			this.alSum.add(order.getSum(i));
			
			
//			this.alMobile.add(mobile);
//			System.out.println(mobile+"입니다");
//			this.alName.add(order.alName.get(i));
//			System.out.println(alName.get(i)+"입니다");
//			this.alCount.add(order.alCount.get(i));
//		    System.out.println(alCount+"입니다");
//			this.alSum.add(order.alSum.get(i));
//			System.out.println(alSum+"입니다.");
		
		
		// for
//		this.alMobile.add(mobile);
//		for (int i =0; i<order.alName.size(); i++ ) {
//			this.alMobile.add(mobile);
//			this.alname.add(order.alName.get(i));
//			this.alCount.add(order.alCount.get(i));
//			this.alSum.add(order.alSum.get(i));
		}
		
	}
	public void getTotal() {
		int total=0;
			for(int sum : this.alSum) {
//				System.out.println(sum);
				total = total+sum;
				}
			System.out.println("총매출액: " +total+"원" );
	}
	
}

