package com.ggh.test;

import java.io.File;
import java.io.FileInputStream;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

import org.junit.Test;

public class DateUtil {

	/*
	* 方法1：(5分)
	* 给一个时间对象，返回该时间所在月的1日0时0分0秒。例如一个Date对象的值是2019-05-18 11:37:22
	* 则返回的结果为2019-05-01 00:00:00
	*/
	public static Date getDateByInitMonth(Date src){
		
		Calendar c = Calendar.getInstance();
		
		c.setTime(src);
		
		c.set(Calendar.DAY_OF_MONTH, 1);
		c.set(Calendar.HOUR_OF_DAY, 0);
		c.set(Calendar.MINUTE, 0);
		c.set(Calendar.SECOND, 0);
		
		
		return c.getTime();
	//TODO 实现代码
	}
	/*
	* 方法2：(5分)
	* 给一个时间对象，返回该时间所在月的最后日23时59分59秒，需要考虑月大月小和二月特殊情况。
	* 例如一个Date对象的值是2019-05-18 11:37:22，则返回的时间为2019-05-31 23:59:59
	* 例如一个Date对象的值是2019-02-05 15:42:18，则返回的时间为2019-02-28 23:59:59
	*/
	public static Date getDateByFullMonth(Date src){
		
		Calendar c = Calendar.getInstance();
		
		c.setTime(src);

		c.add(Calendar.MONTH, 1);
		
		c.set(Calendar.DAY_OF_MONTH, 1);
		c.set(Calendar.HOUR_OF_DAY, 0);
		c.set(Calendar.MINUTE, 0);
		c.set(Calendar.SECOND, 0);
		
		c.add(Calendar.SECOND, -1);
		
		return c.getTime();
	//TODO 实现代码
	}
	
	
	@Test
	public void test1() {
		/**
		 * 拼接下面根据时间范围查询订单的SQL：
			String sql = "select * from t_order where create_time>='{1}' and create_time<='{2}' ";
			将上面{1}的位置使用DateUtil工具类中的getDateByInitMonth()返回值替换，将上面{2}的位置使用DateUtil工具类中的getDateByFullMonth()返回值替换。最后打印出正确拼接的SQL字符串。

		 */
		String sql = "select * from t_order where create_time>='{1}' and create_time<='{2}' ";
		
		Date date1 = DateUtil.getDateByInitMonth(new Date());
		Date date2 = DateUtil.getDateByFullMonth(new Date());
		SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd HH-mm-ss");
		String string1 = dateFormat.format(date1);
		String string2 = dateFormat.format(date2);
		
		String replace = sql.replace("{1}",string1).replace("{2}", string2);
		System.out.println(replace);
		
	}

	@Test
	public void test2() {
		/**
		 * 测试FileUtil工具类中getTempDirectory()方法，输出本机操作系统临时目录(4分)
		     测试FileUtil工具类中getUserDirectory()方法，输出本机操作系统当前登录用户目录
		 */
		
		File file = FileUtils.getTempDirectory();
		System.out.println(file);
		
		File file2 = FileUtils.getUserDirectory();
		System.out.println(file2);
		
	}

	@Test
	public void test3() throws Exception {
		/**
		 * 测试StreamUtil工具类中readTextFile(输入文件文件参数)方法(4分)，并输出文件的内容(8分)。
		 */
		
		String readTextFile = StreamUtil.readTextFile(new File("e:/hello.txt"));
		System.out.println(readTextFile);
		
		System.out.println("--------------------------------------------------");
		
		String readTextFile2 = StreamUtil.readTextFile(new FileInputStream("e:/hello.txt"));
		System.out.println(readTextFile2);
		
	}

}
