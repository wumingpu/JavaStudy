package com.wmp.collection;

import java.util.HashMap;
import java.util.Map;

public class TestMap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Map<Integer, String> m1 = new HashMap<>();
		
		m1.put(1, "a");
		m1.put(2, "b");
		m1.put(3, "c");
		
		System.out.println(m1.get(1));
		
		System.out.println(m1.isEmpty());
		System.out.println(m1.containsKey(1));
		
		Map<Integer, String> m2 = new HashMap<>();
		m2.put(4, "四");
		m2.put(5, "五");
		
		m1.putAll(m2);
		
		System.out.println(m1);
		
		// map中键是不能重复的，如果重复（是否重复是根据equals方法判断的），则新的覆盖旧的。
		m1.put(3, "ccc");
		System.out.println(m1);
	}

}
