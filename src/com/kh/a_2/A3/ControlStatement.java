package com.kh.a_2.A3;

import java.util.Scanner;

public class ControlStatement {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

//		int max = 100;
//		int min = 1;
//		int anser = 0;
//		int i = 0;
//
//
//		System.out.print("1~100������ �� �Է� : ");
//		int num = sc.nextInt();
//
//		if(num >= max) {
//			System.out.println("�ٽ� �Է��ϼ���.");
//		}else {
//			while(anser != num) {
//				if(num <= max) {
//					max = max/2;
//					i++;
//					anser = max;
//					System.out.println(i + "ȸ�� ������ : " + max);
//				}else if(anser == num) {
//					
//					System.out.println(i + "ȸ�� ������ : " + anser);
//					break;
//				}else if(num <= max){
//					min = (min + max)/2;
//					i++;
//					anser = min;
//					System.out.println(i + "ȸ�� ������ : " + min);
//					return;
//				}
//			}
//		}
		
		int MAX = 100;
		int num;
		int low = 1;
		int high = MAX;
		int mid = 0;
		int cnt = 0;

		System.out.print("1~100 ������ �� �Է�: ");
		num = sc.nextInt();

		while (low <= high) {		
			
			mid = (low + high)/2;	
			
			if(num == mid) {
				cnt++;
				break;				
			}else if(num >= mid) {
				low = mid;			
			} else {
				high = mid;			
			}
			
			cnt++;
			System.out.println(cnt + "ȸ�� ������: " + mid);
		}
		System.out.println("���� ������: " + mid);
	
	}

}
