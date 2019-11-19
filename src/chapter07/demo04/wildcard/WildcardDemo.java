package chapter07.demo04.wildcard;

import chapter07.demo02.useGeneric.Generic;

public class WildcardDemo {
	public static void func(Generic<?> object) {
		
	}
	
	public static void main(String[] args) {
		long startTime = System.nanoTime();

		Generic<Object> object = new Generic<Object>(12);
		func(object);
		
		Generic<Integer> intObject = new Generic<Integer>(12);
		
		func(intObject);
		

		long endTime = System.nanoTime();

		System.out.println("程序运行时间：" + (endTime - startTime) / 1000 + "μs.");

	}
}
