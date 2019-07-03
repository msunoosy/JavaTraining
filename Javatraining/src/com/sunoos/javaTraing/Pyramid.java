package com.sunoos.javaTraing;

public class Pyramid {

	void printPyramid() {

		int input = 10;

		for (int i = 1; i <= input; i++) {
			for (int k = 1; k <= input - i; k++) {
				System.out.print(" ");
			}
			for (int j = 0; j < i; j++) {
				System.out.print("* ");
			}
			System.out.println();
		}

		for (int s = 1; s <= (input - 1); s++) {
			for (int b = 1; b <= s; b++) {
				System.out.print(" ");
			}
			for (int v = (input - 1); v >= s; v--) {
				System.out.print("* ");
			}
			System.out.println();
		}

	}

}
