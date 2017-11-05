package bankAccount;

public class BankMain {
                   public static void main (String args[])
                   {
                	   SavingAccount s = new SavingAccount();
                	   CurrentAccount c = new CurrentAccount();
                	   
                	   s.setName("taohidul islam");
                	   s.setAccountNumber("140202"); 
                	   s.setBalance(10000);
                	   s.setYear(5);
                	   s.setInterestRate(5);
                	   s.currentBalance();
                	   
                	   c.setName("taohidul ");
                	   c.setAccountNumber("02");
                	   c.setBalance(550000);
                	   c.withdraw(500);
                	   
                	   System.out.println(s.getName() +" " + s.getAccountNumber() + " " + s.getBalance());
                	   
                	   System.out.println(c.getName() +" " + c.getAccountNumber() + " " + c.getBalance());
                	   
                	   
                   }
}
