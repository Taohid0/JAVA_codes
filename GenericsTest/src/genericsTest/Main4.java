package genericsTest;

public class Main4 {
           public static void main(String args[]){
        	   
        	   Account a1 = new Account("taohidul",500.0);
        	   Account a2 = new Account("taohidul",1500.0);
        	   Account a3 = new Account("tuhin",2500.0);
        	   
        	   MyStack<Account> arrayAc = new MyStack<Account>(Account.class, 10);
        	   
        	   arrayAc.push(a1);
        	   arrayAc.push(a2);
        	   arrayAc.push(a3);
        	   
        	   System.out.println(arrayAc.pop());
        	   System.out.println(arrayAc.pop());
        	   System.out.println(arrayAc.pop());
        	   System.out.println(arrayAc.isEmpty());
        	   
           }
}
