package com.ggh.test;


import java.io.File;

import org.junit.Test;

public class FileUtilsTest {

	@Test
	public void testGetExtendName() {
		
		String extendName = FileUtils.getExtendName("hello.love");
		System.out.println(extendName);
	}

	@Test
	public void testGetTempDirectory() {
		
		File file = FileUtils.getTempDirectory();
		System.out.println(file);
	}

	@Test
	public void testGetUserDirectory() {
		
		File file = FileUtils.getUserDirectory();
		System.out.println(file);
	}

}
