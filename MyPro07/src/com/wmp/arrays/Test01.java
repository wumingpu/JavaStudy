package com.wmp.arrays;

public class Test01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr01 = new int[10];
		String arr02[] = new String[10];
		// 以上两种声明数组的方式都可以, new为在堆里面分配空间
		
		User[] arr03 = new User[3];
		
		arr01[0] = 13;
		arr01[1] = 15;
		
		for(int i=0; i<arr01.length; i++) {
			arr01[i] = 10*i;
		}
		for(int i=0; i<arr01.length; i++) {
			System.out.println(arr01[i]);
		}
		
		arr03[0] = new User(1001, "a");
		arr03[1] = new User(1002, "b");
		arr03[2] = new User(1003, "c"); // 此对象数组存储的是对象地址，对象的引用。
		
		for(int i=0; i<arr03.length; i++) {
			System.out.println(arr03[i].getId());
		}
	}

}

class User{
	private int id;
	private String name;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public User(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}
}
