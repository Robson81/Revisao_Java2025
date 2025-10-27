package classesBPM;

public class AritmeticaClass {

	
private static final Double PI = 3.14159;
private static final Double MILES_NAUICAL_CONVETER = 1.852;
private static final Double FAHRENHEIT = (1.8) + 32;
private Double width;
private Double height;
private Double radius;
private Double average;
//private Double num;


public AritmeticaClass() {
	
}

public AritmeticaClass(double width, double height) {
	super();
	this.width = width;
	this.height = height;
}
public AritmeticaClass(double diameter) {
	 
	this.radius = diameter;
}
public Double getWidth() {
	return width;
}
public void setWidth(Double width) {
	this.width = width;
}
public Double getHeight() {
	return height;
}
public void setHeight(Double height) {
	this.height = height;
}
public Double getAverage() {
	return average;
}
public void setAverage(Double average) {
	this.average = average;
}

public double quadrilateralArea(double x, double y) {
	
	return x*y;
}
public double quadrilateralArea(double x) {
	
	//double width = x*Math.sqrt(2)/Math.sqrt(2);
	return Math.pow(x, 2);
}
public double quadrilateralDiagonalArea(double x) {
	
	double width = x*Math.sqrt(2)/2;
	return Math.pow(width, 2);
}
public double triangleArea(double x, double y) {
	
	return x*y/2;
}
public double spheareVolume(double x) {
	
	radius = x/2;
	return  4*PI*Math.pow(radius, 3)/3;
	
}
public double arithmeticAverage(double x, double y) {
	
	return x/y;
}
public double geometricAverage(double x) {
	
	return  Math.sqrt(x);
}
public double nauticalMilesConverter(double x) {
	
	return x * MILES_NAUICAL_CONVETER; 
}
public double ohmsLaw(double x, double y) {
	
	return x*y;
}
public double fahrenheitConverter(double x) {
	
	return x* FAHRENHEIT;
}
public double circleArea(double x) {
	
	radius = x/2;
	return PI*Math.pow(radius, 2);
}
public double coneVolume(double x, double y) {

return  1/3 *PI *Math.pow(radius, 2)* y;
}
public double finalVelocity(double x, double y, double z) {
	
	return (x + (y*z) )*3.6;
}
public double sphereVolumeCubeVolume(double x, double y) {
	
	
	return  Math.pow(x, 3) - 4*PI*Math.pow(y, 3)/3;
}
public double currencyConverter(double x, double y) {
	
	return x*y;
}

public String trigonometricfunctions( Double x) {
	
	return String.format("Sine Fuction: %.0f", Math.sin(x)) + "\n" +
		   String.format("Cos Fuction: %.0f", Math.cos(x)) + "\n" +
		   String.format("Tang Fuction: %.0f", Math.tan(x)) + "\n" +
		   String.format("Cos Fuction: %.0f", 1/Math.cos(x)) + "\n";
		   
}
public String powFuctionLogFuction(double x, double y) {
	
 return String.format(" X to the Y:  %.2f", Math.pow(x, y));
}
public double change(double x, double y) {
	
	return x - y;
}

}

