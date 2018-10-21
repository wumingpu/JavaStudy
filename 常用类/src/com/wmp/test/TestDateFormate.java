package com.wmp.test;

import java.util.Date;
import java.text.DateFormat;
import java.text.SimpleDateFormat;

public class TestDateFormate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DateFormat df = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
		String str = df.format(new Date(400000000));
		System.out.println(str);
	}

}
