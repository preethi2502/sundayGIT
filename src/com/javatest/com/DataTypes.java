package com.javatest.com;

public class DataTypes {

	public void dataInt(int id) {
		System.out.println("test int :" + id);
	}

	public void mukkesh(long number) {
		System.out.println("mukkesh number : " + number);
	}

	public void manojAddress(String address) {
		System.out.println("Address :" + address);
	}

	public static void main(String[] args) {
		DataTypes d = new DataTypes();
		d.dataInt(4568);
		d.manojAddress("chennai , porur -65866");
		d.mukkesh(788787878788l);
	}

}
