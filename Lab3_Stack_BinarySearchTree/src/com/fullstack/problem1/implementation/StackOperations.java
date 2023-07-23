package com.fullstack.problem1.implementation;

import com.fullstack.problem1.interfaces.IStackOperations;

public class StackOperations implements IStackOperations {

	@Override
	public int push(char[] stack, char ch, int size, int pointer) {
		
		if(pointer >= size - 1) {
			System.out.println("Stack Overflow, user entered more characters than the length");
		}else {
			stack[++pointer] = ch;
			//System.out.println("Element added to the stack");
		}
		return pointer;
	}

	@Override
	public int pop(char[] stack, int size, int pointer,char ch) {
		if(pointer < 0 ) {
			System.out.println("Entered expression not has Balanced Brackets (Stack is empty) ");
		}else {
			if(stack[pointer] == '{' && ch == '}') {
				pointer--;
			}else if(stack[pointer] == '(' && ch == ')') {
				pointer--;
			}else if(stack[pointer] == '[' && ch == ']') {
				pointer--;
			}
		}
		return pointer;
	}

}
