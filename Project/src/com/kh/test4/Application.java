package com.kh.test4;

import java.util.ArrayList;
import java.util.List;

import com.kh.test4.model.Fruit;

public class Application {
	
	public static void main(String[] args) {
		
		List<Fruit> list = new ArrayList<>();
		list.add(new Fruit("사과", "빨강"));
		list.add(new Fruit("메론", "초록"));
		list.add(new Fruit("포도", "보라"));
		// List의 타입이 Fruit으로 지정되어 있는데 문자열 넣으려고 해서 에러!
//		list.add("바나나");
		
		// length() 는 사실 배열의 길이, 리스트에서는 size() 사용
		for(int i = 0; i < list.size(); i++) {
			// list[i] : 배열에서 사용하는 방법, 리스트에서 하나씩 가져오려면 get(i) 메서드 사용!
			System.out.println(list.get(i).getName());
		}
		
	}
	
}
