package javaassignment2;

public class LoanProduct {

	private String productId;
    private String productName;
    private double interestRate;
    private int tenureMonths;
    
    public LoanProduct(String productId, String productName, double interestRate, int tenureMonths) {
        this.productId = productId;
        this.productName = productName;
        this.interestRate = interestRate;
        this.tenureMonths = tenureMonths;
    }
    
    public double calculateEMI(double principal, int tenure) {
        double r = interestRate/(12*100);
        return (principal*r*Math.pow(1 + r, tenure))/(Math.pow(1 + r, tenure)-1);
    }
    
    public boolean validateAmount(double amount) {
        if(amount > 0 && amount <= 150000)
        {
        	return true;
        }
        else {
        	return false;
        }
    }
    
    public String getProductId() {
    	return productId; 
    	}
    public int getTenureMonths() { 
    	return tenureMonths;
    	}
    public double getInterestRate() {
    	return interestRate; 
    	}
    public String getProductName() { 
    	return productName; 
    	}

}
