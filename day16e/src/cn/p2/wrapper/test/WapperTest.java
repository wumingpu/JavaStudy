package cn.p2.wrapper.test;

import java.util.Arrays;

/*
 * ��һ���ַ����е���ֵ���д�С���������
 * 
 * ��20 78 9 -7 88 36 29��
 * 
 * ˼·��
 * 1.����
 * 2.��λ�ȡ����ַ����е���Щ��Ҫ�������ֵ��
 * ���ַ����ָ����
 */
public class WapperTest {

	public static void main(String[] args) {
		String numStr = "20 78 9 -7 88 36 29";
		
		System.out.println(numStr);
		numStr  = sortStringNumber(numStr);
		System.out.println(numStr);
	}

	private static String sortStringNumber(String numStr) {
		// 1.���ַ������ַ�������
		String[] str_arr = stringToArray(numStr);
		
		// 2.���ַ���������int����
		int[] num_arr = toIntArray(str_arr);
		
		// 3.��int��������
		mySortArray(num_arr);
		
		// 4.���
		String temp = arrayToString(num_arr);
		
		return temp;
	}

	private static String arrayToString(int[] num_arr) {
		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < num_arr.length; i++) {
			if(i!=num_arr.length-1)
				sb.append(num_arr[i]+" ");
			else
				sb.append(num_arr[i]);
		}
		return sb.toString();
	}

	private static void mySortArray(int[] num_arr) {
		Arrays.sort(num_arr);
	}

	private static int[] toIntArray(String[] str_arr) {
		int[] arr = new int[str_arr.length];
		
		for (int i = 0; i < arr.length; i++) {
			arr[i] = Integer.parseInt(str_arr[i]);
		}
		return arr;
	}

	private static String[] stringToArray(String numStr) {
		return numStr.split(" ");
	}

}