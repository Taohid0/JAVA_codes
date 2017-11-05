package bankUpdate;

public class BankTemplete {
                 private String name;
                 private String accountNumber;
                 private double amount;
                 
                 
                 public void setName(String n)
                 {
                	 name = n;
                 }
                 public void setAccountNumber(String n)
                 {
                	 accountNumber  = n;
                 }
                 public void setAmount(double a)
                 {
                	 amount  =  a;
                 }
                 
                 public String getName()
                 {
                	 return name;
                 }
                public String getAccountNumber()
                {
                	return accountNumber;
                }
                public double getAmount()
                {
                	return amount;
                }
}
