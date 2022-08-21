package com.javatest.com;

public class Girl extends Boy {

	@Override
	public void car() {
		super.car();
		System.out.println("audi");
	}

	public static void main(String[] args) {
		Girl g = new Girl();
		g.car();
		System.out.println("swift");
	}

}
