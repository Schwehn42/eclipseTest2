package twodim;

import learning_classes_with_class2.Shape2D;

public class Circle extends Shape2D {

	private float radius;
	
	public Circle(float radius) {
		this.radius = radius;
	}
	
	@Override
	public float area() {
		return (float) Math.PI * radius * radius;
	}

	@Override
	public float extent() {
		return 2 * (float) Math.PI * radius;
	}

	public float getRadius() {
		return this.radius;
	}
	
}
