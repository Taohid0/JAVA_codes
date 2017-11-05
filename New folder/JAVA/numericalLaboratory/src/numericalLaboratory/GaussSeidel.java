package numericalLaboratory;

public class GaussSeidel {

	float x1,x2,x3;
	
	float cox11,cox12,cox13;
	float cox21,cox22,cox23;
	float cox31,cox32,cox33;
	float constant1,constant2,constant3;
	float es1,es2,es3;
	float es;
	
	int iterator;
	float prevx1,prevx2,prevx3;
	
	
	
	public GaussSeidel(float cox11, float cox12, float cox13,float constant1, 
			float cox21, float cox22,float cox23,float constant2,
			float cox31,float cox32, float cox33,float constant3,
			int iterator,float es) {
		super();
		this.cox11 = cox11;
		this.cox12 = cox12;
		this.cox13 = cox13;
		this.cox21 = cox21;
		this.cox22 = cox22;
		this.cox23 = cox23;
		this.cox31 = cox31;
		this.cox32 = cox32;
		this.cox33 = cox33;
		this.iterator = iterator;
		this.es = es;
		this.constant1 = constant1;
		this.constant2 = constant2;
		this.constant3=  constant3;
		
		x2=0;
	    x3=0;
	}
	
	public void solveUsingGaussSeidal()
	{
		int i=0;
		boolean printed = false;
		System.out.println("iretation\t\tx1\t\tx2\t\tx3\t\tesx1\t\tesx2\t\tesx3");
		while(i<iterator)
		{
			x1 = (constant1-cox12*x2-cox13*x3)/cox11;
			x2 = (constant2-cox21*x1-cox23*x3)/cox22;
			x3 = (constant3-cox31*x1-cox32*x2)/cox33;
			i++;

			
			if(i>1)
			{
				es1 = Math.abs((x1-prevx1)/x1);
				es2 = Math.abs((x2-prevx2)/x2);
				es3 = Math.abs((x3-prevx3)/x3);
				
				if(es1<=es && es2<=es && es3<=es && printed==false){
	
					printed=true;
					System.out.println("\nbelow given error percentage\n");
		              
		           }
				System.out.println("\t"+i+"\t"+x1+"\t"+x2+"\t"+x3+"\t"+es1*100+"\t"+es2*100+"\t"+es3*100);	
				}
	
            
            prevx1 = x1;
            prevx2 =x2;
            prevx3 =x3;
			
		}
	}

	public float getCox11() {
		return cox11;
	}

	public void setCox11(float cox11) {
		this.cox11 = cox11;
	}

	public float getCox12() {
		return cox12;
	}

	public void setCox12(float cox12) {
		this.cox12 = cox12;
	}

	public float getCox13() {
		return cox13;
	}

	public void setCox13(float cox13) {
		this.cox13 = cox13;
	}

	public float getCox21() {
		return cox21;
	}

	public void setCox21(float cox21) {
		this.cox21 = cox21;
	}

	public float getCox22() {
		return cox22;
	}

	public void setCox22(float cox22) {
		this.cox22 = cox22;
	}

	public float getCox23() {
		return cox23;
	}

	public void setCox23(float cox23) {
		this.cox23 = cox23;
	}

	public float getCox31() {
		return cox31;
	}

	public void setCox31(float cox31) {
		this.cox31 = cox31;
	}

	public float getCox32() {
		return cox32;
	}

	public void setCox32(float cox32) {
		this.cox32 = cox32;
	}

	public float getCox33() {
		return cox33;
	}

	public void setCox33(float cox33) {
		this.cox33 = cox33;
	}

	public float getConstant1() {
		return constant1;
	}

	public void setConstant1(float constant1) {
		this.constant1 = constant1;
	}

	public float getConstant2() {
		return constant2;
	}

	public void setConstant2(float constant2) {
		this.constant2 = constant2;
	}

	public float getConstant3() {
		return constant3;
	}

	public void setConstant3(float constant3) {
		this.constant3 = constant3;
	}

	public float getEs() {
		return es;
	}

	public void setEs(float es) {
		this.es = es;
	}

	public int getIterator() {
		return iterator;
	}

	public void setIterator(int iterator) {
		this.iterator = iterator;
	}

}

