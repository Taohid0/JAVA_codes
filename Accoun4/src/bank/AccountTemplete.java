package bank;

public class AccountTemplete {
	
	       private String accountNo;
	       private String accountHolderName;
	       private String date;
	       private double balance;
	      
	       
	       
	       void setAccountNo (String a){
	    	   accountNo =a;
	       }
	       
	       void setAccountHolderName(String b){
	    	   accountHolderName  = b;
	       }
	       
	       void setDate (String c){
	    	   date = c;
	       }
	       void setBalance (double d){
	    	   balance = d;
	       }
	       
	       void makeDiposit (double m){
	    	   balance+=m;
	       }
	       void withdraw (double w){
	    	   if(balance>w){
	    		   balance-=w;
	    	   }
	       }
	       
	       String getAccountNo(){
	    	   return accountNo;
	       }
	       
	       
	       String getAccountHoldername(){
	    	   return accountHolderName;
	       }
	       
	       String getDate(){
	    	   return date;
	       }
	       
	       double getBalance(){
	    	   return balance;
	       }
	}


