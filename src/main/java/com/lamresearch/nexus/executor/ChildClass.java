package com.lamresearch.nexus.executor;

public class ChildClass extends AbstractClass {
	

	public void helloWorld() {

		System.out.println("The values of inherited variables are " + integerVar + " " + str);

	}

	public static void main(String[] args) {

		AbstractClass parentClass = new ChildClass();
		parentClass.finalMethod();

	}

	@Override
	public void abstractMethod() {
		// TODO Auto-generated method stub
		
	}
}
