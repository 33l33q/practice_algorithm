package ex;

import java.util.Scanner;

public class ExamePratice {
	
	public static void main(String[] args){
		System.out.print("Hello World");
	
		int i = 0;
		int a = 0;
		
		for(i = 0;i <= 10; ++i ){
			a += i;
		}
		System.out.println(a);
	
		int j = 0;
		
//		for(i = 1 ; i < 10 ; i++){
//			for(j = 1 ; j < 10 ; j++){
//				int x = i * j;
//				System.out.println(i + "x" + j + "=" + x);
//			}
//		}
//
//		int count = 0;
//		for(i=1; i<10; i++){
//			if((3*i)%4!=0){
//				System.out.println(i*3);
//				count ++;
//			}
//		}
//		System.out.println("4의 배수를 제외한 갯수 >>>> " + count); 
//		
//		
//		int[] ball = new int[45];//45개 인덱스 넣기
//		for(i = 0 ; i < ball.length ; i++ ){
//			ball[i] = i+1;
//		}
//		
//		int temp = 0;
//		int lotto = 0;
//		
//		lotto = (int)(Math.random() * 45) + 1;
		
		String some = "가나다라마바SFSDFSDFDsfsdfsfdsafsdddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddd사";
		
//		Scanner sc = new Scanner(System.in);
//		someString = sc.next();
		
		ExamePratice ex = new ExamePratice();
		
		String A = ex.Explain(some);
		
		System.out.println(A);
	}
	
	public String Explain (String someString){
		char[] arr = someString.toCharArray(); // 해당 문자열로부터 캐릭터 배열을 선언한다
		StringBuffer sb = new StringBuffer();
		int size = 0;
		for(char c : arr) {
			System.out.println(c);
		    size += (c > 255) ? 2 : 1; // 조건에 따라 2 또는 1을 증가시킨다
		    System.out.println(size);             
		    sb.append(c);
		    if(size >= 80) {
		        break;
		    }
		}
		return sb.toString();
	}

}
