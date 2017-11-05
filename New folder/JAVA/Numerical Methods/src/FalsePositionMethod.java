import java.util.Scanner;

public class FalsePositionMethod {
	
	double equation[] = new double[20];
	double Xl,Xu,Xr,ea=100,et;
	int power,i,j,k;
	
	static Scanner sc =  new Scanner(System.in);
	
	
	
	
	public FalsePositionMethod() {
		
	}

	public void start() {
		System.out.println("Enter Highest Power of X");
		power = sc.nextInt();
		
		System.out.println("Enter co-efficient and constant values :");
		for(i=0;i<=power;i++)
		{
			equation[i] = sc.nextDouble();
		}
		System.out.println("Enter Xl,Xu and true error :");
		Xl = sc.nextDouble();
		Xu = sc.nextDouble();
		et = sc.nextDouble();
		ea = 100;
		
		
		while(ea > et)
		{
			falsePosition();
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
	
	void falsePosition()
	{
		Xr = Xu - ((f(Xu)*(Xl-Xu)) / (f(Xl) - f(Xu)));
		
		ea = Math.abs((Xr-Xu)/Xr);
		
		System.out.println("Xr :"+Xr+"  ea :"+ea);
		
		 double t = f(Xl)*f(Xr);

	        if(t > 0)
	        {
	            Xl = Xr;
	        }
	        else if(t < 0)
	        {
	            Xu = Xr;
           
	        }
	        else
	            ea = 0;
	       
	       

	        

	      

	}
	

}
