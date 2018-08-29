import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Write the number of elements for the Fibonacci sequence: ");
		
		try {
			int elements = scan.nextInt();
			Fibonacci.printFibonacciSequence(elements);
		} 
		catch (Exception e) {
			System.out.println("Please write a number.");
		}
		
		scan.close();
	}

}
