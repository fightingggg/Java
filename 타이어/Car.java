
public class Car {
	Tire frontLeft;
	Tire frontRight;
	Tire rearLeft;
	Tire rearRight;

	public Car() {
		this.frontLeft = new Tire("frontLeft",6);
		this.frontRight = new Tire("frontRight",2);
		this.rearLeft = new Tire("rearLeft",3);
		this.rearRight = new Tire("rearRight",4);
	}
	int run() {
		System.out.println("Car is driving.");
		if(!frontLeft.roll())  { // 5
			this.stop(); return 1; 
		}
		if(!frontRight.roll()) {  // 1
			this.stop(); return 2;
		}
		if(!rearLeft.roll())   { // 2
			this.stop(); 
			return 3;
		}
		if(!rearRight.roll())  {  // 3
			this.stop(); 
			return 4; 
		}
		return 0;
	}
	void stop() {
		System.out.println("Car stops.");
	}
}
