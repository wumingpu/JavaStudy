package com.wmp.collection;
/**
 * ����collection�ӿ��еķ���
 * @author WMP
 *
 */
import java.util.*;
public class TestList {
	public static void main(String[] args) {
		
	}
	
	public static void test01() {
		Collection<String> c = new ArrayList<String>();
		
		System.out.println(c.size());
		System.out.println(c.isEmpty());
		
		c.add("abc");
		c.add("bcd");
		System.out.println(c);
		System.out.println(c.size());
		
		c.remove("bcd");
		System.out.println(c);
	}
	
	public static void test02() {
		
	}
	
	public static void test03() {
		// 索引相关
		List<String> list = new ArrayList<>();
		list.add("A");
		list.add("B");
		list.add("C");
		list.add("D");
		list.add("E");
		
		list.add(2, "wmp");
		System.out.println(list);
		
		list.remove(2);
		
		list.set(2, "wmp2");
		
		System.out.println(list.get(2));
		
		list.add("C");
		list.add("B");
		list.add("A");
		System.out.println(list);
		
		list.indexOf("B");
		list.lastIndexOf("B");
		
		// ArrayList底层是用数组实现的存储。特点是查询效率高，增删效率低，线程不安全。一般使用它
		// 数组长度是有限的，ArrayList使用数组扩容的方式，可以存储任意长度数量的对象。每次扩容上一次数组的一半。
		
	}
	
}
