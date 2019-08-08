package com.ggh.test;


import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

import org.junit.Test;

public class DateUtilTest {

	@Test
	public void testGetDateByInitMonth() {
		
		Date date = DateUtil.getDateByInitMonth(new Date());
		
		SimpleDateFormat simple = new SimpleDateFormat("yyyy-MM-dd HH-mm-ss");
		
		String time = simple.format(date);
		
		System.out.println(time);
		
	}

	@Test
	public void testGetDateByFullMonth() {
		
		Calendar c = Calendar.getInstance();
		
		c.set(2001, 1, 2);
		
		Date date = DateUtil.getDateByFullMonth(c.getTime());
		
		SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd HH-mm-ss");
		
		String time = dateFormat.format(date);
		
		System.out.println(time);
		
	}

}
