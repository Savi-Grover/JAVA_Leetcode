package Abstraction;


//Shape demo creates an instance of the Rectangle and the Circle class and assign it to a reference
//of type Shape. Finally area() and perimeter() functions are called over instance of Rectangle and
//Circle class.
public class ShapeDemo {
	
public static void main(String[] args) {
	double width = 2, length = 3;
	
	AbstractClassShape rectangle = new rectangle_child(width, length);
	
	System.out.println("Rectangle width: " + width + " and length: " + length
	+ " Area: " + rectangle.area()
	+ " Perimeter: " + rectangle.perimeter());
	
	double radius = 10;
	AbstractClassShape circle = new circle_child(radius);
	System.out.println("Circle radius: " + radius
	+ " Area: " + circle.area()
	+ " Perimeter: " + circle.perimeter());
	}
}
