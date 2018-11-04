package com.wmp.mycollection;

public class WmpLinkedList01 {
	private Node first;
	private Node last;
	
	private int size;
	
	public Object get(int index) {
		Node temp = first;
		
		for (int i=0;i<index;i++) {
			temp = temp.next;
		}
		return temp.element;
	}
	
	public void add(Object obj) {
		Node node = new Node(obj);
		
		if(first==null) {
			node.previous = null;
			node.next = null;
			
			first = node;
			last = node;
		}
		else {
			node.previous = last; // 上一个就是当前存在的最后一个节点
			node.next = null;
			
			last.next = node;
			last = node;
		}
	}
	
	@Override
	public String toString() {
		
//		StringBuilder sb = new StringBuilder();
//		sb.append("[");
//		// 遍历链表中的内容
//		sb.setCharAt(sb.length()-1, ']');
//		
//		return sb.toString();
		
		StringBuilder sb = new StringBuilder();
		sb.append("[");
		Node temp = first;
		while(temp!=null) {
			sb.append(temp.element);
			temp = temp.next;
		}
		sb.setCharAt(sb.length()-1, ']');
		return sb.toString();
	}
	
	public static void main(String[] args) {
//		WmpLinked
	}
}
