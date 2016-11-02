package com.cqb.javaenum;

import java.io.PrintStream;

import javax.swing.OverlayLayout;

import com.cqb.javaenum.EnumDemo.month;

public class TestEnum {
	public static void stamp(month mo) {
		PrintStream out = System.out;
		switch (mo) {
		case JANUARY:
			out.println(mo);
			break;
		case FEBRUARY:
			out.println(mo);
			break;
		case MARCH:
			out.println(mo);
			break;
		case APRIL:
			out.println(mo);
			break;

		default:
			break;
		}
	}

	public static void stamp1(EnumDemo2 en) {
		PrintStream out = System.out;

		switch (en) {
		case JANUARY:
			out.println(en);
			out.println(en.getIndex() + "--------" + en.getMon());
			break;
		case FEBRUARY:
			out.println(en);
			out.println(en.getIndex() + "--------" + en.getMon());
			break;
		case MARCH:
			out.println(en);
			out.println(en.getIndex() + "--------" + en.getMon());
			break;
		case APRIL:
			out.println(en);
			out.println(en.getIndex() + "--------" + en.getMon());
			break;
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		stamp(month.APRIL);
		stamp(month.FEBRUARY);
		stamp(month.JANUARY);
		stamp(month.MARCH);

		stamp1(EnumDemo2.APRIL);

		for (int i = 0; i < month.values().length; i++) {
			System.out.println(month.values()[i]);
		}
	}
}
