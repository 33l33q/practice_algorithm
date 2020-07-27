package practice;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main3 {
	public static void main(String args[]){
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter (new OutputStreamWriter(System.out));
		
		try{
			int i, a, n , x  = 0;
			String s, s1 = "";
			
			s = br.readLine();
			String arr[] = s.split(" ");
			n = Integer.parseInt(arr[0]);
			x = Integer.parseInt(arr[1]);
			
			s1 = br.readLine();
			String arr1[] = s1.split(" ");
			
			
			for(i = 0 ; i < n ; i ++ ){
				a = Integer.parseInt(arr1[i]);
				if(a < x) bw.write(a + " ");
			}
			bw.flush();
			bw.close();

		}catch(IOException e){
		}
	}
}
		
/*		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int i = 0;
		
		for(i = 1 ; i <= 9 ; i++){
			System.out.println(n + " * " + i + " = " + n*i);
		}

--
		Scanner sc = new Scanner(System.in);
		
		int i, t, a, b = 0;
		
		t = sc.nextInt();
		
		for( i = 0 ; i < t ; i++){
			a = sc.nextInt();
			b = sc.nextInt();
			System.out.println(a+b);
		}
--

		Scanner sc = new Scanner(System.in);
		
		int i,n, addNum = 0;
		n =  sc.nextInt();

		for(i = 0 ; i < n ; i++ ){
			addNum = addNum + n - (i);
		}
		System.out.println(addNum);
	}
}

--

		try{
			
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			BufferedWriter bw = new BufferedWriter (new OutputStreamWriter(System.out));
			
			String s = "";
			int i, t ,a, b = 0;
			
			t = Integer.parseInt(br.readLine());
			
			for(i = 0 ; i < t ; i ++ ){
				s = br.readLine();
				String arr[] = s.split(" ");
				a = Integer.parseInt(arr[0]);
				b = Integer.parseInt(arr[1]);
				bw.write(a + b + "\n");
			}
			
			bw.flush();
			bw.close();
			
			
		}catch(Exception e){
			
		}
		
		
	}

*/
