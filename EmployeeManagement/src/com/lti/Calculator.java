package com.lti;

public class Calculator {
	
	public void add(int a, int b) {
		System.out.println("Sum="+(a+b));
	}
	
	public void diff(int a, int b) {
		System.out.println("Diff="+(a-b));
	}
	public void product(int a, int b) {
		System.out.println("Product="+(a*b));
	}
	public void division(int a, int b) {
		System.out.println("Quotient="+(a/b));
	}

	public static void main(String[] args) {
		    System.out.println(add(10,20));
		    System.out.println(sub(10,20));
		    System.out.println(mul(10,20));
		    System.out.println(div(10,20));    

	}

}
