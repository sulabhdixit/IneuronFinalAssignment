package ineuronfinalassignment.solution1;

public class Triangle implements Shape {
	private double s1;
	private double s2;
	private double s3;

	public Triangle(double s1, double s2, double s3) {
		this.s1 = s1;
		this.s2 = s2;
		this.s3 = s3;
	}

	public double area() {
		double a = s1+s2+s3 / 2;
		return Math.sqrt(a*(a-s1)*(a-s2)*(a-s3));
	}

	public double perimeter() {
		double p = s1 + s2 + s3;
		return p;
	}
}
