package com.javatest.com;

public class MethodOverLoad {

	public void bike() {
		System.out.println("yamaha 100");
	}

	public void bike(String bike) {
		System.out.println("bike name " + bike);
	}

	public void bike(String bike, float km) {
		System.out.println("bike name " + bike + " KM :" + km);
	}

	public static void main(String[] args) {
		MethodOverLoad m = new MethodOverLoad();
		m.bike();
		m.bike("duke 250");
		m.bike("RE", 13.5f);

	}

}
