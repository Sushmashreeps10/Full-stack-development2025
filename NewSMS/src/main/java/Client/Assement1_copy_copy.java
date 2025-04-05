package Client;

import java.util.function.Function;

public class Assement1_copy_copy {
	public static void main(String[] args) {
		
//		Explanation => 
//		    The syntax Function<T, R> means:
//			f → Type of input parameter (here, Double).
//			t → Type of return value (here, Double).
//			In this case, Function<Double, Double> means:
//			It takes a Double as input (the radius of a circle).
//			It returns a Double as output (the area of the circle).
//		
		
		Function <Double, Double> f = t ->{
			return 3.141*t*t;
		};
		System.out.println("the area ="+ f.apply(3.23));
	}
}
