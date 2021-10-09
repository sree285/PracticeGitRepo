package com.practice.singleton;

public class Main {
	public static void main(String[] args) {
		Singelton s = Singelton.getInstance();
		s.getName();
		s.getNum();
	}

}
