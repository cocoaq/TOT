package com.kh.a_3;

public class A_4 {

	public void test1() {
		int arr1[] = new int[10];
		int arr2[] = new int[20];

		System.out.print("arr1 : ");
		for(int i = 0; i < arr1.length;i++) {
			arr1[i] = i + 1;
			System.out.print(arr1[i] + ", ");
		}
		System.out.println("");

		//		int arr2[] = {1, 0, 2, 5, 3, 10, 4, 15, 5, 20, 6, 25, 7, 30, 8, 35, 9, 40, 10, 45};

		arr2[0] = arr1[0];
		arr2[1] = 0;
		arr2[2] = arr1[1];
		arr2[3] = arr1[4];
		arr2[4] = arr1[2];
		arr2[5] = arr1[9];
		arr2[6] = arr1[3];
		arr2[7] = 15;
		arr2[8] = arr1[4];
		arr2[9] = 20;
		arr2[10] = arr1[5];
		arr2[11] = 25;
		arr2[12] = arr1[6];
		arr2[13] = 30;
		arr2[14] = arr1[7];
		arr2[15] = 35;
		arr2[16] = arr1[8];
		arr2[17] = 40;
		arr2[18] = arr1[9];
		arr2[19] = 45;



		System.out.print("arr2 : ");
		for(int i = 0; i < arr2.length;i++) {
			System.out.print(arr2[i] + ", ");
		}
		System.out.println("");

	}
	public void test2() {
		int arr[][] = new int[10][10];
		
		for(int i = 0; i < arr.length; i++) {
			int z = 0;
			for(int j = 0; j < arr[i].length; j++) {
				arr[i][j] = z + i;
				z++;
				System.out.print(arr[i][j] + "\t");
			}
			System.out.println("");
		}
	}

	public static void main(String[] args) {
		A_4 a = new A_4();
		a.test1();
		a.test2();
	}

}
