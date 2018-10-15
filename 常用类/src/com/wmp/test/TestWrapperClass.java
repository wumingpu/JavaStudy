package com.wmp.test;

/**
 * 测试包装类Bytes,Integer,Charator,Boolean,Long,Short...
 * @author wmp
 *
 */
public class TestWrapperClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 基本数据类型转换成包装类对象
		Integer a = new Integer(3);
		Integer b = Integer.valueOf(30);
		
		// 把包装类对象转换为基本数据类型
		int c = b.intValue();
		double d = b.doubleValue();
		
		// 把字符串转换为包装类对象
		Integer e = new Integer("9999");
		Integer f= Integer.parseInt("999888");
		
		// 把包装类对象转换为字符串
		String str = f.toString();
		String str2 = ""+f;
		
		// 常见的常量
		System.out.println("Int最大的整数："+Integer.MAX_VALUE);
		
		
	}

}
