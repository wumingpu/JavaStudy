package com.wmp.collection;
/**
 * ����collection�ӿ��еķ���
 * @author WMP
 *
 */
import java.util.*;
public class TestList {
	public static void main(String[] args) {
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
}
