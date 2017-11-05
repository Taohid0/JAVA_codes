package generics1;


public class Prnt {
            public static <E> void pr(E elements[]){
            	
            	for(int i = 0;i<elements.length;i++){
            		  System.out.println(elements[i]);
            	}
            }
 }
