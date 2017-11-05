package numericalLaboratory;

public class SecantMethod {

	double funtional_value(double x)
	{
		  return a*x*x*x*x*x+b*x*x*x*x*x+c*x*x*x+d*x*x+e*x+f;
	}
	
	int i = 1;
	
	float x0,xl,xr,es,ea=99.0f;
	float  a,b,c,d,e,f;
	public SecantMethod(float x0, float xl, float es, float a, float b, float c, float d, float e, float f) {
		super();
		this.x0 = x0;
		this.xl = xl;
		this.es = es;
		this.a = a;
		this.b = b;
		this.c = c;
		this.d = d;
		this.e = e;
		this.f = f;
	}
		

	void calculateValue(){
	while(ea>es)
	{
		if(funtional_value(x0) != funtional_value(xl))
		{
			xr = (float) (xl - (funtional_value(xl)* (x0-xl)/(funtional_value(x0)-funtional_value(xl))));
			
		}
		if(xr!=0)
		{
			ea = Math.abs((xr-xl)/xr)*100;
		}
		System.out.printf("\n%d     %f     %f     %f     %f    %f",i++,x0,xl,xr,funtional_value(xr),ea);
	    
		x0 = xl;
		xl = xr;
	
	}
	System.out.println("\nRoot of the equation is "+ xr);
	}


	public float getX0() {
		return x0;
	}


	public void setX0(float x0) {
		this.x0 = x0;
	}


	public float getXl() {
		return xl;
	}


	public void setXl(float xl) {
		this.xl = xl;
	}


	public float getEa() {
		return ea;
	}


	public void setEa(float ea) {
		this.ea = ea;
	}


	public float getA() {
		return a;
	}


	public void setA(float a) {
		this.a = a;
	}


	public float getB() {
		return b;
	}


	public void setB(float b) {
		this.b = b;
	}


	public float getC() {
		return c;
	}


	public void setC(float c) {
		this.c = c;
	}


	public float getD() {
		return d;
	}


	public void setD(float d) {
		this.d = d;
	}


	public float getE() {
		return e;
	}


	public void setE(float e) {
		this.e = e;
	}
	
}
