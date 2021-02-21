
package com.lamresearch.nexus.testcase;
public class Child extends Parent{
	
	public static void show()
	{
		System.out.println("Child show method");
	}
	
	public void printMessage()
	{
		System.out.println("Print message from child class from other package");
	}
	
	public static void main(String[] args)
	{
		Parent p = new Child();
		p.show();
		Child c = new Child();
		c.show();
	}

}
