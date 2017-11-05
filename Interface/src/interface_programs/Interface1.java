package interface_programs;

interface CallBack {
	     void callBack(int n);
}
 
class Client implements CallBack{
	      
	public void callBack(int p){
		System.out.println("callback called " + p);
	}
	public void call2(){
		System.out.println("it is the second method in Client method");
	}
}