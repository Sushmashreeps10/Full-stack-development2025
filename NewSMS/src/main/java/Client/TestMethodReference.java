package Client;

import java.util.function.Supplier;

class M{
	static int a = 10;
	public static int math1() {
		return(a);
	}
}

public class TestMethodReference {
	public static void main(String[] args) {
		
		Supplier<Integer> i = () ->{
			return M.math1();
		};
		System.out.println(i.get());
	}

}
