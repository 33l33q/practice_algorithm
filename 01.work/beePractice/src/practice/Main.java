package practice;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		int A , B = 0;

		A = sc.nextInt();
		B = sc.nextInt();
		
		System.out.println(A*(B%10));
		System.out.println(A*((B%100)/10));
		System.out.println(A*(B/100));
		System.out.println(A*B);

	}
}
