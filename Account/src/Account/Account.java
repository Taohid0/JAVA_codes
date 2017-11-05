package Account;

public class Account {
    
	private String accountNo;
	private String accountName;
	private String date;
	private double balance;
	
	void setAccountNo (String no){
		 accountNo = no;
	}
	void setAccountName (String name){
		 accountName = name;
	}
	void setDate (String d){
		 date = d;
	}
	void setBalance (double b){
		 balance = b;
	}
	
	void makeDiposit(double diposit){
		balance+=diposit;
	}
	
	void withdaw(double withdr){
		if(withdr>balance){
			balance+=withdr;
		}
	}
	
	String getAccounNo (){
		return accountNo;
	}
	String getAccountName(){
		return accountName;
	}
	String getDate(){
		return date;
	}
	double getBalance(){
		return balance;
	}
	
	
}