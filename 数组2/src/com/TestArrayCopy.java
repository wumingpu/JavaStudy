package com;

public class TestArrayCopy {
	public static void main(String[] args) {
		String[] s1 = {"aa", "bb", "cc", "dd", "ee"};
		String[] s2 = new String[10];
		System.arraycopy(s1, 2, s2, 6, 3);
		// 从s1拷贝到s2，从第二个拷贝到第六个，拷贝三个
		
		// 从数组中删除元素，本质上也是数组的拷贝
		String[] s11 = {"aa", "bb", "cc", "dd", "ee"};
		System.arraycopy(s11, 3, s11, 3-1, s11.length-1);
		s1[s1.length-1] = null;
		for(int i=0;i<s11.length;i++) {
			System.out.println(s11[i]);
		}
	}
	
	// 数组删除方法，本质上也是数组的拷贝。所以，数组的删除元素方法效率很低
	public static String[] removeElement(String[] s, int index) {
		System.arraycopy(s, index+1, s, index, s.length-index-1);
		s[s.length-1] = null;
		return s;
	}
	
	// 数组的扩容，本质上是定义一个更大的数组，然后把数组元素拷贝进去。
	public static void extendRange() {
		String[] s1 = {"aa", "bb", "cc"};
		String[] s2 = new String[s1.length+10];
		System.arraycopy(s1, 0, s2, 0, s1.length);
		// 从原始的0位开始拷贝，拷贝到新数组的0位，拷贝length个元素。
	}
}
