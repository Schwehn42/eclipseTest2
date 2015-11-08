package learning_classes_with_class2;

import threedim.Cube;
import twodim.Square;
import twodim.Triangle;

public class Main {

	public static void main(String[] args) {
		Square sq1 = new Square(3, 4);
		System.out.println(sq1.area());
		System.out.println(sq1.extent() + "\n");
		
		Triangle tr1 = new Triangle(1, 1, 1);
		System.out.println(tr1.area());
		System.out.println(tr1.extent() + "\n");
		
		Cube cb1 = new Cube(sq1, 7);
		System.out.println(cb1.volume());
		System.out.println(cb1.surface() + "\n");

	}

}
