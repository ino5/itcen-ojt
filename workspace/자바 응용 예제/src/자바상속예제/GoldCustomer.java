package 자바상속예제;

import java.util.*;

/**
 * 
 */
public class GoldCustomer extends Customer {	
	
    /**
     * Default constructor
     */
    public GoldCustomer(int customerID, String customerName) {
    	super(customerID, customerName);	
    	this.customerGrade = "GOLD";
    	this.bonusRatio = 0.02;
    	this.saleRatio = 0.1;
    }

    /**
     * 
     */
    private double saleRatio;

    /**
     * @param int price 
     * @return
     */
    public int calcPrice(int price) {
    	price *= 1 - saleRatio;
    	bonusPoint += (price * bonusRatio);
        return price;
    }

}