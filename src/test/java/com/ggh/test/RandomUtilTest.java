package com.ggh.test;


import org.junit.Test;

public class RandomUtilTest {

	@Test
	public void testRandom() {
		for (int i = 0; i < 10; i++) {
			int rn = RandomUtil.random(1, 3);
			System.out.println(rn);
		}
		
		
		
	}

	@Test
	public void testSubRandom() {
		
		int[] subRandom = RandomUtil.subRandom(1, 10, 3);
		
		for (int i : subRandom) {
			System.out.println(i);
		}
	}

	@Test
	public void testRandomCharacter() {
		for (int i = 0; i < 10; i++) {
			char c = RandomUtil.randomCharacter();
			System.out.println(c);
		}
	}

	@Test
	public void testRandomString() {
		for (int i = 0; i < 10; i++) {
			String string = RandomUtil.randomString(4);
			System.out.println(string);
		}
	}

}
