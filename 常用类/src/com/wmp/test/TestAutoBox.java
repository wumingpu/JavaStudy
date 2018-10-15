package com.wmp.test;
/**
 * 自动装箱拆箱
 * @author wmp
 *
 */
public class TestAutoBox {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Integer a = 234;  // 装箱  编译器自动执行：Integer.valueOf(234);
		
		int b = a; // 拆箱  编译器自动执行：a.intValue();
		
		
		
		// 缓存【-128~127】之间的数字
		Integer in1 = -128;
		Integer in2 = -128;
		System.out.println(in1==in2); // 范围内的数字会被缓存，因此地址相同。缓存是一个数组，将范围内的数字全部放在了数组中。
		// 这个数组会在系统初始化的时候创建的。当调用valueOf()时，在范围内，直接从缓存中取。
		
		Integer in3 = 1234;
		Integer in4 = 1234;
		System.out.println(in3==in4); // 在范围外，会重新开辟空间存储。因此地址不同。
		
	}

}
