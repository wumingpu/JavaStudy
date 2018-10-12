package com.wmp.oo1;

import com.wmp.oo.User;
// 如果写的是包.*，会降低编译速度，但是不会降低运行速度。

import java.util.Date;
import java.sql.*; // 遇到重名包的时候，编译器会优先选择指明的包。这种情况下，新建对象的时候，需要指明用的是哪个包里面的类

import static java.lang.Math.*; // 静态导入

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		User user = new User();
		
		Date date = new Date();
		
		System.out.println(PI);//静态导入，指的是导入类下面所有的静态属性
	}

}
