package bankUpdate;

public class SavingsAccount extends BankTemplete{

	  double interestRate;
      double year;
      
      
      public void setInterestRate(int i)
      {
    	  interestRate = i;
      }
      
      public void setYear(double y)
      {
    	  year = y;
      }
      
      public double getInterestRate()
      {
    	  return interestRate;
      }
      public double getYear()
      {
    	  return year;
      }
      
      public void countInterest()
      {
    	  double result;
    	  result = (getAmount()*(getInterestRate()/100)*year)+getAmount();
    	  setAmount(result);
      }
      
      
      public void transfer(CurrentAmount a,double tk)
      {
    	  if(tk<=getAmount()){
    		     a.setAmount(a.getAmount() + tk);     
    	  }
    	  setAmount(getAmount() - tk);
      }
      public void transfer(SavingsAccount a,double tk)
      {
    	  if(tk<=getAmount()){
    		     a.setAmount(a.getAmount() + tk);     
    	  }
    	  setAmount(getAmount() - tk);
      }
      
}