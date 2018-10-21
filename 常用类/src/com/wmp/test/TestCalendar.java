package com.wmp.test;

import java.util.Calendar;
import java.util.GregorianCalendar;

public class TestCalendar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Calendar calendar = new GregorianCalendar(2999,10,22,10,50);
		int year = calendar.get(Calendar.YEAR);
		int month = calendar.get(Calendar.MONTH);
		int weekday = calendar.get(Calendar.DAY_OF_WEEK);
	}

}
