package numericalLaboratory;

public class FalsePosition {
	
	float a,b,c,d,e,f;
	
	
	
	public FalsePosition(float a, float b, float c, float d, float e, float f) {
		super();
		this.a = a;
		this.b = b;
		this.c = c;
		this.d = d;
		this.e = e;
		this.f = f;
	}



	void false_position(float xl, float xu, float es)
	{
		
		
		int i=1;
		float ea = (float) 100.0 , xr, xrold = xl, fl = FuntionClass.functional_value(xl),
				fu = FuntionClass.functional_value(xu),fr;
		
		System.out.println("Iteration \t xl \t xu \t ea");
		
		while (ea>es)
		{
			xr = xu- (fu*(xl-xu)/(fl-fu));
			fr= FuntionClass.functional_value(xr);
			
			if(xr!=0)
			{
				ea= ((Math.abs(xr-xrold)/xr))*100;
				
				System.out.format("%d %f %f %f ",i++,xl,xu,xr);
			}
			if(fl*fr>0)
			{
				xl =xr;
				fl = FuntionClass.functional_value(xu);
			}
			System.out.println(ea);
			
			if(ea<es)break;
			
			xrold = xr;
		}
	}
}
