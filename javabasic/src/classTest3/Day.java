package classTest3;

public class Day {
	static int count;
	
	String doing;
	int time;
	String location;
	public Day(String doing, int time, String location) {
		this.doing = doing;
		this.time = time;
		this.location = location;
		count ++;
	}
	
	@Override
	public String toString() {
		return "Day [doing=" + doing + ", time=" + time + ", location=" + location + "]";
	}
	
	
	
}
