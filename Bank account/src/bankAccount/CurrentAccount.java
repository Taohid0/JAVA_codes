package bankAccount;

public class CurrentAccount extends BankTemplete{
                     
	                private double amount;
	                private double withdrwanAmount;
	                 
	                
	   
	                 public void  withdraw(double a)
	                 {
	                	 amount  = a;
	                
	                	 double b = getBalance()- amount;
	                	 setBalance(b);
	                 }
	                 
}
