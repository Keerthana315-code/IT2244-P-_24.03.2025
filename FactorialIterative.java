import java.util.Scanner;

public class FactorialIterative { 

    public static long factorial(int n) {
        long fact = 1;
        for (int i = 1; i <= n; i++) {
            fact *= i;
        }
        return fact;
    }

    public static void main(String[] args) { 
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: "); 
        int num = scanner.nextInt();
		
		long starttimeRec = System.nanoTime();
		long resultRec = FactRec(num);
		long endTimeRec = System.nanoTime();
        System.out.println("Factorial of " + num + " is: " + factorial(num)); 
        scanner.close(); 
    }
}
