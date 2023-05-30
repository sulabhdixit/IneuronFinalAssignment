package ineuronfinalassignment.solution1;

public class Main {

	public static void main(String[] args) {
		Circle c = new Circle(2.5);
		System.out.println("Area of circle is :" + c.area());
		System.out.println("Perimeter of circle is :" + c.perimeter());
		Triangle t = new Triangle(1, 2, 3);
		System.out.println("Area of Triangle is :" + t.area());
		System.out.println("Perimeter of Triangle is :" + t.perimeter());

	}

}
