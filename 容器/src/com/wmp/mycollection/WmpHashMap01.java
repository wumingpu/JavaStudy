package com.wmp.mycollection;

public class WmpHashMap01 {

	Node2[] table; 
	int size;
	
	public WmpHashMap01() {
		table = new Node2[16];
	}
	
	public void put(Object key, Object value) {
		
		Node2 newNode = new Node2();
		newNode.hash = myHash(key.hashCode(), table.length);
		newNode.key = key;
		newNode.value = value;
		newNode.next = null;
		
		Node2 temp = table[newNode.hash];
		if(temp == null) {
			// 数组为空则直接将新节点放入。
			table[newNode.hash] = newNode;
		}
		else {
			// 数组不为空，遍历表，处理键重复问题。
		}
	}
	
	public static void main(String[] args) {
		WmpHashMap01 m = new WmpHashMap01();
	}
	
	public int myHash(int v, int length) { // 返回hash值
		return v&(length-1); // 位运算
	}
}
