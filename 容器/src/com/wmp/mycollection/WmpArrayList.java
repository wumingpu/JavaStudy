package com.wmp.mycollection;

import javax.management.RuntimeErrorException;

/**
 * 自定义实现一个ArrayList
 * @author wmp
 *
 */
public class WmpArrayList<E> {
	private Object[] elementData;
	private int size;
	
	private static final int DEFAULT_CAPACITY = 10;
	
	public WmpArrayList() {
		elementData = new Object[DEFAULT_CAPACITY];
	}
	
	public WmpArrayList(int capacity) {
		if(capacity<0) {
			throw new RuntimeException("容器的容量不能为负数");
		}
		elementData = new Object[capacity];
	}
	
	public void add(E element) {
		// 什么时候扩容？？
		if(size == elementData.length) {
			// 怎么扩容？？
			Object[] newArray = new Object[elementData.length+(elementData.length>>1)]; // 10+10/2
			System.arraycopy(elementData, 0, newArray, 0, elementData.length);
			elementData = newArray;
		}
		
		elementData[size++] = element;
	}
	
	public E get(int index) {
		return (E)elementData[index];
	}
	
	public void set(E element, int index) {
		checkRange(index);
		elementData[index] = element;
	}
	
	public void checkRange(int index) {
		// 索引判断合法[0, size]
				if(index < 0||index>size-1) {
					// 不合法
					throw new RuntimeException();
				}
	}
	
	public void remove(E element) {
		// element，将它和所有元素依次比较，获得一个为true的，返回
		for(int i=0; i<size; i++) {
			if(element.equals(get(i))) { // 容器中所有的比较都是用的equals而不是==
				// 将该元素从此处移除
				remove(i);
			}
		}
	}
	
	public void remove(int index) {
		// a,b,c,d,e,f,g
		int numMoved = elementData.length-index-1;
		if(numMoved>0) {
			System.arraycopy(elementData, index+1, elementData, index, numMoved);
		}
		elementData[size-1] = null;
		size--;
		
	}
	
	public int size() {
		return size;
	}
	
	@Override
	public String toString() {
		
		StringBuilder sb = new StringBuilder();
		sb.append("[");
		for(Object obj:elementData) {
			sb.append(obj+",");
		}
		sb.setCharAt(sb.length()-1, ']');
		
		return sb.toString();
	}

	public static void main(String[] args) {
		
	}
}
