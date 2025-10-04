package javaassignment2;

public class Testloan {
	
	
	    public static void main(String[] args) {
	       
	        Customer c1 = new Customer("CNRB12007","Karthikeyan","coimbatore","7806821770");   
	        LoanProduct lp1 = new LoanProduct("LP771", "home loan", 12.0, 24); 
	        Loan loan1 = new Loan("Lp771",c1, lp1, 50000);       
	        c1.addLoan(loan1);	        
	        loan1.approveLoan();	        
	        loan1.disburseLoan();
	        loan1.generateSchedule();
	        loan1.recordRepayment(11000);
	         Penalty p1 = new LatePaymentPenalty(500, "missed EMI for september");
	        p1.applyPenalty();
	        
	        Penalty p2 = new PartialPaymentPenalty(200, "paid less than EMI");
	        p2.applyPenalty();

	        loan1.generateSchedule();
	        System.out.println(" ");
	        
	        
	        
	        Customer c2 = new Customer("CNRB72728","Gandhi","salem","9152356123");
	        LoanProduct lp2 = new LoanProduct("LP781", "gold loan", 10.0, 12);
	        Loan loan2 = new Loan("Lp781",c2, lp2, 45000);
	        c2.addLoan(loan2);
	        loan2.approveLoan();
	        loan2.disburseLoan();
	        loan2.generateSchedule();
	        loan2.recordRepayment(10000);
	        Penalty p3 = new LatePaymentPenalty(300, "missed EMI for september");
	        p3.applyPenalty();
	        loan2.generateSchedule();
	       
	    }
	}



