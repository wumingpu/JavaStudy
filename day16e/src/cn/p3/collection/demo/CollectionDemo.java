package cn.p3.collection.demo;

import java.util.ArrayList;
import java.util.Collection;

public class CollectionDemo {

	public static void main(String[] args) {
		Collection coll = new ArrayList(); // Collection是接口，不能实例化的。

		Collection c1 = new ArrayList();
		Collection c2 = new ArrayList();
		show(c1, c2);

	}

	public static void show(Collection c1, Collection c2) {
		c1.add("abc1");
		c1.add("abc2");
		c1.add("abc3");
		c1.add("abc4");

		c2.add("abc2");
		c2.add("abc6");
		c2.add("abc7");

		System.out.println("c1:" + c1);
		System.out.println("c2:" + c2);

		// c1.addAll(c2);

		// boolean b = c1.removeAll(c2); // 将两个集合中的相同元素从调用removeAll的集合中删除
		// System.out.println("removeAll" + b);
		// System.out.println("c1:" + c1);

		boolean b = c1.retainAll(c2); // abc2  取两个集合的交集
		System.out.println("c1:" + c1);
	}

	public static void show(Collection coll) {
		// 1.添加元素， add
		coll.add("abc1");
		coll.add("abc2");
		coll.add("abc3");
		System.out.println(coll);

		// 2.删除元素
		// coll.remove("abc2"); // 集合的remove方法是会改变集合的长度的。

		// 3.清空集合
		// coll.clear();

		// 是否包含
		// System.out.println(coll.contains("abc3"));
		System.out.println(coll);
	}

}
