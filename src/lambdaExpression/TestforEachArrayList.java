package lambdaExpression;

import java.util.ArrayList;

public class TestforEachArrayList {
	public static void main(String[] args) {
		
		ArrayList<Integer> list = new ArrayList<Integer>();
		list.add(10);
		list.add(20);
		list.add(30);
		list.add(40);
		list.add(50);
		
		list.forEach((n) -> System.out.println(n));
	}
}
