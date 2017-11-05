import java.util.*;

public class NewtonsInterpolation {

        double x[] =new double[100];
        double y[] = new double[100];
        double b[] = new double[100];
        int n;
        Scanner scanner = new Scanner(System.in);
        void takeInput()
        {
        	System.out.print("Enter number of data points");
        	n = scanner.nextInt();
        	
        	for(int i=0;i<n;i++)
        	{
        		System.out.printf("Enter co-ordinate x%d y%d", i,i);
        		x[i] = scanner.nextDouble();
        		y[i] =scanner.nextDouble();
        	}
        	b[0] =y[0];
        }
        double value(int i,int j)
        {
        	
            if(i-j==1)
        	{
        		return (y[i]-y[j])/(x[i]-x[j]); 
        	}
        	else {
        		return (value(i, j+1)-value(i-1, j))/(x[i]-x[j]);
        	}
        }
        void calculateResult()
        {
        	for(int i=1;i<n;i++)
        	{
        		b[i] = value(i,0);
        	}
        }
        void printResult()
        {
        	for(int i=0;i<n;i++)
        	{
        		System.out.println("b"+i+" "+b[i]);
        	}
        }
}
