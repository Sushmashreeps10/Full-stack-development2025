package Client;

import java.util.function.Function;

public class StaticMethodReferenceExample {
	public static int square(int num) {
		return num * num;
	}
	
	public static void main(String[] args) {
		
		Function<Integer, Integer> lambdaSquare = num -> StaticMethodReferenceExample.square(num);
		
		Function<Integer, Integer> methodSquare  = StaticMethodReferenceExample::square;
		
		
		System.out.println("Res using lambda Function = " + lambdaSquare.apply(5));
		System.out.println("res using method function = "+ methodSquare.apply(6));
		
	}
}
