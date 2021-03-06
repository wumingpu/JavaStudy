package cn.p4.List.demo;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class ListDemo2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List list = new ArrayList();
//		show(list);
		
		list.add("abc1");
		list.add("abc2");
		list.add("abc3");
		list.add("abc4");
		
		/*Iterator it = list.iterator();
		while (it.hasNext()) {
			Object obj = it.next();
			if(obj.equals("abc2")){
				list.add("abc9"); 
				// 迭代器在操作集合的同时，集合修改了元素，并发操作了，会抛出异常
				// 因此在迭代器中，不要使用集合操作元素，容易出现异常。
				//以上异常解决方式：使用列表迭代器ListIterator
			}
			else{
				System.out.println("next:"+obj);
			}
			System.out.println("next:" + it.next());
		}*/
		
		// ListIterator可以实现迭代过程中完成对元素的增删改查。
		// 只有list中有这个专用的迭代器。
		System.out.println("list:" + list);
		ListIterator it = list.listIterator(); // 重载+1 一参数，从指定的元素开始迭代。
		while (it.hasNext()) {
			Object obj = it.next();
			if (obj.equals("abc2")) {
				it.set("abc9");
			}
		}
		System.out.println("list:" + list);

		while (it.hasPrevious()) {
			System.out.println("previous:" + it.previous()); // 逆向迭代。
		}
		System.out.println("list:" + list);
	}

	private static void show(List list) {
		// TODO Auto-generated method stub
		list.add("abc1");
		list.add("abc2");
		list.add("abc3");
		list.add("abc4");

		Iterator it = list.iterator();
		while (it.hasNext()) {
			System.out.println("next:" + it.next());
		}
		// list特有的取出元素的方式之一
		for (int i = 0; i < list.size(); i++) {
			System.out.println("get:" + list.get(i));
		}
	}

}
