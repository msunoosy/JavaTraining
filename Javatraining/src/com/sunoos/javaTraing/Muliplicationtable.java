package com.sunoos.javaTraing;

public class Muliplicationtable {
	static void Table() {
		System.out.format("     ");
		for (int i = 1; i <= 9; i++) {
			System.out.format("%4d", i);
		}
		System.out.println();
		System.out.println("----------------------------------------------");
		for (int i = 1; i <= 9; i++) {
			System.out.format("%4d|", i);
			for (int j = 1; j <= 9; j++) {
				System.out.format("%4d", i * j);
			}
			System.out.println();
		}

	}

	public static void main(String[] args) {
		Pyramid p=new Pyramid();
		p.printPyramid();
		
	
	}

}
