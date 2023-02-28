package interfaceStudies;

public class 잭 {

	public static void main(String[] args) {
		아이폰잭 아이폰 = new 애플잭();
		애플잭 애플 = new 애플잭();
		바나나잭 바나나 = new 바나나잭();
		아이폰잭 바나나2 = new 바나나잭();
		//플잭 애플2 = new 바나나잭();
		아이폰.납작하게만들다();
		애플.납작하게만들다();
		바나나.납작하게만들다(); 
		바나나2.납작하게만들다();
		//애플2.납작하게만들다();
		
		//익명클래스를 이용해서 인터페이스도 new할 수 있다.
		//의도와는 다르게 단발성으로 구현해주면 
		//그 행위를 하게끔 만들 수있다. 
		아이폰잭 아이폰2 = new 아이폰잭() {

			@Override
			public void 납작하게만들다() {
				// TODO Auto-generated method stub
				
			}

			@Override
			public void 이센치로만들다() {
				// TODO Auto-generated method stub
				
			}
			
		};
	}

}
