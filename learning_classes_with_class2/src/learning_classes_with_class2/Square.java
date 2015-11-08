package learning_classes_with_class2;

public class Square extends Shape {

	private float width;
	private float heigth;
	
	public Square() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Square(float width, float heigth) {
		this.width = width;
		this.heigth = heigth;
	}

	@Override
	public float area() {
		return this.width * this.heigth;
	}

	@Override
	public float extent() {
		return 2 * (this.width + this.heigth);
	}
	
	public float getWidth() {
		return this.width;
	}
	public float getHeigth() {
		return this.heigth;
	}

}
