package javaassignment2;

class PartialPaymentPenalty extends Penalty {
	
    public PartialPaymentPenalty(double amount, String reason) {
    	
        super(amount, reason);
    }

    @Override
    public void applyPenalty() {
    	
        System.out.println("Partial Payment Penalty Applied: Rs." + amount + "reason:" + reason);
    }
}
