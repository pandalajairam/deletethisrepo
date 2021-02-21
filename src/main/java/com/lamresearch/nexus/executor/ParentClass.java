package com.lamresearch.nexus.executor;

public class ParentClass {
	
	public ParentClass()
	{
		System.out.println("Parent Class constructor");
	}
	
	static {
		System.out.println("I\'m in static block of ParentClass");
	}
	{
		System.out.println("In the non static block of the parent class");
	}

	public void sayHello() {
		System.out.println("Hello from parent class");
	}
}
