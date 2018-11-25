
// created by asif mulani 
// created date 27/11/2018
package com.javabasics.constructors;

public class GetterSetter {
	private static int x = 40;
	public static double y = 60.0;

	GetterSetter(int a, double b) {
		x = a;
		y = b;
	}

	GetterSetter(int a) {
		x = a;

	}
	

	GetterSetter(double b) {
		y = b;
	}

	void add() {
		double z = x + y;
		System.out.println(z);
	}

	void sub() {
		double z = x - y;
		System.out.println(z);
	}

	int getX() {
		return x;
	}

	void setX(int a) {
		x = a;
	}

}
