package 자바상속예제;

import java.util.*;

/**
 * 
 */
public class VIPCustomer extends Customer {

    /**
     * Default constructor
     */
    public VIPCustomer(int customerID, String customerName, int agentID) {
    	super(customerID, customerName);
    	this.customerGrade = "VIP";
    	this.bonusRatio = 0.05;
    	this.saleRatio = 0.1;
    	this.agentID = agentID;
    }

    /**
     * 
     */
    private double saleRatio;

    /**
     * 
     */
    private int agentID;

    /**
     * @param int price 
     * @return
     */
    public int calcPrice(int price) {
    	price *= 1 - saleRatio;
    	bonusPoint += (price * bonusRatio);
        return price;
    }

    /**
     * @return
     */
    public int getAgentID() {
        return agentID;
    }

}