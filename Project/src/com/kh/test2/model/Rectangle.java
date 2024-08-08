package com.kh.test2.model;

public class Rectangle {

// 다이어그램과 비교!!!
// 접근제어자 : - : private, + : public
// 변수 지정할 때 사실상 private!! -> 생성자 2개, get/setter , toString
	private int width;
	private int height;
	
	public Rectangle() {}
	public Rectangle(int width, int height) {
		super();
		this.width = width;
		this.height = height;
	}
	
	public int getWidth() {
		return width;
	}
	public void setWidth(int width) {
		this.width = width;
	}
	public int getHeight() {
		return height;
	}
	public void setHeight(int height) {
		this.height = height;
	}
	
	@Override
	public String toString() {
		return "Rectangle [width=" + width + ", height=" + height + "]";
	}

}
