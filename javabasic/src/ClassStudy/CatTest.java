package ClassStudy;

public class CatTest {

	public static void main(String[] args) {
		Cat navi = new Cat("근엄한냥이",3);
		navi.showCatInfo();
		navi.catJump();
		System.out.println();

		Cat gilNyang = new Cat();
		gilNyang.showCatInfo();
		System.out.println();
		
		gilNyang.setCatName("댕댕냥이"); 
		gilNyang.setCatAge(2);
		
		gilNyang.showCatInfo();
		gilNyang.catJump();
		
		
		System.out.println(navi);
	}

}
