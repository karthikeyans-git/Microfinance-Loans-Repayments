package javaassignment2;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Repayment {

	private double amountpaid;
    private Date paymentdate;
    
    public Repayment(double amountpaid, Date paymentdate) {
        this.amountpaid = amountpaid;
        this.paymentdate = paymentdate;
    }
    
    public void processRepayment() {
        System.out.println("Repayment of rs." + this.amountpaid + " processed on " + new SimpleDateFormat("dd-MM-yyyy").format(paymentdate));
    }
    
    public double getAmountPaid() { 
    	return amountpaid; }
    public Date getPaymentDate() {
    	return paymentdate; }
}

