package Client;

import java.util.Random;


//Functional Interface using lambda method
@FunctionalInterface
interface X<T extends Number> {
    void compare(T x, T y);
}

public class BasicDemo2 {
    public static void main(String[] args) {
        X<Integer> r1 = (x, y) -> {
            Random R = new Random();
            System.out.println("Random Integer: " + ((R.nextInt() % 100) + x + y)); // Using x and y
        };
        r1.compare(10, 20);

        X<Float> r2 = (x, y) -> {
            Random R = new Random();
            System.out.println("Ceil of Random Float: " + Math.ceil(R.nextFloat() * (x + y))); // Using x and y
        };
        r2.compare(10.5f, 20.5f);

        X<Double> r3 = (x, y) -> {
            System.out.println("Comparing Doubles: " + x + " and " + y);
            System.out.println("Result: " + Double.compare(x, y));
        };
        r3.compare(1.2, 2.3);
    }
}
