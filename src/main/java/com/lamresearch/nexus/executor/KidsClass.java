package com.lamresearch.nexus.executor;

public class KidsClass extends ParentClass{

	public KidsClass()
	{
		System.out.println("Kids Class constructor");
	}
	static {
		System.out.println("I\'m in static block of KidsClass");
	}
	{
		System.out.println("In the non static block of the Kids class");
	}
	
	public void kidsClassMethod()
	{
		System.out.println("This is kids specific method");
	}
	
	@Override
	public void sayHello()

	{
		System.out.println("Hello from Kids class");

	}

}
