import java.util.Scanner;
import java.lang.Math;

public class GaussSeidel {
	int n,i,j,k,ss=3;
	double a[][] = new double[20][20];
	double pastValue[] = new double[20];
	double recentValue[] = new double[20];
	double sum =0,ea,et,eaMax=100;
	
	
	
	public GaussSeidel() {
		super();
	}
	
	Scanner sc = new Scanner(System.in);
	
	public void start() {
		System.out.println("Enter number of equation :");
		n = sc.nextInt();
		System.out.println("Enter co-efficient and constant values :");
		for(i=0;i<n;i++)
		{
			for(j=0;j<=n;j++)
			{
				a[i][j] = sc.nextDouble();
			}
		}
		System.out.println("Enter Limit of Error :");
		et = sc.nextDouble();
		
		while(eaMax > et)
		{
			gaussSeidelMethod();
			ss--;
		}
		
	}
	
	public void gaussSeidelMethod()
	{
		for(i=0;i<n;i++)
		{
			sum = a[i][n];
			
			for(j=0;j<n;j++)
			{
				if(j != i)
					sum -= a[i][j] * recentValue[j];
			}
			recentValue[i] = sum / a[i][i];
		}
		
		for(k=0;k<n;k++)
		{
			System.out.print("x" +(k+1)+ " :" +Math.round(recentValue[k]));
		}
		
		System.out.println();
		
		eaMax = 0;
		
		for(k=0;k<n;k++)
		{
			ea = Math.abs((recentValue[k]-pastValue[k])/recentValue[k]) * 100;
			
			if(ea > eaMax)
				eaMax = ea;
			
			System.out.print("Error :" +ea );
			pastValue[k] = recentValue[k];
		}
		System.out.println();
		System.out.println();
		
	}
	
	
	

	
}
