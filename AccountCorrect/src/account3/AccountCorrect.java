package account3;

public class AccountCorrect {
         public static void main (String args[]){
        	 
        	 SavingAccount S = new SavingAccount();
        	 CurrentAcccount C  =new CurrentAcccount();
        	 
        	 S.setAccountNo("140202");
        	 S.setAccountHolderName("babu");
        	 S.setDate("12-12-12");
        	 S.setBalance(10000);
        	 S.setInterestRate(4);
        	 S.applyInterst();
        	 S.withdraw(5000);
        	 
        	 
        	 C.setAccountNo("140203");
        	 C.setAccountHolderName("hossain");
        	 C.setDate("10-10-10");
        	 C.setBalance(500);
        	 S.transfer(1000);
        	 
        	 System.out.println(S.getAccountHoldername() +  " : " +  S.getBalance());
        	 System.out.println(C.getAccountHoldername() +  " : " + C.getBalance());
         }
}
 