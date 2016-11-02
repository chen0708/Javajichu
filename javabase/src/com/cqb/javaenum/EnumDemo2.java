package com.cqb.javaenum;

import lombok.Getter;
import lombok.Setter;

public enum EnumDemo2 {
	JANUARY(1, "一月"), FEBRUARY(2, "二月"), MARCH(2, "三月"), APRIL(4, "四月");
	@Getter
	@Setter
	private Integer index;
	@Getter
	@Setter
	private String mon;

	private EnumDemo2(Integer index, String mon) {
		this.index = index;
		this.mon = mon;

	}

	
}
