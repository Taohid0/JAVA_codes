package bankAccount;

public class SavingAccount extends BankTemplete{
                       
	                   private int year;
	                   private double interestRate;
	                   
	                   public void setYear(int y)
	                   {
	                	   year = y;
	                   }
	                   
	                   public void setInterestRate(double ir)
	                   {
	                			   interestRate  = ir;
	                   }
	                   
	                   double temp = getBalance();
	                   
	                   public void currentBalance()
	                   {
	                	   double result = (interestRate/100)*getBalance()*year;
	                	   double s  = getBalance()+result;
	                	   
	                       setBalance(s);                  
	                   }
	                   
}
