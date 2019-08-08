package com.ggh.test;


import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.junit.Test;

public class StreamUtilTest {

	@Test
	public void testCloseAll() {
		
		
		
	}

	@Test
	public void testReadTextFileInputStream() throws Exception {
		
		String file = StreamUtil.readTextFile(new FileInputStream("e:/hello.txt"));
		System.out.println(file);
		
	}

	@Test
	public void testReadTextFileFile() throws Exception {
		
		
		String string = StreamUtil.readTextFile(new File("e:/hello.txt"));
		System.out.println(string);
		
	}

}
