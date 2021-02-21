package com.lamresearch.nexus.testcase;

public class ExceptionHandling {
	public static void main(String[] args) {
		System.out.println("First line");
		System.out.println("Second line");
		System.out.println("Third line");
		int[] myIntArray = new int[] { 1, 2, 34 };
		/* boolean result = print4thItemInArray(myIntArray); */
		try {
			print4thItemInArray(myIntArray);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("Fourth line");
		System.out.println("Fith line");
		// System.out.println(result);
	}

	private static void print4thItemInArray(int[] arr) throws Exception {
		/*
		 * boolean result = true; try { System.out.println(arr[3]); } catch
		 * (Exception e) {
		 * 
		 * System.out.println("Fourth element not displayed!"); result = false;
		 * } return result;
		 */

		System.out.println(arr[3]);
		System.out.println("Fourth element successfully displayed!");

	}
}
