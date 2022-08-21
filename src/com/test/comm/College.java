package com.test.comm;

//child
public class College extends Student{
	
	@Override
	public void stuId(int id) {
		super.stuId(id);
	}
	
	public static void main(String[] args) {
		College c = new College();
		c.stuId(454556);
	}
	
	
	
	
	

	
}
