import java.util.Scanner;
public classs FactorialIterative
{
	public static long factorial(int n)
	{
		long fact =1;
		for(int i=1;i<n;i++)
		{
			fact *= i;
		}
		return fact;
	}
	public static void main(String args[])
	{
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter a number : ");
		int num = scanner.nextInt();
		System.out.println("factorial of "+num+"is :"+factorial(num));
	}
}