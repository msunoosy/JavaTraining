package com.sunoos.java;

import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;

public class NonG {
public static void main(String[] args) {
	
	Map<Integer,String> map=new HashMap<Integer,String>(); 
	map.put(20, "sunoos");
	map.put(29, "miras");
	map.put(39, "theethath");
	map.put(32, "siraj");
	map.put(43, "umar");
	map.put(55, "zky");
	map.put(34, "nadheem");
	map.put(67, "arshad");
	map.put(88, "sazny");
	map.put(90, "sunas");
	
	 for(Map.Entry m:map.entrySet()){  
		   System.out.println(m.getKey()+" "+m.getValue().toString().toUpperCase());  
		  }  
	System.out.println();
	 
	 map.entrySet().stream().sorted(Map.Entry.comparingByKey(Comparator.reverseOrder())).forEach(System.out::println);
	
	
}
}
