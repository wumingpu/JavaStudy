package com.wmp.oo;

public class TestString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "abc"; // 实际上是将abc放入了一个final的char[]中。
		
		String str2 = new String("abc");
		String str3 = "abc"+"def";
		String str4 = "18"+19; // 只要加号只有一个是字符串，那后面的也会被当做字符串。
		System.out.println(str4);
		
		String str10 = "wmp";
		String str11 = "wmp";
		String str12 = new String("wmp");
		
		System.out.println(str10 == str11); // wmp被放在了常量池里面，所以，这两个是同一个对象。
		System.out.println(str11 == str12); // 新建立了一个对象，这两个不是一个对象。
		// 比较内容通常使用equals
		System.out.println(str10.equals(str12));
		
	}

}
