package com.DI;

public class Car {
	private String name;
	private int perdaycost;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getPerdaycost() {
		return perdaycost;
	}
	
	public void setPerdaycost(int perdaycost) {
		this.perdaycost = perdaycost;
	}
	@Override
	public String toString() {
		return "Car [name=" + name + ", perdaycost=" + perdaycost + "]";
	}
}
