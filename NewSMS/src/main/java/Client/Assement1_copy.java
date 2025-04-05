package Client;


//for anonymous interface
@FunctionalInterface
interface myShape {
	double area (int a, int b);
	
}

public class Assement1_copy {
	public static void main(String[] args) {
		myShape s = (x,y) -> {
			return 3.141*x*x;
		};
		
		//reusing the area
		double area = s.area(12, 20);
		System.out.println("the shape of area is:- "+ area);
	}

}
