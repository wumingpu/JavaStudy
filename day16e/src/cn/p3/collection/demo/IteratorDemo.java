package cn.p3.collection.demo;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class IteratorDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Collection coll = new ArrayList();

		coll.add("abc1");
		coll.add("abc2");
		coll.add("abc3");
		coll.add("abc4");

		System.out.println(coll);
		// 使用了集合中的迭代器方法，是为了使用获取集合中的迭代器对象
		// Iterator it = coll.iterator();
		// while (it.hasNext()) {
		// System.out.println(it.next());
		// }

		for (Iterator it = coll.iterator(); it.hasNext();) {
			System.out.println(it.next());
		} // 开发用此种写法书写，因为迭代完成后就会释放内存
	}

}
