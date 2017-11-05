package shayer;

public class Vau {
	double width;
double height;
double depth;
// constructor used when all dimensions specified
Vau(double w, double h, double d) {
width = w;
height = h;
depth = d;
}
// constructor used when no dimensions specified
Vau() {
width = -1; // use -1 to indicate
height = -1; // an uninitialized
depth = -1; // box
}
// constructor used when cube is created
Vau(double len) {
width = height = depth = len;
}
// compute and return volume
double volume() {
return width * height * depth;
}
}