package com.javaex.ex01;

import java.util.HashSet;
import java.util.Set;

public class SetApp {
	public static void main(String[] args) {
		
		Set<Integer> set=new HashSet<Integer>();	//Hash코드로 중복을 체크한다.
		int ans = (int)(Math.random()*100)+1;
		while(true) {
			if(set.size()==6) {						//set.size의 경우 set안에 있는 갯수만 체크
				break;
			}
			ans=(int)(Math.random()*45)+1;			//set의 경우 중복되는 숫자체크하지 않는다.
			set.add(new Integer(ans));				
		}
		
		for(Integer a: set) {		//처음에는 하나 짜리	다음에는 전체
			System.out.println(a);
		}
		
	}

}
/*
set 개념 
1. set에 들어가는 숫자는 무작위로 집어넣는다. 10 20 30 을 집어 넣었다고 가정을 하면  20 10 30 이렇게 들어갈수도 있다.

2. set은 숫서가 정해져 있지 않기 때문에 "몇번을 꺼낸다." 이런 개념은 없다. 그렇기 때문에 for문을 사용할때 
for(int i=0;i<set.size();i++) 이것을 사용할수 없다.(순서가 없기 때문에) 그래서
for(Integer a : set){ sysout(a) } 를 사용해서 집합안에 있는 전체를 출력한다.

3. set의 정의는 Set<Integer> set=new HashSet<Integer>(); [여기서 Integer(제네릭)은 선택이다.]
set과 hashset은 import를 생성해주어야 한다. hash로 하는 이유는 hash 값으로 중복을 구별하기 때문

4. 
*/
