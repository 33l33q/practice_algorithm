package practice;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Scanner;

public class If {
	
	int avg = 0, a = 0, sum = 0, i = 0, j = 0;
	
	Scanner scan = new Scanner(System.in);
	
	public int If_test(){
		
		int arry[] = new int[5];
		
		for(i = 0 ; i < 5 ; i++){
		
			arry[i] = scan.nextInt();
			if(arry[i] < 40) arry[i] = 40;
			sum += arry[i];
		}//end of for
		avg = sum/5;
		
		return avg;
	}
	
	
	public int If_test2(){
		
		int arry_b[] = new int[3];
		int arry_s[] = new int[2];
		
		for(i=0; i<5 ; i++){
			
			if(i<3)arry_b[i] = scan.nextInt();
			else arry_s[i-3] = scan.nextInt();

		}

		
		Arrays.sort(arry_b);
		Arrays.sort(arry_s);
		
		System.out.println(arry_b[0] + " : " + arry_s[0]);
		
		sum = arry_b[0] + arry_s[0] - 50;
	
		return sum;
	}
	
	public int If_test3(){
		
		int arry[] = new int[3];
		
		for(i=0; i<3 ; i++){
			
			arry[i] = scan.nextInt();

		}
		
		Arrays.sort(arry);
		
	
		a = arry[1];
		
		return a;
	}


	public void Star_test(){
		
		a = scan.nextInt();
		sum = (2*a)-1;
		
		for(i = 0 ; i <= sum ; i++ ){
			if(i < a ){
				for(j = 0 ; j <= i ; j++){
					System.out.print("*");
				}
			}else{
				for(j = 1 ; j <= (sum-i) ; j++){
					System.out.print("*" );
				}
			}
			System.out.println("" );
		}
		
	}
	
	public void Star_test2(){
		
		a = scan.nextInt();
		
		sum = (2*a)-1;
		
		for(i = 0 ; i < sum ; i++){

			if(i <= a - 1){
				for(j = 0 ; j < i ; j++){
					System.out.print(" ");
				}
				
				for(j = 0 ; j < sum - (2*i) ; j++){
					System.out.print("*");
				}
			}else{
				
				for(j = 0 ; j < sum - i - 1 ; j++){
					System.out.print(" ");
				}
				
				for(j = 0 ; j <= (2*i) - sum + 1 ; j++){
					System.out.print("*");
				}
				
			}
			
			System.out.println("");
			
		}
		
	}
	

	public void Star_test3(){
		a = scan.nextInt();
		

			for(i = 0 ; i < a*2 ; i++){
				if(i%2==0){
					for(j = 0; j < a ; j++){
						if(j%2==0)System.out.print("*");
						else System.out.print(" ");
					}
				}else if(i%2 != 0){
					for(j = 0; j < a ; j++){
						if(j%2==0) System.out.print(" ");
						else System.out.print("*");
					}
				}
					System.out.println("");
			}//end of for
				

	}

	public void Using_builder() throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
	
		a = Integer.parseInt(br.readLine());
		
		StringBuilder sb = new StringBuilder();
		
		for(i=0;i<a;i++){
			if(i%2==0) sb.append("*");
			else sb.append(" ");
		}
		
		sb.append("\n");
		
		for(i=0;i<a;i++){
			if(i%2!=0) sb.append("*");
			else sb.append(" ");
		}
		
		sb.append("\n");
		
		String str = sb.toString();
		
		for(i = 1 ; i < a ; i++){
			sb.append(str);
		}
		
		System.out.println(sb);
	
	}
	
	public static void main(String[] args){
		
		If it = new If();
		int result = 0;
		
//		result = it.If_test();
//		System.out.println(result);

//		result = it.If_test3();
//		System.out.println(result);
		
		it.Star_test3();
		
//		try{
//			it.Using_builder();
//		}catch(Exception e){
//			
//		}		
		
		
	}// end of main

}//end of class
