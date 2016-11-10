package com.cqb.reflect;

import java.lang.reflect.Field;

public class ClassDemo {

	@SuppressWarnings("rawtypes")
	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		Class clazz = Person.class;
		System.out.println(clazz);
		// 第一种获得运行时类的方法

		String string = "com.cqb.reflect.Person";
		Class clazz2 = Class.forName(string);
		System.out.println(clazz2);
		// 第二种获得运行时类方法,必须是包名.类名

		Person person = new Person();
		Class clazz3 = person.getClass();
		System.out.println(clazz3);
		// 第三种获得运行时类的方法，先创建Person的对象，再利用对象的.getclass()方法获取

		// 创建运行时类的对象
	/*	Object obj = clazz.newInstance();
		Person p = (Person) obj;
		//和调用类的方法相同
		p.setName("lisi");;
		p.setAge(12);
		System.out.println(p);*/
		
		//获取运行时类的属性
		Class clazz4=Person.class;
		String str=clazz4.getCanonicalName();
		System.out.println(str);
		
		Field[] a= clazz4.getDeclaredFields();
		for (Field field : a) {
			System.out.println(field.getName());
		}//getDeclaredFields()是获取运行时类本身的所有属性（包括私有属性）
		
		Field[] fields=clazz4.getFields();
		for (Field field : fields) {
			System.out.println(field);
			System.out.println("此方法执行了");
		}//getFields()是获取运行时类及其父类的公共属性，私有属性不能获取
		
	
		
		Field[] b= clazz4.getDeclaredFields();
		for (Field field : a) {
			
			@Override
			System.out.print(field.getModifiers());

			
			
			
			
			System.out.println(field.getName());
		}
		
/*
		System.out.println(clazz.getConstructor());

		Constructor[] str = clazz.getConstructors();
		for (Constructor constructor : str) {
			System.out.println(constructor);
		}*/

	}

}
