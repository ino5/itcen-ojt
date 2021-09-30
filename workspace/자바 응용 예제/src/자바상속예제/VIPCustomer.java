package 자바상속예제;

import java.util.*;

/**
 * 
 */
public class VIPCustomer extends Customer {

	// 멤버 변수
    private double saleRatio;
    private int agentID;
    
    // 생성자
    public VIPCustomer(int customerID, String customerName, int agentID) {
    	super(customerID, customerName);	// 부모 클래스 생성자 호출. super()는 반드시 첫 라인에 호출
    	this.customerGrade = "VIP";
    	this.bonusRatio = 0.05;
    	this.saleRatio = 0.1;
    	this.agentID = agentID;
    }

    // 내가 구현한 것
    // 오버라이딩: c 적고 컨트롤+스페이스 눌러서 생성 가능
//    @Override // 재정의 => 다형성 개념 => 메소드 오버라이딩을 통해 다형성을 구현할 수 있다.
//    public int calcPrice(int price) {
//    	price *= 1 - saleRatio;
//    	bonusPoint += (price * bonusRatio);
//        return price;
//    }
    
    // 교수님이 구현하신 것
    @Override
    public int calcPrice(int price) {
    	bonusPoint += price * bonusRatio;
    	return price - (int)(price * saleRatio);
    }
    
    
    // VIP 고객에게만 필요한 메소드 구현
    public int getAgentID() {
        return agentID;
    }

}