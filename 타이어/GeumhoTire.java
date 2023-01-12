
public class GeumhoTire extends Tire {
	public GeumhoTire(String loc, int maxRound) {
		super(loc, maxRound);
	}
	@Override
	public boolean roll() {
		++curRound;
		if(curRound<maxRound) {
			System.out.println(this.location+
				" Geumho Tire Left: "+
				(this.maxRound-this.curRound));
			return true;
		} else {	// curRound >=maxRound
			System.out.println(this.location+
				" Geumho Tire punk !!!");
			return false;
		}
	}
}
