package practice;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class MethodTest {

	public void mTest1(){
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in) );
		
		try{
			int iVal = 0, cnt = 1;
			String sVal = null;
			int[] iArray = null;
			int[] dArray= new int[2];
			

			if(sVal.length() == 1 || sVal.length() ==  2 ){
				for(int i = 0 ; i < Integer.parseInt(sVal); i++){
					cnt++;
				}
			}else{
				
			}
			
			
			for(int i = 0 ; i < sVal.length() ; i++){
				iArray = new int[sVal.length()];
				iArray[i] = sVal.charAt(i) - 48;
	
			}
			
			
			for(int j = 1 ; j < sVal.length() ; j++){
				dArray = new int[sVal.length() - 1] ; 
				dArray[j-1] = iArray[j] - iArray[j-1];
				
				if(sVal.length() == 1) cnt++;
				else if(sVal.length() == 3) if(dArray[0] == dArray[1]) cnt++;
			
			
			}
		
		}catch(Exception e){
			
		}
	}

	
	public static void main(String[] args) {

		
		
		MethodTest mt = new MethodTest();
		
		
	}//end of main

}//end of class

