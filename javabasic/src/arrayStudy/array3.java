package arrayStudy;

public class array3 {

	public static void main(String[] args) {
		char[] gender = new char[] { '남', '여', '남', '남' };
		String[] name = new String[] { "김구섭", "정순남", "김규진", "김규환" };
		boolean[] lunch = new boolean[] { true, false, true };
		for (char i : gender) {
			System.out.print(i + " ");
		}
		System.out.println();
		for (String i : name) {
			System.out.print(i + " ");
		}
		System.out.println();
		for (boolean i : lunch) {
			System.out.print(i + " ");
		}
	}

}
