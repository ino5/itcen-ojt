package Product;

public class ProductTest {
	private String[] productList = {"올레드TV", "오디오", "에어콘", "냉장고", "공기청정기"};
	
	private int num1 = 10;
	private int num2 = 20;
	
	// 멤버당 getter, setter 메소드
	public String[] getProductList() {
		return productList;
	}
	public void setProductList(String[] productList) {
		this.productList = productList;
	}
	public int getNum1() {
		return num1;
	}
	public void setNum1(int num1) {
		this.num1 = num1;
	}
	public int getNum2() {
		return num2;
	}
	public void setNum2(int num2) {
		this.num2 = num2;
	}
}
