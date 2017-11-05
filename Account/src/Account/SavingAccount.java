package Account;

class SavingAccount extends Account {
    private double interestRate;
    private double transferAmount;
    
    void setInterestRate (double rate){
   	 interestRate = rate;
    }
    void setTransferAmount(double m){
           transferAmount = m;	
    }
    double getTransferAmount(){
    	return transferAmount;
    }
    double getInterestRate (){
           return interestRate;
    }
    
    double applyInterest (){
   	 double temp;
   	 temp = interestRate/100;
   	 
   	 return ((getBalance()*temp)+getBalance());
    }
    
    
}
