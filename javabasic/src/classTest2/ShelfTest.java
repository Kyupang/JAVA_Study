package classTest2;

public class ShelfTest {
	public static void main(String[] args) {
		Queue bookQue = new BookShelf();
		bookQue.enQueue("g1");
		bookQue.enQueue("g2");
		bookQue.enQueue("g3");
		bookQue.enQueue("g4");
		bookQue.enQueue("g5");
		
		System.out.println(bookQue.getSize());
		
		bookQue.deQueue();
		bookQue.deQueue();
		bookQue.deQueue();
		
		System.out.println(bookQue.getSize());
		
	}
	
}
