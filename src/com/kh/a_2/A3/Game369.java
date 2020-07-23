package com.kh.a_2.A3;

import java.util.Scanner;

public class Game369 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num;
		
		System.out.print("°ÔÀÓ ÁøÇà È½¼ö ÀÔ·Â : ");
		num = sc.nextInt();
		
		for(int i = 0; i <= num ; i++) {
			if(i%10 == 0) {
				System.out.println("");
			}else {
				if((i/10 == 3)||(i/10 == 6)||(i/10 == 9)) {
					System.out.print("Â¦Â¦\t");
				}else if((i%10 == 3)||(i%10 == 6)||(i%10 == 9)) {
					System.out.print("Â¦\t");
				}else {
					System.out.print(i + "\t");
				}
			}
			
		}
	}

}
