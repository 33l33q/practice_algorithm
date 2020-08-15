package practice;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class ArraTest {

	public static void main(String[] args){
		
		Scanner scan = new Scanner(System.in);
		
		int maxNum = 0; //가장 큰 수
		int maxNo = 0;	//가장 큰 수의 번호
		int cnt = 1;
		int[] iArray = new int[9];
		Map<Integer, Integer> hm = new HashMap<>();
			
			
			for(int i = 0; i < 9; i++){
				iArray[i] = scan.nextInt();
				hm.put(iArray[i], cnt++);
			}
			
			Arrays.sort(iArray);
			maxNum = iArray[8];
			
			maxNo = hm.get(maxNum);
			System.out.println(maxNum);
			System.out.println(maxNo);
	}
}
