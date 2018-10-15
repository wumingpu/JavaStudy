package com;
/**
 * 将表数据存储到数组中
 * @author wmp
 *
 */
public class TestArrayDataTable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Object[] a1 = {1001, "wmp1", 18, "abc", "2006"};
		Object[] a2 = {1001, "wmp", 18, "abc", "2006"};
		Object[] a3 = {1001, "wmp21", 18, "abc", "2006"};
		Object[] a4 = {1001, "wmp31", 18, "abc", "2006"};
		Object[] a5 = {1001, "wmp14", 18, "abc", "2006"};
		
		Object[][] tableData = new Object[5][];
		tableData[0] = a1;
		tableData[1] = a2;
		tableData[2] = a3;
		tableData[3] = a4;
		tableData[4] = a5;
	}

}
