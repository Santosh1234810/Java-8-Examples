package lambdaExpression;

interface Addition
{
	int sum(int n1, int n2);
}
public class TestAddition {
	public static void main(String[] args) {
		Addition obj = (n1,n2)->{
			int n3 = n1 + n2;
			return n3;
		};
		
		
		System.out.println("Addition: "+obj.sum(10, 20));
	}
}
