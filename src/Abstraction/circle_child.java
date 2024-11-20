package Abstraction;

public class circle_child extends AbstractClassShape {
	
		private double radius;
	
		public circle_child() {
		this(1);
		}
	
		public circle_child(double r) {
		radius = r;
		}
	
		public void setRadius(double r) {
		radius = r;
		}
		
		@Override
		public double area() {
		return Math.PI * Math.pow(radius, 2);
		}
	
		@Override
		public double perimeter() {
		return 2 * Math.PI * radius;
		}
	
	}
