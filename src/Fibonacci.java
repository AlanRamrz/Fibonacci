
public class Fibonacci {

	public static void printFibonacciSequence(int untilElem) {
		int before = 0;
		int now = 1;
		int elem = 0;

		if (untilElem < 1) {
			System.out.println("Elements must be greater or equal than 1.");
		}
		else {
			System.out.println("Fibonacci sequence -> " + untilElem + " elements.");

			for (int i = 1; i <= untilElem; i++) {

				if (i == 1) {
					System.out.print("0  ");
				}
				else if (i == 2) {
					System.out.print("1  ");
				} 
				else {
					elem = before + now;
					System.out.print(elem + "  ");
					before = now;
					now = elem;
				}
			}
		}
	}
}
