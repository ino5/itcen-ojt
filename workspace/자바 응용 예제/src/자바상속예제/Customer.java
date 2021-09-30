package 자바상속예제;	


import java.util.*;

/**
 * Customer는 부모 클래스(상위, 슈퍼) => '일반적인' 클래스 성격
 */
public class Customer {
	// 멤버 변수 선언 => 자식(하위, 서브) 클래스에서 공통으로 사용할 속성
    protected int customerID;
    protected String customerName;
    protected String customerGrade;
    protected int bonusPoint;
    protected double bonusRatio;	
	
    
    //[추가] 보너스 포인트에 천 단위마다 콤마 넣기 변수 선언
    String bonusPoint_value;
    
    // 디폴트 생성자
    public Customer() {}
    
    // 생성자
    public Customer(int customerID, String customerName) {
    	this.customerID = customerID;
    	this.customerName = customerName;
    	this.customerGrade = "GENERAL";
    	this.bonusRatio = 0.01;
    }

    
    // 제품 지불 금액 계산하는 메소드 구현
    public int calcPrice(int price) {
    	bonusPoint += (price * bonusRatio); // 보너스 포인트 계산
        return price;
    }

    // 고객 정보 출력 메소드 구현
    // 내가 구현한 것
//    public String showCustomerInfo() {
//    	String Info = "";
//    	Info += "customerID: " + customerID;
//    	Info += ", customerName: " + customerName;
//    	Info += ", customerGrade: " + customerGrade;
//    	Info += ", bonusPoint: " + Utils.toNumberFormat(bonusPoint);
//        return Info;
//    }
    public String showCustomerInfo() {
    	bonusPoint_value = Utils.toNumberFormat(bonusPoint);
    	return customerName + " 님의 등급은 " + customerGrade + " 이며, 보유 보너스 포인트는 " + bonusPoint_value + "입니다.";
    }
    
    // getter, setter 메소드
	public int getCustomerID() {
		return customerID;
	}

	public void setCustomerID(int customerID) {
		this.customerID = customerID;
	}

	public String getCustomerName() {
		return customerName;
	}

	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}

	public String getCustomerGrade() {
		return customerGrade;
	}

	public void setCustomerGrade(String customerGrade) {
		this.customerGrade = customerGrade;
	}

	public int getBonusPoint() {
		return bonusPoint;
	}

	public void setBonusPoint(int bonusPoint) {
		this.bonusPoint = bonusPoint;
	}

	public double getBonusRatio() {
		return bonusRatio;
	}

	public void setBonusRatio(double bonusRatio) {
		this.bonusRatio = bonusRatio;
	}

}