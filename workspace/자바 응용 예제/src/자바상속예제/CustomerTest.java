package 자바상속예제;

import 금액에콤마넣기.Utils;

public class CustomerTest {
	//[추가]
	public static String price_value;
	
	
	public static void main(String[] args) {
		// 내가 구현한 것
//		VIPCustomer vipCustomer = new VIPCustomer(1, "jack", 1100);
//		System.out.println("결제 금액: " + Utils.toNumberFormat(vipCustomer.calcPrice(1000000)));
//		System.out.println(vipCustomer.showCustomerInfo());
		
		Customer customerPark = new Customer(10010, "박태호");
		customerPark.bonusPoint = 10;
		System.out.println(customerPark.showCustomerInfo());
		
		int pricePark = customerPark.calcPrice(200000);
		//[추가]
		price_value = Utils.toNumberFormat(pricePark);
		System.out.println("상품 지불 금액: " + price_value + "원");
		System.out.println();
		
		VIPCustomer customerSon = new VIPCustomer(10020, "손유일", 1234);
		customerSon.bonusPoint = 200;
		System.out.println(customerSon.showCustomerInfo());
		
		int priceSon = customerSon.calcPrice(500000);
		price_value = Utils.toNumberFormat(priceSon);
		System.out.println("상품 할인율 적용 지불 금액: " + price_value + "원");
		System.out.println();
		
		int agentID = customerSon.getAgentID();
		System.out.println("VIP 고객 담당 상담원 아이디: " + agentID);
		System.out.println();
		
		GoldCustomer customerLee = new GoldCustomer(10050, "이두희");
		customerLee.bonusPoint = 50;
		System.out.println(customerLee.showCustomerInfo());

		int priceLee = customerSon.calcPrice(300000);
		price_value = Utils.toNumberFormat(priceLee);
		System.out.println("상품 할인율 적용 지불 금액: " + price_value + "원");		
	}

}
