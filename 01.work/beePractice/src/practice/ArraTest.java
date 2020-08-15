package practice;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
//백준 2577
public class ArraTest {

	public static void main(String[] args){
		
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int[] rArray = new int[10];
		int result = 0;
		
		try{
			
			result = Integer.parseInt(br.readLine()) * Integer.parseInt(br.readLine()) * Integer.parseInt(br.readLine());
			
			String str = String.valueOf(result);
			
			for(int i = 0 ; i < str.length() ; i++){
				rArray[str.charAt(i) - 48]++;
				//-48 혹은 - '0'을 해주지 않으면 그냥 아스키코드 값이 들어가버림으로 유의할 것 
			}
			
			//변형for문
			//list나 ArrayList에서 사용하는 방법으로
			//j에 rArray의 값이 끝날때까지 순차적으로 넣어주는 것
			for(int j : rArray)	System.out.println(j);
			
		}catch(Exception e){
			e.getMessage();
		}
		
		//내가 푼 방법
//		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//		
//		String str1, str2, str3, result = "";
//		
//		int a,b,c = 0;
//		
//		int[] iArray;
//		int[] rArray = new int[10];
//		
//		try{
//			
//			str1 = br.readLine();
//			str2 = br.readLine();
//			str3 = br.readLine();
//			
//			a = Integer.parseInt(str1);
//			b = Integer.parseInt(str2);
//			c = Integer.parseInt(str3);
//			
//			result = (Integer.toString(a*b*c));
//
//			for(int i = 0; i < result.length(); i++){
//				iArray = new int[result.length()];
//				
//				iArray[i] = Integer.parseInt(result.substring(i, i+1)); 
//				
//				for(int j = 0 ; j < 10 ; j++){				
//				
//					if(iArray[i] == j){
//						rArray[j] += 1;
//					}
//				}
//			}
//			
//			br.close();
//			
//			for(int i = 0 ; i < 10 ; i++){
//				System.out.println(rArray[i]);
//			}
//			
//			
//			
//		}catch(Exception e){
//			e.getMessage();
//		}
		
	}
}
