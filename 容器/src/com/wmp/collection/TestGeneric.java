package com.wmp.collection;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * ≤‚ ‘∑∫–Õ
 * @author WMP
 *
 */
public class TestGeneric {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyCollection<String> mc = new MyCollection<String>();
		mc.set("abc", 0);
		mc.set("cde", 1);
		
		String a = mc.get(1);
		String b = mc.get(0);
		
		
		List list = new ArrayList();
		Map map = new HashMap();
		
	}

}

class MyCollection<E>{
	Object[] objs = new Object[5];
	
	public void set(E e, int index) {
		objs[index] = e;
	}
	
	public E get(int index) {
		return (E)objs[index];
	}
	
	
}
