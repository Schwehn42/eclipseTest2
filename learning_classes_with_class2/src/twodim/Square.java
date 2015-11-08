package twodim;

import learning_classes_with_class2.Shape2D;

public class Square extends Shape2D {

	private float a;
	private float b;
	
	public Square(float a, float b) {
		this.a = a;
		this.b = b;
	}

	@Override
	public float area() {
		return this.a * this.b;
	}

	@Override
	public float extent() {
		return 2 * (this.a + this.b);
	}
	
	public float getA() {
		return this.a;
	}
	public float getB() {
		return this.b;
	}

}
