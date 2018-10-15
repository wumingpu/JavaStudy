package com;

public class Test2DimensionArray {
	public static void main(String[] args) {
		int[] a = new int[3];
		
		Car[] cars = new Car[3];
		
		
		int[][] a1 = new int[3][]; // 因为数组里面存放的数组不一定是多少维的。
		a1[0] = new int[]{20,30};
		a1[1] = new int[] {10,15,20};
		a1[2] = new int[] {50,60};
		
		int[][] b = {
				{20,30,40},
				{50,60},
				{100,200,300,400}
		}; // 静态初始化二维数组
	}
}


class Car{
	
}
