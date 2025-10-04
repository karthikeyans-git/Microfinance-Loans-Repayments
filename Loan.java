package javaassignment2;

import java.util.Date;

public class Loan {
	 private String loanId;
	    private Customer customer;
	    private LoanProduct loanProduct;
	    private double principal;
	    private String status;
	    private RepaymentSchedule schedule;
	    private Disbursement disbursement;
	    
	    public Loan(String loanId, Customer customer, LoanProduct loanProduct, double principal) {
	        this.loanId = loanId;
	        this.customer = customer;
	        this.loanProduct = loanProduct;
	        this.principal = principal;
	        this.status = "pending";
	    }
	    
	    public boolean approveLoan() {
	        if (customer.isEligible(this)) {
	            this.status = "Approved";
	            System.out.println("Loan id:"+this.loanId+"approved");
	            return true;
	        } else {
	            System.out.println("Loan not approved for"+this.loanId);
	            return false;
	        }
	    }
	    
	    public void disburseLoan() {
	        if (status.equals("Approved")) {
	            status = "Active";
	            disbursement = new Disbursement(principal, new Date());
	            disbursement.recordDisbursement();
	            schedule = new RepaymentSchedule(this);
	            System.out.println("Loan disbursed");
	        } else {
	            System.out.println("Loan not approved for disbursement");
	        }
	    }
	    
	    public void generateSchedule() {
	        if (schedule != null) {
	            schedule.showSchedule();
	        } else {
	            System.out.println("No schedule available");
	        }
	    }
	    
	    public void recordRepayment(double amount) {
	        if (schedule != null) {
	            Repayment repayment = new Repayment(amount, new Date());
	            repayment.processRepayment();
	            schedule.updateBalance(amount);
	        } else {
	            System.out.println("No schedule to record repayment");
	        }
	    }
	    
	    public double getPrincipal() { 
	    	return principal; 
	    	}
	    public LoanProduct getLoanProduct() { 
	    	return loanProduct; 
	    	}
	     public String getStatus() {
	    	return status; 
	    	}
	    public void setStatus(String status) { 
	    	this.status = status; 
	    	}
	     public String getLoanId() {
	    	return loanId; 
	    	}
	     public Customer getCustomer() {
	    	return customer; 
	    	}
	     public RepaymentSchedule getSchedule() {
	    	return schedule; 
	    	}
}
