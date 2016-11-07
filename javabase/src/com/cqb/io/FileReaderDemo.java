package com.cqb.io;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class FileReaderDemo {

	public static void main(String[] args) throws IOException {
		File file1 = new File("d:\\demo\\test.txt");
		/*
		 * 绗竴绉嶅垱寤烘枃浠剁洰褰曞拰鏂囦欢鏂规硶
		 */
		if (!file1.exists()) {
			File parentsPath = file1.getParentFile();
			parentsPath.mkdirs();
			boolean b = file1.createNewFile();
			System.out.println("鏄惁鍒涘缓鎴愬姛 : " + b);
		}
		/*
		 * 绗簩绉嶅垱寤烘枃浠剁洰褰曞拰鏂囦欢鏂规硶 File file2 = new File(file1.getParent());
		 * file2.mkdirs(); boolean b = file1.createNewFile();
		 * System.out.println("鏄惁鍒涘缓鎴愬姛 : " + b);
		 */

		FileWriter fw = new FileWriter(file1);
		FileInputStream fis = new FileInputStream(file1);
		InputStreamReader isr = new InputStreamReader(fis, "GBK");
		BufferedReader br = new BufferedReader(isr);
		// FileReader fr=new FileReader(file1);

		fw.write("杩欐槸涓�涓狫ava涓婃満棰樼殑鏂囨。鏂囦欢锛� \r\n");
		fw.write("涓�涓鏁存暟锛屽畠鍔犱笂100鍚庢槸涓�涓畬鍏ㄥ钩鏂规暟锛屽啀鍔犱笂168鍙堟槸涓�涓畬鍏ㄥ钩鏂规暟璇烽棶杩欎釜鏁版槸澶氬皯锛� \r\n");
		fw.write("闇�瑕佺殑鍙傛暟濡備笅锛岄�氳繃绋嬪簭璇诲彇鏂囨湰鏂囦欢锛岃В鏋愪笅闈㈢殑瀛楃涓插緱鍒伴渶瑕佺殑鍙傛暟鍊� \r\n");
		fw.write("100,168 \r\n");
		fw.write("瑙ｉ鎬濊矾锛氭柊寤轰竴涓猼xt鏂囦欢锛屽埄鐢‵ileWriter鏂规硶灏嗛鐩俊鎭啓鍏ヨ嚦鏂囦欢涓紝\r\n ");
		fw.write("浠庢枃浠朵腑璇诲彇鏁板�煎苟杩涜瑙ｆ瀽锛岃绠楃粨鏋滃苟鍐欏叆鏂囦欢涓璡r\n ");
		fw.close();
		String str;
		while ((str = br.readLine()) != null) {
			String s = "\\d+.\\d+|\\w+|\\d+";
			Pattern pattern = Pattern.compile(s);
			Matcher ma = pattern.matcher(str);
			while (ma.find()) {

				 ma.group();
			}

		}

	}

}
