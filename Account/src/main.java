
public class main {
	   public static void main (String args[]){
    	   
    	   SavingAccount a1 = new SavingAccount();
    	   
    	   a1.setAccountNo("140201");
    	   a1.setAccountName("Mr, Babu");
    	   a1.setBalance(10000);
    	   a1.setInterestRate(4);
    	   a1.setDate("1-10-2015");
    	   
    	   a1.applyInterest();
    	   
    	   CurrentAccount c1 = new CurrentAccount();
    	   
    	   c1.setAccountNo("140202");
    	   c1.setAccountName("Mr. Hossain");
    	   c1.setBalance(500);
    	   c1.setDate("1-15-2015");
    	   
    	   System.out.println(a1.getAccountName()+" = " + a1.getBalance());
    	   System.out.println(c1.getAccountName() + " = " + c1.getBalance());
    	   
       }
}
