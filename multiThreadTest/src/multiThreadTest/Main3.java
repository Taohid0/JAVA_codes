package multiThreadTest;

public class Main3 {
                 public static void main(String args[]){
                	 
                	 suspend s1 = new suspend("one");
                	 suspend s2 = new suspend("two");
                	 suspend s3 = new suspend("three");
                	 
                	 s1.mysuspend();
                	 s2.mysuspend();
                	 s1.myResume();
                 }
}