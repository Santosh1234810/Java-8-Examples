package lambdaExpression;

interface Factorial
{
	void fact(int n);
}
public class TestFactorial {
	public static void main(String[] args) {
		Factorial obj = (n)->
		{
			int f = 1;
			
			while (n!=0)
			{
				f = f * n;
				n--;
			}
			System.out.println("Factorial is: "+f);
		};
		obj.fact(5);
	}
}
