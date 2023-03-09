package MiniProject;

public class MP_ProductVO {
	private int code;
	private String name;
	private String cost;
	private int stock;
	private String sort;
	public int getCode() {
		return code;
	}
	public void setCode(int code) {
		this.code = code;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getCost() {
		return cost;
	}
	public void setCost(String cost) {
		this.cost = cost;
	}
	public int getStock() {
		return stock;
	}
	public void setStock(int stock) {
		this.stock = stock;
	}
	public String getSort() {
		return sort;
	}
	public void setSort(String sort) {
		this.sort = sort;
	}
	@Override
	public String toString() {
		return "MP_ProductVO [code=" + code + ", name=" + name + ", cost=" + cost + ", stock=" + stock + ", sort="
				+ sort + "]";
	}
	
}
