package CLIENT;

import java.util.Random;

@FunctionalInterface 
interface X<T extends Number> {
    public abstract void compare(T x, T y);
}

public class BasicDemo2 {
    public static void main(String[] args) {
        X<Integer> r1 = (x, y) -> {
            Random R = new Random();
            System.out.println("Random Integer: " + (R.nextInt() % 100));
        };
        r1.compare(10, 20);

        X<Float> r2 = (x, y) -> {
            Random R = new Random();
            System.out.println("Ceil of Random Float: " + Math.ceil(R.nextFloat() * 100));
        };
        r2.compare(10.5f, 20.5f);
        
        X<Double> r3 = (x, y) -> {
            System.out.println("Comparing Doubles: " + x + " and " + y);
        };
        r3.compare(15.5, 30.7);
    }
}
