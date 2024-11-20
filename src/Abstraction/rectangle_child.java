package Abstraction;

public class rectangle_child extends AbstractClassShape {
		private double width, length;
		
		public rectangle_child() {
		this(1,1);
		}
		
		public rectangle_child(double w, double l) {
		width = w;
		length = l;
		}
		public void setWidth(double w) {
		width = w;
		}
		public void setLength(double l) {
		length = l;
		}
		@Override
		public double area() {
		return width * length;
		}
		@Override
		public double perimeter() {
		return 2*(width + length);
		}
	}

