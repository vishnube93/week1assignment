package week1.assignment;

public class PrimeNumber {
	public static void main(String[] args) {
		int n = 13;
		boolean flag = false;
		for (int i = 2; i < n / 2; i++) {
			if (n % i == 0) {
				flag = true;
				break;
			}
		}
		if (flag == false) {
			System.out.println(n + " is a Prime Number");
		} else {
			System.out.println(n + " is not a Prime Number");
		}
	}

}
