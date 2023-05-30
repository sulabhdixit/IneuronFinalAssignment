package ineuronfinalassignment.solution1;

public class Circle implements Shape {
	private double r;

	public Circle(double r) {
		this.r = r;
	}

	public double area() {
		double a = 3.14 * r * r;
		return a;
	}

	public double perimeter() {
		double p = 2 * 3.14 * r;
		return p;
	}

}
