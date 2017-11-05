package account3;

public class SavingAccount extends AccountTemplete {
                 private double interestRate;
                
                 
	void setInterestRate (double rate){
		interestRate = rate;
	}
	
	double getInterestRate (double r){
		return interestRate;
	}
	
	
	CurrentAcccount C1 = new CurrentAcccount();

	void transfer (double tk){
		double a = getBalance();
		
		a -=tk;
		
		
		
		double b = C1.getBalance();
		
		b+=tk;
		
		C1.setBalance(b);
		
	}
	

	
	void applyInterst(){
		double a = getBalance();
		
		a= a * (1+(interestRate/100));
		
		setBalance(a);
		
	}
}
