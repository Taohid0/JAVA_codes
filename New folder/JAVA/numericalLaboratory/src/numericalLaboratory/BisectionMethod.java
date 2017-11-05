package numericalLaboratory;

public class BisectionMethod {

	    float a,b,c,d,e,f;
	    float xl,xu,es;
	    
	
	  
	  
	  public BisectionMethod(float a, float b, float c, float d, float e, float f) {
			super();
			this.a = a;
			this.b = b;
			this.c = c;
			this.d = d;
			this.e = e;
			this.f = f;
		
		}




	void bisection(float xl,float xu, float es){
	       
		  int i=1;
		  
	      float ea=100.0f, xr,xrold=xl,fl=FuntionClass.functional_value(xl),fr,fu= FuntionClass.functional_value(xu); 
	      
	      System.out.println("iteration \t xl \t xu \t xr \t ea");
	      
	      while(ea>es)
	      {
	    	  xr = (xl+xu)/2;
	    	  fr = FuntionClass.functional_value(xr);
	    	  
	    	  if(xr!=0)
	    		  ea= ((Math.abs(xr-xrold)/xr))*100;
	    	 
	          System.out.format("%d \t %f \t %f \t %f",i++,xl,xu,xr);
	          
	          if(fl*fr>0)
	          {
	        	  xl = xr;
	        	  fu =  fr;
	          }
	          else if( fu*fr>0)
	          {
	        	  xu = xr;
	        	  fu = fr;
	          }
	          
	          System.out.format("%f ",ea);
	          
	          if(ea<es)
	        	  break;
	          xrold = xr;
	      }
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




	public float getF() {
		return f;
	}




	public void setF(float f) {
		this.f = f;
	}




	public float getXl() {
		return xl;
	}




	public void setXl(float xl) {
		this.xl = xl;
	}




	public float getXu() {
		return xu;
	}




	public void setXu(float xu) {
		this.xu = xu;
	}




	public float getEs() {
		return es;
	}




	public void setEs(float es) {
		this.es = es;
	}
	
}
