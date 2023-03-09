package JDBC_for_product;

public class ProductDAO {
	public void insert(ProductVO bag) {
		System.out.println("전달된 id는 " + bag.getId());
		System.out.println("전달된 name은 " + bag.getName());
		System.out.println("전달된 content는 " + bag.getContent());
	
	}
}
