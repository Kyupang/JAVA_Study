package 접근제어자;

public class 직원 {
	public String name; //같은 + 다른 패키지(아무데서나 접근 가능)
	String address; //같은 패키지 접근 가능
	protected int salary; //같은 패티지 + 다른 패키지(상속할때만)
	private int rrn; //이 클래스 안에서만!!
	
	
	public void setRrn(int rrn) {
		this.rrn = rrn;
	}

	public int getRrn() {
		return rrn;
	}

	@Override
	public String toString() {
		return "직원 [name=" + name + ", address=" + address + ", salary=" + salary + ", rrn=" + rrn + "]";
	}
	
	
}
