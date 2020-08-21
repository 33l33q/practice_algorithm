package practice;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;
//น้มุ 8958น๘
public class ArraTest {

	public static void main(String[] args){
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int iNum = 0;
		String[] iArray ;
		int[] cnt;
		int count = 0;
		try{
			 iNum = Integer.parseInt(br.readLine());
			 iArray = new String[iNum];
			 cnt = new int[iNum];
			 System.out.println(iNum);
			 
			 for(int i = 0 ; i < iArray.length; i++){
				 iArray[i] = br.readLine();
				 
				 String str = null;
				 str = iArray[i];
				 cnt[i] = 0;
				 count = 0;
				 System.out.println(str);
				 for(int j = 0; j < str.length(); j++){
					 if(Character.toString(str.charAt(j)).equals("O")){
						 cnt[i] += ++count;
						 System.out.println(str.charAt(j) + " >>>> " + cnt[i]);
					 }else{
						 count = 0;
					 }
					 
			 	}
			 }
			 
			 for(int result : cnt){
				 System.out.println(result);
			 }
			
		}catch(Exception e){
			e.getMessage();
		}
	}
}
