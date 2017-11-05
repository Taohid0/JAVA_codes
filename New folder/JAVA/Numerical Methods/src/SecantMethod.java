import java.util.Scanner;
import java.lang.Math;

public class SecantMethod {
	double equation[] = new double[20];
	double x1,x2,x3,ea=100,et;
	int power,i,j,k;
	
	 Scanner sc =  new Scanner(System.in);
	
	
	public SecantMethod() {
		super();
	}
	
	public void start() {
		System.out.println("Enter Highest Power of X");
		power = sc.nextInt();
		
		System.out.println("Enter co-efficient and constant values :");
		for(i=0;i<=power;i++)
		{
			equation[i] = sc.nextDouble();
		}
		System.out.println("Enter Xi-1,Xi and true error :");
		x1 = sc.nextDouble();
		x2 = sc.nextDouble();
		et = sc.nextDouble();
		et /= 100;
		
		
		while(ea >= et)
		{
			secant();
		}
		
		
	}
	
	double f(double x)
	{
		double sum = 0;
		
		for(j=0;j<power;j++)
		{
			
			sum += equation[j] * (Math.pow(x,power-j));
		}
		sum += equation[power];
		
		return sum;
	}
	
	void secant()
	{
		x3 = x2 - ((f(x2)*(x1-x2)) / (f(x1) - f(x2)));
		
		ea = Math.abs((x3-x2)/x3);
		
		System.out.println("Xi+1 :"+x3+"  ea :"+ea);
		
		x1 = x2;
		x2 = x3;
	}
	

}
