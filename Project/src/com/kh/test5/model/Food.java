package com.kh.test5.model;

// 우리 VO 만드는 방식 그대로 작성하시면 됩니다!!
public class Food {

	private String name;
	private int kcal;
	
	public Food() {}
	public Food(String name, int kcal) {
		this.name = name;
		this.kcal = kcal;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getKcal() {
		return kcal;
	}
	public void setKcal(int kcal) {
		this.kcal = kcal;
	}
	
	@Override
	public String toString() {
		return "Food [name=" + name + ", kcal=" + kcal + "]";
	}

}
