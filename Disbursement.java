package javaassignment2;

import java.util.Date;

public class Disbursement {

	 private double amount;
	    private Date date;
	    
	    public Disbursement(double amount, Date date) {
	        this.amount = amount;
	        this.date = date;
	    }
	    
	    public void recordDisbursement() {
	        System.out.println("Disbursement of rs." + amount + "recorded on" + date);
	    }
	    
	    public double getAmount() {
	    	return amount; 
	    	}
	    public Date getDate() { 
	    	return date; 
	    	}
}
