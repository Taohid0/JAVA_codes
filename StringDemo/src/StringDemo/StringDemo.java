package StringDemo;

public class StringDemo {
             public static void main(String args[]){
	         
            	 String ob1 = "first string";
                 String ob2 = "second string";
                 String ob3 = ob1;
             
             System.out.println("length of string one is "+ob1.length());
             System.out.println("Character at index three is "+ob1.charAt(3));
             
             
             if(ob1.equals(ob2)){
            	 System.out.println("first and second strings are equal");
             }
             else
            	 System.out.println("first and second string are not equal");
             
             if(ob1.equals(ob3)){
            	 System.out.println("first and third strings are equal");
             }
             else
            	 System.out.println("first and third strings are not equal");
             }
             }
