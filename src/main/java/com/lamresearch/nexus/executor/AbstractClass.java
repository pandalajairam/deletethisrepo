package com.lamresearch.nexus.executor;

public  class AbstractClass {
	
	public final int integerVar = 0;
	public String str = null;

	public AbstractClass() {
		this.getClass().getName();
		System.out.println("Abstract class constructor");
	}

	public final void finalMethod() {
		System.out.println("Hello from Abstract class");
	}

	public void abstractMethod() {
	}
}
