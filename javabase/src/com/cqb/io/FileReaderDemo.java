package com.cqb.io;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.InputStreamReader;
import java.io.Reader;

public class FileReaderDemo {

	public static void main(String[] args) throws Exception {
		File file1 = new File("d:\\demo\\test.txt");
		Integer[] num = new Integer[3];// 创建数组接收文本中的参数

		if (!file1.exists()) {
			File parentsPath = file1.getParentFile();
			parentsPath.mkdirs();
			boolean b = file1.createNewFile();
			System.out.println("文件创建完成 : " + b);
		} // 判断file1文件是否存在，若不存在则新建一个

		FileOutputStream fw = new FileOutputStream(file1);
		FileReader fis = new FileReader(file1);
		//InputStreamReader isr = new InputStreamReader(fis);
		//BufferedReader br = new BufferedReader(fis);
		// 定义fw和br进行数据的读写操作。

		// 写入配置文件信息，写完之后刷新数据流
		/*fw.write("这是一个JAVA的上机题的文档文件； \r\n");
		fw.write(" 一个正整数，它加上100后是一个完全平方数，再加上168又是一个完全平方数，请问这个该数是多少？\r\n");
		fw.write("需要的参数如下：通过本程序读取文件，解析下面的字符串得到需要的参数值； \r\n");
		fw.write("100#168#1000\r\n");
		fw.write("题目的要求是：在此文档中使用程序写入解题思路，同时在源码中，尽可能多写注释让人一眼看懂逻辑；\r\n ");
		fw.write("将计算结果写回这个文件的尾部，有多个结果时，换行输出，以方便阅读。\r\n ");
		fw.write("解题思路：创建文件，先判断文件是否存在，若不存在则新建，若存在，则跳过；\r\n");
		fw.write("定义FileWriter字符流的fw进行写入操作，定义FileInputStream的字节流fis进行读取文件内容，将fis转换为字符流isr方便程序处理，再将isr存入缓冲流中；\r\n");
		fw.write("读取文件内容至控制台并利用split将数值解析至数组中。\r\n");
		fw.flush();*/

		String str;
		while ((str = br.readLine()) != null) {// 判断下一行是否为空，若不为空，则进行读取操作
			System.out.println(str);
			if (str.contains("#")) {// 对读取的行进行匹配，若行中含有#号则进入分支语句
				String[] str2 = str.split("#");// 对行按#号进行分割，并存入到数组str2中
				for (int i = 0; i < str2.length; i++) {
					num[i] = Integer.valueOf(str2[i]);// 遍历数组，将str2数组转为Integer数组num中存储
				}
			}
		}
		System.out.print("参数为： ");
		fw.write("\r\n参数为:\r\n");
		for (Integer integer : num) {
			System.out.print(integer + " ");
			fw.write(integer + " ");// 遍历输出并存入文件
		}

		System.out.println();
		System.out.println("这个整数为： ");
		fw.write("\r\n 整数为:\r\n");

		for (int i = 1; i <= num[2]; i++) {
			if ((Math.sqrt(i + num[0]) % 1 == 0) && (Math.sqrt(i + num[0] + num[1]) % 1 == 0)) {
				System.out.println(i);
				fw.write(i + "  \r\n");
			} // 循环判断满足条件的整数
		}
		fw.close();
		br.close();// 关闭流
	}
}
