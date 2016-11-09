package com.cqb.annotation;

public class run {

	public static void main(String[] args) throws ClassNotFoundException {
		// TODO Auto-generated method stub
		String className = Thread.currentThread().getStackTrace()[2].getClassName();
		String methodName = Thread.currentThread().getStackTrace()[2].getMethodName();
		String str = "className.methodName";
        Class clazz=Class.forName(str);
        
        clazz.
	}

}
