package com.cqb.io;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileReaderDemo {

	public static void main(String[] args) throws IOException {
		File file1 = new File("d:\\demo\\test1.txt");
		/*
		 * 第一种创建文件目录和文件方法
		 */
		if (!file1.exists()) {
			File parentsPath = file1.getParentFile();
			parentsPath.mkdirs();
			boolean b = file1.createNewFile();
			System.out.println("是否创建成功 : " + b);
		}
		/*
		 * 第二种创建文件目录和文件方法 File file2 = new File(file1.getParent());
		 * file2.mkdirs(); boolean b = file1.createNewFile();
		 * System.out.println("是否创建成功 : " + b);
		 */
		FileWriter fw = new FileWriter(file1);
		FileReader fr=new FileReader(file1);
		fw.write("这是一个Java上机题的文档文件： \r\n");
		fw.write("一个正整数，它加上100后是一个完全平方数，再加上168又是一个完全平方数请问这个数是多少？ \r\n");
		fw.write("需要的参数如下，通过程序读取文本文件，解析下面的字符串得到需要的参数值 \r\n");
		fw.write("100,168 \r\n");
		fw.write("解题思路：新建一个txt文件，利用FileWriter方法将题目信息写入至文件中，\r\n ");
		fw.write("从文件中读取数值并进行解析，计算结果并写入文件中\r\n ");
		fw.close();
		
		
		

	}

}
