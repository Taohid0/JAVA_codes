
public class Student13 {
    //Program of this() constructor call (constructor chaining)  
     
        int id;  
        String name;  
        Student13(int n,int roll){
        	System.out.println("default constructor is invoked");}  
          
        Student13(int id,String name){  
       //this (12,12);//it is used to invoked current class constructor.  
        this.id = id;  
        this.name = name;  
        }  
        void display(){System.out.println(id+" "+name);}  
          
        public static void main(String args[]){  
        Student13 e1 = new Student13(111,"karan");  
       // Student13 e2 = new Student13(222,"Aryan");  
        e1.display();  
        e1 = null;
        
        e1.display();  
       }  
    }  
