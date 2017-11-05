package thisthis;

public class ThisInteresting {
               int id;
               String name;
               String hometown;
               
               ThisInteresting(int id1,String hometown1){
            	   id = id1;
            	   hometown = hometown1;
               }
               ThisInteresting(int id,String name,String hometown){
            	   this(id,hometown);
            	   this.hometown = hometown;
               }
               void display(){
            	   System.out.println(id+ " " + name +  " " + hometown);
               }
               
               public static void main(String args[]){
            	   ThisInteresting this1 = new ThisInteresting(140202,"taohidul Islam");
            	   }
			
}
