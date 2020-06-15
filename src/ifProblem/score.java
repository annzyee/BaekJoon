package ifProblem;

import java.util.*;

public class score {

	public static void main(String[] args) {
		int i = 0;

		Scanner sc = new Scanner(System.in);
		i = sc.nextInt();

		if (i >= 90) {
			System.out.println("A");
		} else if (i >= 80 && i < 90) {
			System.out.println("B");
		} else if (i >= 70 && i < 80) {
			System.out.println("C");
		} else if (i >= 60 && i < 70) {
			System.out.println("D");
		} else {
			System.out.println("F");
		}
	}
}
