package com.ggh.test;

import static org.junit.Assert.*;

import java.io.UnsupportedEncodingException;

import org.junit.Test;

public class StringUtilsTest {

	@Test
	public void testHasLength() {
		
		boolean hasLength = StringUtils.hasLength("");
		System.out.println(hasLength);
		
	}

	@Test
	public void testHasText() {
		
		boolean hasText = StringUtils.hasText("  ");
		System.out.println(hasText);
	}

	@Test
	public void testRandomChineseString() throws UnsupportedEncodingException {
		
		String chineseString = StringUtils.randomChineseString(77);
		System.out.println(chineseString);
	}

	@Test
	public void testGenerateChineseName() throws UnsupportedEncodingException {
		
		for (int i = 0; i < 10; i++) {
			String name = StringUtils.generateChineseName();
			System.out.println(name);
		}
		
		
	}

}
