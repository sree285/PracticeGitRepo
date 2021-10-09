package com.practice.singleton;

public class Singelton {
	private static Singelton obj;

	private Singelton() {

	}

	public static Singelton getInstance() {
		if (obj == null) {
			obj = new Singelton();
		}
		return obj;
	}

	public String getName() {
		int c = 5 + 3;
		System.out.println(String.valueOf(c));
		return String.valueOf(c);
	}

	public int getNum() {
		int c = 34 + 78;
		System.out.println("Number is : " + c);
		return c;
	}

}
