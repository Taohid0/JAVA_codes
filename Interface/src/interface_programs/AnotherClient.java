package interface_programs;

 class AnotherClient implements CallBack {
	      public void callBack(int param){
	    	  System.out.println("this is member of another class");
	    	  System.out.println("parameter is squared now " + (param*param));
	      }
              
}
