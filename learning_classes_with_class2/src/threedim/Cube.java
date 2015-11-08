package threedim;

import learning_classes_with_class2.Shape3D;
import twodim.Square;

public class Cube extends Shape3D {

	float width, length, height;
	Square footprint;
	
	public Cube(float w, float l, float h) {
		this.width = w;
		this.length = l;
		this.height = h;
		
		this.footprint = new Square(w, l);
	}
	public Cube(Square sq, float height) {
		this.footprint = sq;
		this.width = sq.getA();
		this.length = sq.getB();
		this.height = height;
	}
	
	@Override
	public float volume() {
		return this.height * this.length * this.width;
	}

	@Override
	public float surface() {
		return footprint.area() * 6;
	}

}
