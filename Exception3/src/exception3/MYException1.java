package exception3;

public class MYException1 extends Exception{
    private int num;
    
    MYException1(int a)
    {
 	   num =a ;
 	   
    }
    public String toString() {
 	   return "Exceptionm " + num;
    }
}