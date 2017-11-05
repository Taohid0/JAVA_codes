package Exp;

public class Exp2 {
		public static void main(String args[]){
			int a,d;
			
			try{
				d = 0;
				a = 42/d;
			    System.out.println("this line will not be printed");
			}
			catch (ArithmeticException dafasasdasd){
				System.out.println("division by zero");
			}
			System.out.println("After catch statement");
		}
}
