package 접근제어자;

public class propubl {

	public static void main(String[] args) {
		직원 work = new 직원();
		work.name = "홍길동";
		work.address = "강남구";
		work.salary = 100;
		work.setRrn(100);
		work.getRrn();
		
		System.out.println(work);
	}

}
