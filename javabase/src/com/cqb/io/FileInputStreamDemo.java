package com.cqb.io;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

public class FileInputStreamDemo {

	public static void main(String[] args) throws IOException {

		File file = new File("E:\\demo\\test.txt");
		FileInputStream fi1 = new FileInputStream(file);
		byte[] len = new byte[5];
		//int b;
		while ((fi1.read(len))!= -1) {
			for (int i = 0; i <fi1.read(len); i++) {
				System.out.print((char) len[i]);
			}

		}
		/*
		 * for (int i : len) { System.out.print((char)i); }
		 */
	}

	/*
	 * FileInputStream fi = null; try { File file = new
	 * File("E:\\demo\\test.txt"); fi = new FileInputStream(file); int b; while
	 * (!((b = fi.read()) == -1)) { System.out.print((char) b); } } catch
	 * (IOException e) { e.printStackTrace(); } finally { if (fi != null) try {
	 * fi.close(); } catch (IOException e) { e.printStackTrace(); } }
	 * 
	 * 
	 * }
	 */
	/*
	 * public void testFileInputStream() throws IOException{
	 */

}
