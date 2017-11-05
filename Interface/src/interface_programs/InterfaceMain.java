package interface_programs;

public class InterfaceMain {
         public static void main (String args[]){
        	 Client c = new Client();
        	 
        	 AnotherClient c2 = new AnotherClient();
        	 
        	 c.callBack(10);
        	 c.call2();
        	 c2.callBack(10);
         }
}
