package javaassignment2;

import java.util.*;

public class Testloan {

	    public static void main(String[] args) {
	    	
	        Scanner sc = new Scanner(System.in);
	        List<Customer> customers = new ArrayList<Customer>();
	        List<LoanProduct> products = new ArrayList<LoanProduct>();
	        List<Loan> loans = new ArrayList<Loan>();
	        
	        int ch;

	        customers.add(new Customer("CNRB12007", "Karthikeyan", "Coimbatore", "7806821770"));
	        customers.add(new Customer("CNRB72728", "Gandhi", "Salem", "9152356123"));
	        products.add(new LoanProduct("LP771", "Home Loan", 12.0, 24));
	        products.add(new LoanProduct("LP781", "Gold Loan", 10.0, 12));

	        
	        
	        while(true)
	        {
	            System.out.println("1.Add customer  2.Add product  3.Approve loan  4.Disburse  5.Schedule  6.Repay  7.View  8.Exit");
	            
	            System.out.print("Enter choice:");
	            ch = sc.nextInt();
	            
	           

	            switch (ch) {
	                case 1:
	                {
	                    System.out.print("Id:"); 
	                    String cuid = sc.nextLine();
	                    System.out.print("name: ");
	                    String name = sc.nextLine();
	                    System.out.print("address: ");
	                    String address = sc.nextLine();
	                    System.out.print("phone: ");
	                    String phone = sc.nextLine();
	                    customers.add(new Customer(cuid, name, address, phone));
	                    System.out.println("customer added");
	                    break;
	                }

	                case 2:
	                {
	                    System.out.print("product id:");
	                    String proid = sc.nextLine();
	                     System.out.print("name: ");
	                    String proname = sc.nextLine();
	                     System.out.print("interest: ");
	                    double rate = sc.nextDouble();
	                    System.out.print("tenure: ");
	                     int tenure = sc.nextInt();
	                     products.add(new LoanProduct(proid, proname, rate, tenure));
	                     System.out.println("Product added");
	                    break;
	                }

	                case 3:
	                {
	                	if (customers.isEmpty() || products.isEmpty()) {
	                        System.out.println("there  is no customer");
	                        break;
	                    }
	                    for (int i = 0; i < customers.size(); i++)
	                        System.out.println((i+1) +":"+ customers.get(i).getName());
	                    System.out.print("Select customer:");
	                    int cusno = sc.nextInt();

	                    for (int i = 0; i < products.size(); i++)
	                        System.out.println((i+1) + ":" + products.get(i).getProductName());
	                    System.out.print("Select product:");
	                    int prono = sc.nextInt();

	                    System.out.print("amount:");
	                    double money = sc.nextDouble();
	                    
	                    Loan loan = new Loan("CNRBL" + (loans.size() + 1), customers.get(cusno - 1), products.get(prono - 1), money);
	                    if (loan.approveLoan()) 
	                    	loans.add(loan);
	                    break;}

	                case 4:
	                {
	                    for (Loan l : loans)
	                        if (l.getStatus().equals("Approved"))
	                        	{
	                        	l.disburseLoan();
	                        	}
	                    break;
	                    }

	                case 5:
	                {
	                    for (int i = 0; i < loans.size(); i++)
	                        System.out.println((i+1) + ":" + loans.get(i).getLoanId());
	                    System.out.print("Select:");
	                    int sno = sc.nextInt();
	                    loans.get(sno-1).generateSchedule();
	                    break;
	                }

	                case 6:
	                {
	                    for (int i = 0; i < loans.size(); i++)
	                    {
	                        if (loans.get(i).getStatus().equals("Active"))
	                            System.out.println((i+1) + ". " + loans.get(i).getLoanId());}
	                    System.out.print("select:");
	                    int lno = sc.nextInt();
	                    System.out.print("amount: ");
	                    double pay = sc.nextDouble();
	                    loans.get(lno - 1).recordRepayment(pay);
	                    break;
	                }
	                case 7:
	                {
	                	if (customers.isEmpty()) {
	                        System.out.println("no customers");}
	                        
	                        System.out.println("Customers:");
	                        for (int i = 0; i < customers.size(); i++)
	                        {
	                            System.out.println((i + 1) + ". " + customers.get(i).getName());}
	                        
	                        System.out.print("Selectcustomer: ");
	                        int csel = sc.nextInt();
	                        
	                        Customer cust = customers.get(csel-1);
	                        if (cust.getLoans().isEmpty()) {
	                            System.out.println("No loans for" + cust.getName());
	                        }
	        
	                        
	                	System.out.println("Loans:");
	                    
						for (int i = 0; i < cust.getLoans().size(); i++)
	                        System.out.println((i + 1) + ". " + cust.getLoans().get(i).getLoanId());

	                    System.out.print("Select loan:");
	                    int lsel = sc.nextInt();
	                 

	                    Loan ln = cust.getLoans().get(lsel - 1);
	                    if (ln.getSchedule() != null)
	                        System.out.println("Remaining: Rs." + ln.getSchedule().getRemainingBalance());
	                    else
	                        System.out.println("No schedule generated yet!");
	                    
	                    
	                	 break;
	                    }
	                   
	                
	                case 8:
	                    System.out.println("Exit");
	                    return;

	                default:
	                    System.out.println("Invalid!");
	            }
	        }
	        
	    }
	}


	    
	   
	      
