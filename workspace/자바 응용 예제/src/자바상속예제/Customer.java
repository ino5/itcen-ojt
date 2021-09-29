package 자바상속예제;	


import java.util.*;

import 금액에콤마넣기.Utils;

/**
 * 
 */
public class Customer {

    /**
     * Default constructor
     */
    public Customer() {

    }	
    public Customer(int customerID, String customerName) {
    	this.customerID = customerID;
    	this.customerName = customerName;
    	this.customerGrade = "GENERAL";
    	this.bonusRatio = 0.01;
    }

    /**
     * 
     */
    protected int customerID;

    /**
     * 
     */
    protected String customerName;

    /**
     * 
     */
    protected String customerGrade;

    /**
     * 
     */
    protected int bonusPoint;

    /**
     * 
     */
    protected double bonusRatio;

    /**
     * @param int price 
     * @return
     */
    public int calcPrice(int price) {
    	bonusPoint += (price * bonusRatio);
        return price;
    }

    /**
     * @return
     */
    public String showCustomerInfo() {
    	String Info = "";
    	Info += "customerID: " + customerID;
    	Info += ", customerName: " + customerName;
    	Info += ", customerGrade: " + customerGrade;
    	Info += ", bonusPoint: " + Utils.toNumberFormat(bonusPoint);
        return Info;
    }

}