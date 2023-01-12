
public class Study19 {

	public static void main(String[] args) {
		Car car = new Car();
		
		for(int i=1; i<=5; i++) {
			int punkLoc = car.run();
			switch(punkLoc) {
			case 1:
				System.out.println("Replace FrontLeft with HankookTire");
				car.frontLeft = new HankookTire("frontLeft",15);
				// Tire frontLeft = new HankookTire(...);
				break;
			case 2:
				System.out.println("Replace FrontRight with GeumhoTire");
				car.frontRight = new GeumhoTire("frontRight",13);
				break;
			case 3:
				System.out.println("Replace RearLeft with HankookTire");
				car.rearLeft = new HankookTire("rearLeft",14);
				break;
			case 4:
				System.out.println("Replace RearRight with GeumhoTire");
				car.rearRight = new GeumhoTire("rearRight",17);
			}
			System.out.println("------------------------------");
		}

	}

}
