package shayer;

class OverloadCons {
	public static void main(String args[]) {
	// create boxes using the various constructors
	Vau mybox1 = new Vau(10, 20, 15);
	Vau mybox2 = new Vau();
	Vau mycube = new Vau(7);
	double vol;
	// get volume of first box
	vol = mybox1.volume();
	System.out.println("Volume of mybox1 is " + vol);
	// get volume of second box
	vol = mybox2.volume();
	System.out.println("Volume of mybox2 is " + vol);
	// get volume of cube
	vol = mycube.volume();
	System.out.println("Volume of mycube is " + vol);
	}
	
}