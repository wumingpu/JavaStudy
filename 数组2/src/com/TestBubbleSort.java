package com;

import java.util.Arrays;

/**
 * 测试冒泡排序
 * @author wmp
 *
 */
public class TestBubbleSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] values = {3,1,6,2,9,0,7,4,5,8};
		
		// 冒泡就是每次把最大值找出来，换到第一个
		
		for(int i=0;i<values.length-1;i++) {
			boolean flag = true; 
			// 找出这个数组的最大值
			int temp = 0;
			for(int j=0;j<values.length-1-i;j++) {
				if(values[j]>values[j+1]) {
					temp = values[j];
					values[j] = values[j+1];
					values[j+1] = temp;
					
					flag = false;
				}
				System.out.println(Arrays.toString(values));
			}
			if(flag) { // 如果一个循环结束，都没有发生数据交换，则认为已经排序好了
				// 这个是冒泡排序的一个优化。
				break;
			}
			System.out.println("###############");
		}
		
		
		
	}

}
