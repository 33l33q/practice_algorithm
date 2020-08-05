package practice;

import java.util.Arrays;
import java.util.Scanner;

public class ArraTest {

	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		
		int count = 0;
		int max = 0;
		int min = 0;
		
		count = scan.nextInt();
		
		int[] iArray = new int[count];
		
		for(int i = 0; i < count ; i++){
			iArray[i] = scan.nextInt();

		}

		Arrays.sort(iArray);

		min = iArray[0];
		max = iArray[count-1];

		System.out.println(min + " " + max);
		
	}
}
