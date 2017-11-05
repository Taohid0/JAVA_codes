package exception;

public class MyException1 extends Exception {
                            private int detail;
                            
                            MyException1 (int a)
                            {
                            	detail = a;
                            }
                            
                            public String toString()
                            {
                            	return "my Exception "  + detail;
                            }
}
