package twodim;

import learning_classes_with_class2.Shape2D;

public class Triangle extends Shape2D {

	private float a, b, c;
	private float heightA, heightB, heightC;
	
	public Triangle(float a, float b, float c) {
		this.a = a;
		this.b = b;
		this.c = c;
		
		//Pythagoras
		this.heightA = a/2 * (float) Math.sqrt(3);
		this.heightB = b/2 * (float) Math.sqrt(3);
		this.heightC = c/2 * (float) Math.sqrt(3);
	}
	
	@Override
	public float area() {
		return 0.5f * a * heightA;
	}

	@Override
	public float extent() {
		return a + b + c;
	}
	
	public float getA() {
		return this.a;
	}
	public float getB() {
		return this.b;
	}
	public float getC() {
		return this.c;
	}
	public float getHeightA() {
		return this.heightA;
	}
	public float getHeightB() {
		return this.heightB;
	}
	public float getHeightC() {
		return this.heightC;
	}
	
}
