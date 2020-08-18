package practice;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;
//백준 1546번
public class ArraTest {

	public static void main(String[] args){
		
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		double m = 0.0; //최댓값
		double s = 0.0;//다 더해진 값
		double arg = 0.0; //평균값
		int iNum = 0; //길이
		try{
			
			iNum = (Integer.parseInt(br.readLine()));
		
			double nArray[] = new double[iNum];
			
			String sArray[] = br.readLine().split(" ");
			
			for(int i = 0 ; i < nArray.length ; i++){
				nArray[i] = Double.parseDouble(sArray[i]);
				
				if(nArray[i]>m){
					m = nArray[i];
				}
			}
			
			for(int j = 0 ; j < nArray.length ; j++){
				s += nArray[j] / m * 100;
				
			}
			
			arg = s / iNum;
		
			System.out.println(arg);
			
		}catch(Exception e){
			e.getMessage();
		}
		
	}
}


//
//
//iNum = (Integer.parseInt(br.readLine()));
//
////스플릿사용법
////numbers = br.readLine();
////String sArray[] = numbers.split("");
//
//double nArray[] = new double[iNum];
//
//StringTokenizer st = new StringTokenizer(br.readLine(), " ");
//
//for(int i = 0 ; i < nArray.length ; i++){
//	nArray[i] = Double.parseDouble(st.nextToken());
//	System.out.println("nArray[i]   >>> " + nArray[i]);
//}
//
//Arrays.sort(nArray);
//
//m = nArray[nArray.length - 1];
//System.out.println(m);
//
//for(int j = 0 ; j < nArray.length ; j++){
//	s += nArray[j] / m * 100;
//	System.out.println("nArray["+j+"]   >>> " + s + " : " + nArray[j]);
//	
//}
//
//arg = s / iNum;
//
//System.out.println("arg >>>> " +arg);
//
//}catch(Exception e){
//e.getMessage();
//}
//
//}
