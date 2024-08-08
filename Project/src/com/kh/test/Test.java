package com.kh.test;

import java.util.Scanner;

public class Test {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		// false이면 애초에 while X  -> true
		while(true) {
			System.out.print("문자열을 입력해주세요 : ");
			// 문자열이면 String인데 nextInt() <-- 숫자! nextLine() 또는 next()로 변경
			String str = sc.nextLine();
			// == <-- 문자열 비교 X --> 문자열 비교는 반드시 equals() 사용
			if(str.equals("exit")) {
				// continue! 건너 뛰는 것!! 즉 X 왜 반복문 while(true) <-- 무한루프 ! 즉 중단시켜야하는  break;
				break;
			} else {
				// 문자열 길이는 length가 아니라 length()
				System.out.println(str.length() + "글자 입니다.");
			}
		}
		
		System.out.println("프로그램을 종료합니다.");
	}
}
