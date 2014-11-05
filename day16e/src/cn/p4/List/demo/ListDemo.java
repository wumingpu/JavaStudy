package cn.p4.List.demo;

import java.util.ArrayList;
import java.util.List;

public class ListDemo {

	public static void main(String[] args) {
		List list = new ArrayList();
		show(list);

	}

	private static void show(List list) {
		// TODO Auto-generated method stub
		list.add("abc1");
		list.add("abc1");
		list.add("abc1");
		System.out.println(list);

		// 插入元素
		list.add(1, "abc9");
		System.out.println(list);

		// 删除元素 删除返回被删除的对象
		System.out.println("remove:" + list.remove(2));
		System.out.println(list);

		// 修改元素
		System.out.println("set:" + list.set(1, "abc8"));
		System.out.println(list);

		// 获取元素
		System.out.println("get:" + list.get(0));
		System.out.println(list);

		// 获取子列表
		System.out.println("sublist:" + list.subList(1, 2));
		System.out.println(list);

	}

}
