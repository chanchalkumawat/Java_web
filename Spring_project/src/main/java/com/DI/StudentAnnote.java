package com.DI;

import org.springframework.beans.factory.annotation.Value;

public class StudentAnnote {
	@Value("chanchal")
	private String name;
	@Value("2342")
	private String id;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	@Override
	public String toString() {
		return "StudentAnnote [name=" + name + ", id=" + id + ", getName()="
				+ getName() + ", getId()=" + getId() + ", getClass()="
				+ getClass() + ", hashCode()=" + hashCode() + ", toString()="
				+ super.toString() + "]";
	}


}
