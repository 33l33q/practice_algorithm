package ex;

import java.util.Collections;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;

public class Lotto {

	public static void main(String[] args){
		int[] lottoNum = new int[6];
//		ArrayList arrayList = new ArrayList();
//		
//		//6�� �ζ� �����Լ� ������~~
//		
//		for(int i = 0; i<lottoNum.length ; i++ ){
//			//1���� 45���� �����߿� �����Լ��� 6��
//			lottoNum[i] = (int)(Math.random()*45)+1;
//			
//			//�ߺ��Լ��ִ� ��쿡 �ٽ� ���ư���
//			for(int j = 0 ; i < j ; j++){
//				if(lottoNum[j] == lottoNum[i]){
//					--i;
//					System.out.println("�ٽ� ���ư���");
//				}
//
//				//���ʴ�� �����ϱ�
////				if(lottoNum[i]> lottoNum[j]){
////					int temp = lottoNum[i];
////					lottoNum[i] = lottoNum[j];
////					lottoNum[j] = temp;
////				}
//			
//				lottoNum = Arrays.sort(lottoNum[]);
//			}//end of inner for
//			
//			
//			System.out.println(lottoNum[i] + " ");
//		}//end of for
	
		Set set = new HashSet();
		
		for(int i = 0 ; i < 7 ; ++i){
			set.add((int)(Math.random()*45 + 1));
			System.out.println("���� ~~ " + (Math.random()*10));
		}
		
		List list = new LinkedList(set);
		
		Collections.sort(list);
		
		System.out.println(list);
	}//end of main
}//end of class