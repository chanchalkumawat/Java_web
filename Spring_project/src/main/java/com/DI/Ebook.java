package com.DI;

public class Ebook extends Book {
	private float sizeinmb;

	public void setSizeinmb(float sizeinmb) {
		this.sizeinmb = sizeinmb;
	}

	@Override
	public String toString() {
		return "Ebook [sizeinmb=" + sizeinmb + super.toString()+"]";
	}
	

}
