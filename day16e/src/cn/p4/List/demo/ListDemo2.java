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
				// �������ڲ������ϵ�ͬʱ�������޸���Ԫ�أ����������ˣ����׳��쳣
				// ����ڵ������У���Ҫʹ�ü��ϲ���Ԫ�أ����׳����쳣��
				//�����쳣�����ʽ��ʹ���б�������ListIterator
			}
			else{
				System.out.println("next:"+obj);
			}
			System.out.println("next:" + it.next());
		}*/
		
		// ListIterator����ʵ�ֵ�����������ɶ�Ԫ�ص���ɾ�Ĳ顣
		// ֻ��list�������ר�õĵ�������
		System.out.println("list:" + list);
		ListIterator it = list.listIterator(); // ����+1 һ��������ָ����Ԫ�ؿ�ʼ������
		while (it.hasNext()) {
			Object obj = it.next();
			if (obj.equals("abc2")) {
				it.set("abc9");
			}
		}
		System.out.println("list:" + list);

		while (it.hasPrevious()) {
			System.out.println("previous:" + it.previous()); // ���������
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
		// list���е�ȡ��Ԫ�صķ�ʽ֮һ
		for (int i = 0; i < list.size(); i++) {
			System.out.println("get:" + list.get(i));
		}
	}

}