package practice;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
//���� 2577
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
				//-48 Ȥ�� - '0'�� ������ ������ �׳� �ƽ�Ű�ڵ� ���� ���������� ������ �� 
			}
			
			//����for��
			//list�� ArrayList���� ����ϴ� �������
			//j�� rArray�� ���� ���������� ���������� �־��ִ� ��
			for(int j : rArray)	System.out.println(j);
			
		}catch(Exception e){
			e.getMessage();
		}
		
		//���� Ǭ ���
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