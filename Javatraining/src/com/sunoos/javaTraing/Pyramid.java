package com.sunoos.javaTraing;

public class Pyramid {

	void printPyramid() {
		
	
//for(int i=1;i<=5;i++) {
//	for(int j=1;j<=i;j++) {
//		System.out.print("* ");
//	}
//	System.out.println();
//}
		
		
		for (int i=0;i<=5;i++) {
             for(int k=1;k<=5-i;k++) {
             System.out.print(" ");
             }
			for (int j=0;j<i;j++) {	
			System.out.print("* ");
			}
			System.out.println();
			}
     
	}

}
