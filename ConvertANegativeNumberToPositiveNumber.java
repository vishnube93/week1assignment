package week1.assignment;

public class ConvertANegativeNumberToPositiveNumber {

	public static void main(String[] args) {
		int n = -40;
		if (n < 0) {
			n = -n;
			System.out.println("Converted positive number is " + n);
		}

	}

}
