package com.javaex.ex01;
import java.util.ArrayList;
import java.util.List;

public class ListApp {
	public static void main(String[] args) {
		List<Circle> list = new ArrayList<Circle>();
		
		Circle c01=new Circle(5);
		Circle c02=new Circle(10);
		Circle c03=new Circle(15);
		
		list.add(c01);
		list.add(c02);
		list.add(c03);
		list.remove(1);
		list.add(0,c02);
		//System.out.println(list);
		
		Circle a=list.get(1);
		//System.out.println(a);
		//System.out.println(a.getRadius());
		
		for(int i=0;i<list.size();i++) {
			System.out.println(list.get(i).getRadius());
		}
		
		for(Circle c:list) {	//처음부터 끝까지
			System.out.println(c.getRadius());
		}
	}
}
