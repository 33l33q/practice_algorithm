package practice;

import java.util.Scanner;

public class Main2 {

	public static void main(String[] args){

		Scanner sc = new Scanner(System.in);
		
		int H , M = 0;
		H = sc.nextInt();
		M = sc.nextInt();

		M = M - 45;
		
		if(M < 0){
			M = (60 + M );
			if(H == 0 ){
				H = 23;
			}else if(H>0){
				H = H - 1;
			}
		}
	
		System.out.print(H + " " + M);
	}
}
