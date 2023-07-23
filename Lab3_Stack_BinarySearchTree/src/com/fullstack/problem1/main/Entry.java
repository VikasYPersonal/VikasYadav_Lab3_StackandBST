package com.fullstack.problem1.main;

import java.util.Scanner;

import com.fullstack.problem1.implementation.StackOperations;

public class Entry {

	static Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		char[] stack;
		int pointer = -1;
		String expression;
		int status = 0;

		do{		

			StackOperations stackOP = new StackOperations();

			System.out.println("Enter the expression to parse:");
			expression = scanner.next();
			stack = new char[expression.length()];

			for (int i = 0; i < expression.length(); i++) {
				// Print current character
				if (expression.charAt(i) == '{' || expression.charAt(i) == '[' || expression.charAt(i) == '(') {
					pointer = stackOP.push(stack, expression.charAt(i), stack.length, pointer);
				} else if (expression.charAt(i) == '}' || expression.charAt(i) == ']' || expression.charAt(i) == ')') {
					pointer = stackOP.pop(stack, stack.length, pointer, expression.charAt(i));
				}
			}

			if (pointer < 0) {
				System.out.println("Expression has Balanced Brackets !!!");
			} else {
				System.out.println("Expression dose not have Balanced Brackets !!!");
			}
			
			System.out.println("\n---------------- \n 0. Continue\n 1. Exit \n---------------");
			status = scanner.nextInt();
			
		} while (status != 1);

	}

}
