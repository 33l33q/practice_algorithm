package practice;

import java.util.ArrayList;
import java.util.List;

public class MethodTest {

	public static void main(String[] args) {

		int tArray[] = new int[10000];
		
		int sum = 0;
		
		for(int i = 0 ; i < 10000 ; i++){
			String str = Integer.toString(i);

			int iArray[] = new int[str.length()];
			
			for(int j = 0 ; j < str.length(); j++ ){
				
				iArray[j] = str.charAt(j) - 48;	
				
				sum += iArray[j];
			}
			
			sum = sum + i;
			tArray[i] = sum;
			
		} //end of main
		
		
		for(int a = 1 ; a <= 10000 ; a++ ){
			if(a == tArray[a-1] ){
				System.out.println(a);
			}
			
		}
		
		
	}//end of main

}//end of class

