package practice;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main4 {
	
	public static void main(String arg[]){
//			int a = 1, b = 2, c = 0;
//			System.out.println(a +  " " + b + " " + c);
//			c = ++a + b ++ ;
//			System.out.println(a +  " " + b + " " + c);
//			c += b ;
//			System.out.println(c);
//	
		int a = 2, b = 1, c = 0;
		
		for(;a<5;a++){
			if(c++>b){
				b = a + c;
			}
			System.out.println(c);
		}
	
	}

}
