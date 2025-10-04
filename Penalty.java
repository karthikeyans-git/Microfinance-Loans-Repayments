package javaassignment2;

public abstract class Penalty {

	protected double amount;
    protected String reason;
    
    public Penalty(double amount, String reason) {
        this.amount = amount;
        this.reason = reason;
    }
    
    public abstract void applyPenalty();
    
    public double getAmount() { 
    	return amount; }
    public String getReason() { 
    	return reason; }
}
