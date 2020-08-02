package com.kh.a_5.A_1;

import java.util.Scanner;

public class Run {

	public static void main(String[] args) {
		String name;
		String jong;
		int age;
		String bun;
		String place;

		Scanner sc = new Scanner(System.in);

		System.out.print("이름 : ");
		name = sc.nextLine();
		System.out.print("종류 : ");
		jong = sc.nextLine();
		System.out.print("나이 : ");
		age = sc.nextInt();
		sc.nextLine();
		System.out.print("번식 : ");
		bun = sc.nextLine();
		System.out.print("서식지 : ");
		place = sc.nextLine();

		Animal a = new Animal(name, jong, age, bun, place);
//		Mammalia m = new Mammalia(name, jong, age, bun, place);
		Mammalia m = new Mammalia();
//		Reptila r = new Reptila(name, jong, age, bun, place);
		Reptila r = new Reptila();


		if("포유류".equals(jong)) {
			System.out.println(m.getInfomation());
			
		}else if("파충류".equals(jong)) {
			System.out.println(r.getInfomation());
			
		}else {
			System.out.println("포유류나 파충류를 적어주세요");
		}
	}

}
