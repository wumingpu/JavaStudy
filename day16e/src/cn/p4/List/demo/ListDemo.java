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

		// ����Ԫ��
		list.add(1, "abc9");
		System.out.println(list);

		// ɾ��Ԫ�� ɾ�����ر�ɾ���Ķ���
		System.out.println("remove:" + list.remove(2));
		System.out.println(list);

		// �޸�Ԫ��
		System.out.println("set:" + list.set(1, "abc8"));
		System.out.println(list);

		// ��ȡԪ��
		System.out.println("get:" + list.get(0));
		System.out.println(list);

		// ��ȡ���б�
		System.out.println("sublist:" + list.subList(1, 2));
		System.out.println(list);

	}

}
