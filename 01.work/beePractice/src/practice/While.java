package practice;
//10952¹ø
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class While {

	public static void main(String[] args){
		
//		int f = 0, s = 0, n = 0, o = 0, temp = 0, count = 0;
//		
//		Scanner scan = new Scanner(System.in);
//		
//		o = scan.nextInt();
//		f = o/10;
//		s = o%10;
//		
//		while(true){
//			++count;
//			n = ((s%10)*10)+((f + s)%10);
//			
//			
//			if(o == n) break;
//			else {
//						f = n/10;
//						s = n%10; 
//			}
//		}
//
//		System.out.println(">>>" + count);
//		
		
//		Scanner scan = new Scanner(System.in);
//
//		int A = 0, B = 0;
//
//		
//		while(scan.hasNext()){
//
//			A = scan.nextInt();
//			B = scan.nextInt();
//
//			System.out.println(A + B);
//		}//end of while 
//		
		
//		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
//		
//		try{
//
//			int a,b = 0;
//			String s = "";
//			
//			while(s != null){
//				
//				s = br.readLine();
//				
//				String arry[] = s.split(" ");
//					
//				a = Integer.parseInt(arry[0]);
//				b = Integer.parseInt(arry[1]);
//				
//				System.out.println(a + b);
//
//			}
//		
//			bw.flush();
//			bw.close();
//			
//		}catch(Exception e){
//			
//		}
//
//		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		try{
			int f = 0 , s = 0 , n = 0 , count = 0, o = 0;
			boolean g = true;
			String fs = "";
			
			fs = br.readLine();
			o = Integer.parseInt(fs);
			
			if(fs.length() == 1){
				f = 0;
				s = Integer.parseInt(fs.substring(0,1));
				
			}else{
				f = Integer.parseInt(fs.substring(0,1));
				s = Integer.parseInt(fs.substring(1));
			}

			while(o != n){
				
				++count;
				
				n = (s*10)+((f+s)%10);
				
				f = n/10;
				s = n%10;
			
			}//end of while
			
			System.out.println(count);
			bw.write(count);
			bw.flush();
			bw.close();
			
			
		}catch(Exception x){
			
			x.printStackTrace();
			
		}
		
		
		
	}//end of main
}//end of class
