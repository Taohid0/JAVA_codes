
public class This { 
        int id;  
        String name;  
          
        This (int id,String name){  
        this.id = id;  
        this.name = name;  
        }  
        
        void display(){System.out.println(id+" "+name);}  
      
        public static void main(String args[]){  
        This s1 = new This(111,"Karan");  
        This s2 = new This(321,"Aryan");  
        s1.display();  
        s2.display();  
        }  
    }  

