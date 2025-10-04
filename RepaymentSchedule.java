package javaassignment2;

public class RepaymentSchedule {

	  private Loan loan;
	    private double totalEMI;
	    private double remainingBalance;
	    
	    public RepaymentSchedule(Loan loan) {
	        this.loan = loan;
	        this.totalEMI = loan.getLoanProduct().calculateEMI(loan.getPrincipal(), loan.getLoanProduct().getTenureMonths());
	        this.remainingBalance = loan.getPrincipal();
	    }
	    
	    public void showSchedule() {
	        System.out.println("Loan Schedule:");
	        System.out.println(" ");
	        System.out.println("Loan ID:"+loan.getLoanId());
	        System.out.println("monthly EMI:rs." +  String.format("%.2f", totalEMI));
	        System.out.println("Remaining balance: rs." +  String.format("%.2f", remainingBalance));
	        System.out.println("Status: "+ loan.getStatus());
	    }
	    
	    public void updateBalance(double amount) {
	        remainingBalance -= amount;
	        System.out.println("Balance updated remaining:rs." +this.remainingBalance);
	        if (remainingBalance <= 0) {
	            System.out.println("Loan fully repaid");
	            loan.setStatus("Closed");
	        }
	    }
	    
	    public double getRemainingBalance() {
	    	return remainingBalance; }
	    public double getTotalEMI() { 
	    	return totalEMI; }
	
}
