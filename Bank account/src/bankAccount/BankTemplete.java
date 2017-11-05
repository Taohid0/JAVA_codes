package bankAccount;

public class BankTemplete {
                      private String name;
                      private String accountNumber;
                      private double balance;
                      
                      
                      public void setName (String n)
                      {
                    	  name = n;
                      }
                      
                      public void setAccountNumber (String n)
                      {
                    	  accountNumber = n;
                      }
                      
                      public void setBalance (double b)
                      {
                    	  balance = b;

                      }
                      
                      public String getName()
                      {
                    	  return name;
                      }
                      public String getAccountNumber()
                      {
                    	  return accountNumber;
                      }
                      public double getBalance()
                      {
                    	  return balance;
                      }
}
