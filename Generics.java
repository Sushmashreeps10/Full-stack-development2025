package Generics;

import java.util.LinkedList;
import java.util.List;

class data{
	private Object obj;
	
	public data(Object obj) {
		this.obj= obj;
		}

	@Override
	public String toString() {
		return obj.toString();
	}
}

public class mian {
	public static void main(String[] args) {
		List<data> elements = new LinkedList<>();
		elements.add(new data("sushma"));
		elements.add(new data(243687));
		elements.add(new data("Bangalore"));
		elements.add(new data("TechM"));
		System.out.println(elements);
	}

}
