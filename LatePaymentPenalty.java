package javaassignment2;

class LatePaymentPenalty extends Penalty {
	


    public LatePaymentPenalty(double amount, String reason) {
    	
        super(amount, reason);
    }
    
    
    @Override
    public void applyPenalty() {
        System.out.println("Late payment penalty applied:rs." + amount + "reason:"+ reason);
    }
}
