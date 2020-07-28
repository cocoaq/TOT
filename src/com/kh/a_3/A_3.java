package com.kh.a_3;

public class A_3 {

	public static void main(String[] args) {
		int[][] iarr = {
				{1 , 4, 7, 10},
				{100, 20, 3, 324},
				{78, 577, 89, 1000},
				{1, 44, 77, 993}
		};

		int result = 0;

		for(int i = 0; i < iarr.length ; i++) {
			for(int j = 0; j < iarr[i].length; j++) {
				result += iarr[i][j];
			}

		}
		
		System.out.println("result : " + result);
	}

}
