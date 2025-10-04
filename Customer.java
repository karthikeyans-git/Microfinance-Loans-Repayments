package javaassignment2;

import java.util.ArrayList;
import java.util.List;

public class Customer {

	 private String customerId;
	    private String name;
	    private String address;
	    private String phone;
	    private List<Loan> loans;
	    
	    public Customer(String customerId, String name, String address, String phone) {
	        this.customerId = customerId;
	        this.name = name;
	        this.address=address;
	        this.phone=phone;
	        loans = new ArrayList<>();
	    }
	    
	    public boolean isEligible(Loan loan) {
	        return loan.getPrincipal() <= 150000;
	    }
	    
	    public void addLoan(Loan loan) {
	        loans.add(loan);
	        System.out.println("loan added for customer:"+name);
	    }
	    
	    public void updateDetails() {
	        System.out.println("customer details updated");
	    }
	    
	    public String getCustomerId() { 
	    	return customerId; 
	    	}
	    public String getName() { 
	    	return name; 
	    	}
	    public List<Loan> getLoans() {
	    	return loans;
	    	}

		public String getAddress() {
			return address;
		}

		public void setAddress(String address) {
			this.address = address;
		}

		public String getPhone() {
			return phone;
		}

		public void setPhone(String phone) {
			this.phone = phone;
		}
}

