package com.javaex.ex01;

import java.util.HashMap;
import java.util.Map;

public class MapApp {
	public static void main(String[] args) {
		
		Map<String,Integer> map=new HashMap<String, Integer>();
		Integer p1=0;
		map.put("권상우", 45);
		map.put("정우성", 46);
		map.put("이효리", 40);
		
		System.out.println(map.size());	//map 같은 경우 순서는 상관없다.
		p1=map.get("정우성");
		
		System.out.println(p1);
		map.put("이효리", 100);
		
		System.out.println(map);
	}

}
