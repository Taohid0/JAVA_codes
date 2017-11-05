package multiThreading;

public class Q {
                 int n;
                 
                 
                 synchronized void get(){
                	 System.out.println("got  : " + n);
                	 //return n;
                 }
                 
                 synchronized void put(int n){
                	 this.n= n;
                	 System.out.println("put : " + n);
                 }
}
