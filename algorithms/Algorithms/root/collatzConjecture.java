/*
 * This program figures out how many steps it takes to do the collatz conjecture algorithm
 *  (No matter what number you start with, you will eventually reach the number 1)
 */
import java.util.*;

public class collatzConjecture {
	static int cnt=0;
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		System.out.println("Enter a number > 1");
		int x = scan.nextInt();
		scan.close();
		collatzConjectureM(x);
		System.out.println("Steps: " + cnt);
		
	}
	
	public static void collatzConjectureM (int x) {
		cnt++;
		System.out.print(x + " ");
		if (x == 1) return;
		else if (x % 2 == 0) {
			collatzConjectureM(x/2);
		}
		else {
			collatzConjectureM(3*x +1);
		}
	}
}