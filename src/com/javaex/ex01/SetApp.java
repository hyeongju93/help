package com.javaex.ex01;

import java.util.HashSet;
import java.util.Set;

public class SetApp {
	public static void main(String[] args) {
		
		Set<Integer> set=new HashSet<Integer>();	//Hash코드로 중복을 체크한다.
		int ans = (int)(Math.random()*100)+1;
		while(true) {
			if(set.size()==6) {
				break;
			}
			ans=(int)(Math.random()*45)+1;
			set.add(new Integer(ans));
		}
		
		for(Integer a: set) {		//처음에는 하나 짜리	다음에는 전체
			System.out.println(a);
		}
	}

}
