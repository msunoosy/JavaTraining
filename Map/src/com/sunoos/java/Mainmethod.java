package com.sunoos.java;

import java.util.HashMap;
import java.util.Map;


public class Mainmethod {

	public static void main(String[] args) {
		
		Map<Integer,Students> map=new HashMap<Integer,Students>();
		map.put(1,new Students(20, "sunoos"));
		map.put(2,new Students(29, "miras"));
		map.put(3,new Students(39, "theethath"));
		map.put(4,new Students(100, "siraj"));
		map.put(5,new Students(100, "umar"));
		map.put(6,new Students(100, "zky"));
		map.put(7,new Students(100, "nadheem"));
		map.put(8,new Students(100, "arshad"));
		map.put(9,new Students(100, "sazny"));
		map.put(10,new Students(100, "sunas"));
		
		System.out.println(map);//Return all values from map
		
		
	}

}
