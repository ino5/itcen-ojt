package 자바상속예제;

import java.util.*;

/**
 * 
 */
public class GoldCustomer extends Customer {
	// 멤버 변수
	private double saleRatio;
	
	public GoldCustomer(int customerID, String customerName) {
		super(customerID, customerName);
		this.customerGrade = "GOLD";
		this.bonusRatio = 0.02;
		this.saleRatio = 0.1;
	}
	
	//내가 구현한 것
//	public int calcPrice(int price) {
//		price *= 1 - saleRatio;
//		bonusPoint += (price * bonusRatio);
//		return price;
//	}
	
    // 교수님이 구현하신 것
    @Override
    public int calcPrice(int price) {
    	bonusPoint += price * bonusRatio;
    	return price - (int)(price * saleRatio);
    }
}