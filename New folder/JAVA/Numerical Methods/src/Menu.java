import java.util.Scanner;

public class Menu {
	

	public static void main(String[] args) {
		 
		
		
		
		
		
		int m,n;
		
		while (true) 
		{
			System.out.println("1.Roots of Equations\n2.Linear Algebraic Equations(Gauss Seidal Method)\n0.Main Menu ");
			Scanner sc = new Scanner(System.in);
			m = sc.nextInt();
			
			switch (m)
			{
				case 1: System.out.println("1.Bracketing Method\n2.Open Method(Secant Method)\n0.Back");
						n = sc.nextInt();
						if(n == 1)
						{
							FalsePositionMethod fpm = new FalsePositionMethod();
							fpm.start();
							break;
						}
						else if(n == 2)
						{
							SecantMethod sm = new SecantMethod();
							sm.start();
							break;
						}
						else {
							break;
						}
				
						
						
				case 2: GaussSeidel gs = new GaussSeidel();
						gs.start();
						break;
				case 3: NewtonsInterpolation newtonsInterpolation = new NewtonsInterpolation();
				        newtonsInterpolation.takeInput();
				        newtonsInterpolation.calculateResult();
				        newtonsInterpolation.printResult();
			    case 0: break;
				
			}

			
		}
		
		
		
	}

}
