package com.kh.test3;

public class Overloading {

	// 오버로딩 : 메서드명 같은 거 사용할 수 있는데 조건!!! 매개변수!!!
	// 매개변수 개수가 같거나 타입이 같아버리면 오버로딩 조건 성립 X
	// 오버로딩이 되려면 매개변수 개수가 다르거나 타입이 달라야 사용할 수 있음!
	public void test() {}
	public void test(String str) {}
	public void test(int i) {}
	//public void test(String s) {}
	public void test(char ch) {}
	public void test(String str, int i) {}
	public void test(int i, String str) {}
	//private void test(int i) {}
	//public int test() {return 0;}
}
