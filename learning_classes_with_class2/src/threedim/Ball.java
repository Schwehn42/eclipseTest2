package threedim;
import learning_classes_with_class2.Shape3D;
import twodim.Circle;

public class Ball extends Shape3D {

	private float radius;
	
	public Ball(float radius) {
		this.radius = radius;
	}
	
	public Ball(Circle cl) {
		this.radius = cl.getRadius();
	}
	
	@Override
	public float volume() {
		return (float) ((4/3) * Math.PI * Math.pow(radius, 3));
	}

	@Override
	public float surface() {
		return (float) (Math.PI * radius * radius);
	}

	public float getRadius() {
		return this.radius;
	}

}
