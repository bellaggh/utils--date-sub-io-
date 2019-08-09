package com.ggh.test;

import java.io.UnsupportedEncodingException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Random;

import org.junit.Test;

public class PersonTest {

	@Test
	public void test() throws UnsupportedEncodingException, ParseException {
		for (int i = 0; i < 100; i++) {
			String name = StringUtils.generateChineseName();
			
			int age = RandomUtil.random(1, 120);
			
			String about = StringUtils.randomChineseString(140);
			
			String strAgo = "2010-01-01";
			
			SimpleDateFormat simple = new SimpleDateFormat("yyyy-MM-dd");
			
			Date now = new Date();
			
			long nowTime = now.getTime();
			Date ago = simple.parse(strAgo);
			long agoTime = ago.getTime();
			
			
			long sj =  (long) (Math.random()*(nowTime-agoTime+1)+agoTime);
			
			Date date = new Date(sj);
			String created = simple.format(date);
			Person person = new Person(name, age, about, created);
			System.out.println(person);
		}
		
		
	}
}
