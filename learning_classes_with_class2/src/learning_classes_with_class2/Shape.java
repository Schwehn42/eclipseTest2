package learning_classes_with_class2;

public abstract class Shape {
	public String name;
	public abstract int area();
	public abstract int extent();
	
	public Shape(String name) {
		this.name = name;
	}
}
