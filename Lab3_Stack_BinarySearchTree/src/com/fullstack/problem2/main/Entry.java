package com.fullstack.problem2.main;

import com.fullstack.problem2.model.BinarySearchTree;
import com.fullstack.problem2.model.Node;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Entry {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		BinarySearchTree bst = new BinarySearchTree();
		Node root = null;
		
		int ch;
		String status = "c";
		int value;
		

		do {
			System.out.println(
					"\n---------------------\n0. Exit\n1. Insert into Binary Search Tree\n2. In-Order Travel\n3. Find the pair of sum \n---------------------");
			ch = sc.nextInt();

			switch (ch) {
			case 0:
				// when 0 is entered, stop execution of the program by breaking while loop
				status = "s";
				break;

			case 1:
				// insertion when tree is empty
				System.out.println("Enter value to insert:");
				value = sc.nextInt();
				if (root == null) {
					root = bst.insertNode(root, value);
				} else {
					bst.insertNode(root, value);
				}
				break;

			case 2:
				bst.inorder(root);
				break;
			
			case 3:
				System.out.println("Enter the Sum, to search the pair:");
				Set<Integer> set = new HashSet<Integer>();
				int sum = sc.nextInt();
				if(bst.findPair(root,sum,set)) {
					System.err.println("Pair Found...");
				}else {
					System.err.println("Pair Not Found...");
				}
				break;

			default:
				System.out.println("Invalid input");
			}
		} while (status != "s");

		System.out.println("Task completed!!");
		sc.close();
	}

}