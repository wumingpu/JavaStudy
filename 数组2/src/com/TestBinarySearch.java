package com;

import java.util.Arrays;

/**
 * 测试二分法查找
 * @author wmp
 *
 */
public class TestBinarySearch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {3,1,6,2,9,0,7,4,5,8};
		Arrays.sort(arr);
		
		
	}
	
	public static int myBinarySearch(int[] arr, int value) {
		int low = 0; // 查找起始位置
		int high = arr.length-1; // 查找结束位置
		
		while(low<=high) {
			int mid = (low+high)/2;
			
			if(value==arr[mid]) {
				return mid; // 找到了
			}
			
			if(value>arr[mid]) {
				low = mid+1; // 往右找
			}
			
			if(value<arr[mid]) {
				high = mid-1; // 往左找
			}
		}
		
		return -1;
	}

}
