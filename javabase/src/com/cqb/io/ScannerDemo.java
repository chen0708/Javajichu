package com.cqb.io;

import java.io.File;
import java.io.IOException;

public class ScannerDemo {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		File file = new File("e:\\demo\\test.txt");
		if (!file.exists()) {
			System.out.println("file.createNewFile() : " + file.createNewFile());
		}
		File file2 = new File("e:\\demo\\io\\test");
		if (!file2.exists()) {
			System.out.println("file2.mkdirs() : " + file2.mkdirs());
		}
		/*
		 * if(file2.exists()){
		 * System.out.println("file2.getParentFile().delete() : "+file2.
		 * getParentFile().delete()); }
		 */
		File file3 = new File("D:\\soft");
		String[] listfile3 = file3.list();
		for (String string : listfile3) {
			System.out.println(string);
		}

		File[] file4 = file3.listFiles();
		for (File file5 : file4) {
			System.out.println(file5);
            
		}

	}

}
