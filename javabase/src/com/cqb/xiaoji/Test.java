/*公鸡5元一只
 * 母鸡3元一只
 * 小鸡一元3只
 * 100元
 * 100只
 * 
 */

package com.cqb.xiaoji;

import java.util.Scanner;

public class Test {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("请输入您要买的只数");
		int num = input.nextInt();
		System.out.println("请输入您准备花多少钱");
		int money = input.nextInt();
		System.out.println("您可购买： ");
		input.close();
		for (int gongji = 0; gongji <= money / 5; ++gongji) {
			int muji = (3 * money - num - 14 * gongji) / 8;
			int xiaoji = num - gongji - muji;
			if (5 * gongji + 3 * muji + xiaoji / 3 == money && muji >= 0 && xiaoji >= 0) {
				System.out.println("公鸡有 ：" + gongji + "只" + "    母鸡有 ： " + muji + "只" + "     小鸡有 ： " + xiaoji + "只");
			}
		}

	}
}
