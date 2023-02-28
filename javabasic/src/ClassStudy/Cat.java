package ClassStudy;

public class Cat {
	String catName;
	int catAge;
	

	public Cat(String catName, int catAge) {
		this.catName = catName;
		this.catAge = catAge;
	}
	
	public Cat() {
		System.out.println("고영희에게 간택당했습니다!");
		catName = "길냥이";
		catAge = 0;
	}
	
	public String getCatName() {
		return catName;
		
	}

	public void setCatName(String catName) {
		this.catName = catName;
	}

	public int getCatAge() {
		return catAge;
	}

	public void setCatAge(int catAge) {
		this.catAge = catAge;
	}
	
	

	public void catJump() {
		System.out.println("고양이가 점프를 하였습니다! 귀여워해주세요");
	}
	
	public void showCatInfo() {
		System.out.println("고양이의 이름은 "+ getCatName()+ "이고, 고영희의 나이는"+ getCatAge() + "살 입니다.");
	}
	

	@Override
	public String toString() {
		return "Cat [catName=" + catName + ", catAge=" + catAge + "]";
	}
}
