package com.kh.a_4.A_3;

public class Run {

	public static void main(String[] args) {

		System.out.println("> 객체 oc1생성 후 10, 20.5, 'T'를 변수로 저장");
		ObjectConstructor oc1 = new ObjectConstructor(10, 20.5, 'T');
		System.out.println("> 객체 oc1의 필드멤버를 toString() 메소드로 출력");
		System.out.println(oc1.toString());
		
		System.out.println("> 생성자를 이용해 객체 oc1을 복사한 객체 oc2 생성");
		ObjectConstructor oc2 = new ObjectConstructor(oc1);
		System.out.println("> 객체 oc2의 필드멤버를 toString() 메소드로 출력");
		System.out.println(oc2.toString());
	}

}
