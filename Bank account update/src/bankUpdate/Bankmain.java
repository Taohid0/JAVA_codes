package bankUpdate;

public class Bankmain {
           
	        public static void main(String args[])
	        {
	        	CurrentAmount c = new CurrentAmount();
	        	SavingsAccount s = new SavingsAccount();
	        	SavingsAccount s1 = new SavingsAccount();
	        	
	        c.setAccountNumber("100");
	        c.setName("taohid");
	        c.setAmount(10000);
	        
	        s.setName("babu");
	        s.setAccountNumber("101");
	        s.setInterestRate(4);
	        s.setYear(5);
	        s.setAmount(50000);	
	        s.countInterest();
	        s1.setName("kabu");
	        s1.setAmount(100);
	        
	         
	        s.transfer(c, 3000);
	        s.transfer(s1, 500);
	        
	        System.out.println(c.getName()+ " " +c.getAmount());
	        System.out.println(s.getName()+ " " + s.getAmount());
	        System.out.println(s1.getName()+ " " + s1.getAmount());	
	        }
}
