
public class Tire {
	public int maxRound;	// 타이어 최대회전횟수
	public int curRound;	// 타이어의 현재까지 누적회전횟수
	public String location;	// 타이어의 장착위치
	
	public Tire() {}
	public Tire(String loc, int max) {
		this.location=loc;
		this.maxRound=max;
		this.curRound=0;
	}
	public boolean roll() {
		++curRound;
		if(curRound<maxRound) {
			System.out.println(this.location+
				" Tire Left: "+
				(this.maxRound-this.curRound));
			return true;
		} else {	// curRound >=maxRound
			System.out.println(this.location+
				" Tire punk !!!");
			return false;
		}
	}
}
