package com.wmp.test;
/**
 * 测试StringBuilder, StringBuffer
 * @author wmp
 *
 */
public class TestStringBuilder {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// StringBuilder线程不安全，效率高；StringBuffer线程安全，效率低。通常会采用StringBuilder
		StringBuilder sb = new StringBuilder("abcdefg");
		
		sb.setCharAt(2, 'M');
	}

}
