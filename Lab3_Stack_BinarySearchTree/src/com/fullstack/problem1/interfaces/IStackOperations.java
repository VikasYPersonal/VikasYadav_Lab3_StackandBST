package com.fullstack.problem1.interfaces;

public interface IStackOperations {
	
	public int push(char[] stack, char ch, int stackSize, int pointer);
	
	public int pop(char[] stack, int stackSize, int pointer,char ch);
}
