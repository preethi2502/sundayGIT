package com.programs.com;

public class Armstrong {

	public static void main(String[] args) {
		int a = 0;
		int i = 0;
		int j = 0;
		// palindrome the number  - 
		int num = 12345;
		a = num;
		while (a > 0) {
			i = a % 10;   //1234.5
			j = (j * 10) + i;  //0*10+5 =5
			a = a / 10; //1234.5 

		}
		if (num==j) {
			System.out.println("palindrome");
		}
		else {
			System.out.println("not palindrome");
		}
	}

}
