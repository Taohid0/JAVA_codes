package genrics;

public class Account {
             private String name;
             private double amount;
              
             Account (String name,double amount){
            	 this.name =  name;
            	 this.amount= amount;
             }
             public String toString(){
            	 return "name : "+name + "\namount : " +  amount;
             }
}
