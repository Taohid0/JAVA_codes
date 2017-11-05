package numericalLaboratory;

import java.util.*;

public class Main {
    public static void main (String args[])
    {
    	float cox11,cox12,cox13;
    	float cox21,cox22,cox23;
    	float cox31,cox32,cox33;
    	float constant1,constant2,constant3;
    	float es;
    	
    	int iterator;
    	
    	while(true){
    	Scanner sc = new Scanner(System.in);
    	System.out.println("\nwhich method do you want to use?\n Press 1 to use Gauss Seidal method\n press "
    			+ "2 for bisection method\n 3 for False position method\n 4 for secant method");
        
    	int choice = sc.nextInt();
    	boolean test=true;
    	if(choice==1 && test)
    	{
    		
    		System.out.println("enter coefficient of x1, x2, x3 and the constant for the first equation");
    		
    		cox11=sc.nextFloat();
    		cox12 = sc.nextFloat();
    		cox13 =sc.nextFloat();
    		constant1 = sc.nextFloat();
    		
    		System.out.println("enter coefficient of x1, x2, x3 and constant for the second equation");
    		
    		cox21 =sc.nextFloat();
    		cox22 = sc.nextFloat();
    		cox23 =sc.nextFloat();
    		constant2 = sc.nextFloat();
    		
    		System.out.println("enter coefficient of x1, x2, x3 and constant for the third equation");
    		
    		cox31 = sc.nextFloat();
    		cox32 = sc.nextFloat();
    		cox33 = sc.nextFloat();
    		constant3 = sc.nextFloat();
    		
    		System.out.println("enter iteration number and error percentage");
    		
    		iterator = sc.nextInt();
    		es = sc.nextFloat();
    		
    		if(cox11==0.0 || cox22==0.0 || cox33== 0.0)
    		{
    			System.out.println("all diagonal elements should be nonzero in gauss-seidel method");
    			
    		}
    		else{
    			test =false;
    		GaussSeidel gaussSeidel = new GaussSeidel(cox11,cox12,cox13,constant1,
    												  cox21,cox22,cox23,constant2,
    												  cox31,cox32,cox33,constant3,
    												  iterator,es);
    		
    		gaussSeidel.solveUsingGaussSeidal();
    	}
    	}
    	
    	else if(choice==2)
    	{
    		float xl,xu,a,b,c,d,e,f;
    	
             boolean bisecTest =true;
             
             while(bisecTest){
    		System.out.println("enter coeffefficient of x5,x4,x3,x2,x1 and constant");
    		
    		a =sc.nextFloat();
    		b = sc.nextFloat();
    		c = sc.nextFloat();
    		d =sc.nextFloat();
    		e = sc.nextFloat();
    		f = sc.nextFloat();
    		
    		System.out.println("enter xl, xu and es in percentage ");
    		
    		xl=sc.nextFloat();
    		xu = sc.nextFloat();
    		es = sc.nextFloat();
    		
    		if (FuntionClass.functional_value(xl)*FuntionClass.functional_value(xu)>0)
    		{
    			System.out.println("There is no root bewettn given values. \nEnter another values");
    		}
    		
    		else 
    		{
    			bisecTest = false;
    			
    			BisectionMethod bisectionMethod = new BisectionMethod(a,b,c,d,e,f);
    			bisectionMethod.bisection(xl, xu, es);
    		}
    		
    	}
    	}
     	else if(choice==3)
    	{
    		float xl,xu,a,b,c,d,e,f;
    	
             boolean falseTest =true;
             
             while(falseTest){
    		System.out.println("enter coeffefficient of x5,x4,x3,x2,x1 and constant");
    		
    		a =sc.nextFloat();
    		b = sc.nextFloat();
    		c = sc.nextFloat();
    		d =sc.nextFloat();
    		e = sc.nextFloat();
    		f = sc.nextFloat();
    		
    		System.out.println("enter xl, xu and es in percentage ");
    		
    		xl=sc.nextFloat();
    		xu = sc.nextFloat();
    		es = sc.nextFloat();
    		
    		if (FuntionClass.functional_value(xl)*FuntionClass.functional_value(xu)>0)
    		{
    			System.out.println("There is no root bewettn given values. \nEnter another values");
    		}
    		
    		else 
    		{
    			falseTest = false;
    			
    			FalsePosition falsePosition = new FalsePosition(a,b,c,d,e,f);
    			falsePosition.false_position(xl, xu, es);
    			
    		}
    		
    	}
    	}
     	else if(choice==4)
     	{
     		float a,b,c,d,e,f;
     		float x0,xl,xr;
     		
     		System.out.println("input coefficients of x5,x4,x3,x2,x1 and x0");
     		
     		a =sc.nextFloat();
    		b = sc.nextFloat();
    		c = sc.nextFloat();
    		d =sc.nextFloat();
    		e = sc.nextFloat();
    		f = sc.nextFloat();
    		
    		System.out.println("input x0,xl and es in percentage ");
    		x0 = sc.nextFloat();
    		xl = sc.nextFloat();
    		es = sc.nextFloat();
    		System.out.println("iteration \t xl \t xu \t xr \t ea");
    		
    		SecantMethod secantMethod = new SecantMethod (x0,xl,es,a,b,c,d,e,f);
    		secantMethod.calculateValue();
     	}
     	else if(choice==5)
     	{
     		NewtonsInterpolatingPolynomials  newton = new NewtonsInterpolatingPolynomials();
     		newton.takeInput();
     		newton.calculateResult();
     		newton.printResult();
     		
     	}
    	
    }
}
}
