import java.util.Scanner;

public class Factorial{
	public static void main(String[] args){
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Find Factorial of");
		int number = input.nextInt();
		
		int factorial_part = number;
		int factorial = 1;
		while(factorial_part > 0){
			factorial *= factorial_part;
			factorial_part -= 1;
			
		}
		System.out.println(factorial);
		
	}
}
