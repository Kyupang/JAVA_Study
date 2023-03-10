package hashcode;

public class EqualsTest {
	public static void main(String[] args) throws CloneNotSupportedException {
		//스트링쪽에서는 오버라이딩을 한 결과 떄문에 같다고 나오는 것이고
		//객체를 비교할 때는 내가 원하는 객체의 매개변수마다 같은지 오버라이딩을 해줘야한다.
		
		Student s1 = new Student(100, "Kim");
		Student s2 = new Student(100, "Lee");
		
		System.out.println(s1==s2);
		System.out.println(s1.equals(s2));
		
		//해쉬코드 또한 같게 만들어줬지만 
		// 그렇다고 해서 실제 해쉬코드가 사라진건 아니다. 
		// 구웃~~ 
		System.out.println(System.identityHashCode(s1));
		System.out.println(System.identityHashCode(s2));
		
		System.out.println(s1.hashCode());
		System.out.println(s2.hashCode());
		
		//클론은 쉘로우카피 s1의 이름을 바꾸면 s3의 이름도 바뀜 
		Student cloneS3 = (Student)s1.clone();
		System.out.println(cloneS3);
	}
	
	
}
