package Overload;

public class OverloadDemo {
                   void test(){
                	   System.out.println("this method has no parameter");
                   }
                   void test(int n){
                	   System.out.println("this method has one int parameter - " + n);
                   }
                   void test (int a,int b){
                	   System.out.println("this method have two int parameters" +a + " " + b);
                   }
                   void test(double n){
                	   System.out.println("this method has one double parameter" + n);
                   }
}
