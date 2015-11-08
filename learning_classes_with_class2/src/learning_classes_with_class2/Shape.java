package learning_classes_with_class2;

public abstract class Shape {
	public String name;
	public abstract float area();
	public abstract float extent();
	
	public Shape() {}
	public Shape(String name) {
		this.name = name;
	}
}
