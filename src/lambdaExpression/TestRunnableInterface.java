package lambdaExpression;


public class TestRunnableInterface {
	public static void main(String[] args) {
		Runnable r = ()->{
			System.out.println("Implementing run method");
		};
		new Thread(r).start();
	}
}
