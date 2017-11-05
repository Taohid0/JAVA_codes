
class SavingAccount extends Account {
         private double interestRate;
         
         void setInterestRate (double rate){
        	 interestRate = rate;
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
