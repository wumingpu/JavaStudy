package cn.p3.collection.demo;

import java.util.ArrayList;
import java.util.Collection;

public class CollectionDemo {

	public static void main(String[] args) {
		Collection coll = new ArrayList(); // Collection�ǽӿڣ�����ʵ�����ġ�

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

		// boolean b = c1.removeAll(c2); // �����������е���ͬԪ�شӵ���removeAll�ļ�����ɾ��
		// System.out.println("removeAll" + b);
		// System.out.println("c1:" + c1);

		boolean b = c1.retainAll(c2); // abc2  ȡ�������ϵĽ���
		System.out.println("c1:" + c1);
	}

	public static void show(Collection coll) {
		// 1.����Ԫ�أ� add
		coll.add("abc1");
		coll.add("abc2");
		coll.add("abc3");
		System.out.println(coll);

		// 2.ɾ��Ԫ��
		// coll.remove("abc2"); // ���ϵ�remove�����ǻ�ı伯�ϵĳ��ȵġ�

		// 3.��ռ���
		// coll.clear();

		// �Ƿ����
		// System.out.println(coll.contains("abc3"));
		System.out.println(coll);
	}

}