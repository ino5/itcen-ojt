package 자바상속예제;

import 금액에콤마넣기.Utils;

public class CustomerTest {

	public static void main(String[] args) {
		VIPCustomer vipCustomer = new VIPCustomer(1, "jack", 1100);
		System.out.println("결제 금액: " + Utils.toNumberFormat(vipCustomer.calcPrice(1000000)));
		System.out.println(vipCustomer.showCustomerInfo());
	}

}
