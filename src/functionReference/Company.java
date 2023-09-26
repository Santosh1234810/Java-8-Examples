package functionReference;

import java.util.function.Supplier;

public class Company {
	public static void main(String[] args) {
		Supplier<Double> randomValue =()-> Math.random();
		System.out.println(randomValue.get());
	}
}
