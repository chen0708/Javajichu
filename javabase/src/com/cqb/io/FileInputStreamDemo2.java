package com.cqb.io;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class FileInputStreamDemo2 {

	public static void main(String[] args) {

		File file = new File("E:\\demo\\test.txt");
		FileInputStream fi1 = null;
		try {
			fi1 = new FileInputStream(file);
			byte[] len = new byte[5];
			int b;
			while ((b = fi1.read(len)) != -1) {
				for (int i = 0; i < b; i++) {
					System.out.print((char) len[i]);
				}

			}
		

		} catch (IOException e) {

			e.printStackTrace();
		} finally {
			if (fi1 != null) {
				try {
					fi1.close();
				} catch (Exception e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}

		}

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
