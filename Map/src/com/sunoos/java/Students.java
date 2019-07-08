package com.sunoos.java;

public class Students {
Integer marks;
String name;


/**
 * @param marks
 * @param name
 */
public Students( Integer marks, String name) {
	this.marks = marks;
	this.name = name;
}


@Override
public String toString() {
	return "Students [marks=" + marks + ", name=" + name + "]"; 
}






}
