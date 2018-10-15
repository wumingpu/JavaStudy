package com.wmp.test;

public class TestStringBuild2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StringBuilder sb = new StringBuilder();
		
		for(int i=0;i<26;i++) {
			sb.append((char)('a'+i));
		}
		
		System.out.println(sb);
		
		sb.reverse(); // 倒叙
		
		sb.setCharAt(3, '高'); // 改变特定位置字符
		
		sb.insert(0, '我'); // 特定位置插入字符。因为该方法return this,所以可以链式调用
		
		sb.delete(20, 23);
	}

}
