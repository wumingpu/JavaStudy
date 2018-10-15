package com;

import java.util.Arrays;

/**
 * 测试java.util.Arrays工具类
 * @author wmp
 *
 */
public class TestArrays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a = {100, 20, 30, 5, 150, 80, 200};
		
		System.out.println(a); // 打印一个对象
		
		System.out.println(Arrays.toString(a)); // 将数组内容打印出来
		
		Arrays.sort(a);
		System.out.println(Arrays.toString(a));
		
		// 使用二分查找查找元素所在index，存在返回索引，不存在返回-1
		System.out.println(Arrays.binarySearch(a, 30));
		
		
		
		
	}

}
