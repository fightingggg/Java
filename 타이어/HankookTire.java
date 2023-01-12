
public class HankookTire extends Tire {
	public HankookTire(String loc, int maxRound) {
		super(loc, maxRound);
	}
	@Override
	public boolean roll() {
		++curRound;
		if(curRound<maxRound) {
			System.out.println(this.location+
				" Hankook Tire Left: "+
				(this.maxRound-this.curRound));
			return true;
		} else {	// curRound >=maxRound
			System.out.println(this.location+
				" Hankook Tire punk !!!");
			return false;
		}
	}
}
