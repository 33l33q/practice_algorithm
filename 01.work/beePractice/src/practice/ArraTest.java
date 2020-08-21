package practice;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
//백준 4344번
public class ArraTest {

	public static void main(String[] args){
		BufferedReader  br = new BufferedReader(new InputStreamReader(System.in));
		int mNum = 0;//전체 갯수
		int cNum = 0;//케이스의 총 갯수
		double cnt = 0;
		double[] dArray = null;
		double[] result = null;
		double sum = 0.0;
		double avg = 0.0;
		String[] sArray = null;
		
		try{
			
			mNum = Integer.parseInt(br.readLine());
			sArray = new String[mNum];
			result = new double[mNum];
			
			for(int i = 0; i < sArray.length ; i++){
				
				sArray[i] = br.readLine();
				StringTokenizer st = new StringTokenizer(sArray[i]);
				
				cNum = Integer.parseInt(st.nextToken(" ")); //해당 케이스의 인원수
				
				dArray = new double[cNum];
				
				for(int j = 0 ; j < cNum ; j++){
					dArray[j] = Double.parseDouble(st.nextToken(" "));
					sum += dArray[j];
				}
				
				avg = sum/cNum;
				
				for(int j = 0 ; j < cNum ; j++){
					if(dArray[j] > avg){
						cnt++;
					}
				}//end of for j
				
//				result[i] = (Math.round(((cnt*100)/cNum)*1000))/1000.0;
				result[i] = (cnt*100)/cNum;
				
				sum = 0;
				avg = 0;
				cnt = 0;
			}//end of for i
			
			for(double d : result){
				System.out.println(String.format("%.3f", d) + "%");
			}
			
		}catch(Exception e){
			e.getMessage();
		}
		
		
	}//end of main
}
