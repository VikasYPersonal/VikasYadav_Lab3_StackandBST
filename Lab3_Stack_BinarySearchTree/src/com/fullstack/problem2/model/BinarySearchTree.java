package com.fullstack.problem2.model;

import java.util.Deque;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Set;

public class BinarySearchTree {

	public Node insertNode(Node root, int data) {

		Node newNode = new Node(data);

		//Node x = root;
		Node current_parent = null;

		while (root != null) {
			current_parent = root;
			if (data < root.data)
				root = root.left;
			else if (data > root.data)
				root = root.right;
			else {
				System.out.println("Value already exists!!!");
				return newNode;
			}
		}

		// If the root is null, the tree is empty.
		if (current_parent == null)
			current_parent = newNode;
		// assign new node node to the left child
		else if (data < current_parent.data)
			current_parent.left = newNode;
		// assign the new node to the right child
		else
			current_parent.right = newNode;
		// return pointer to new node
		return current_parent;
	}


	public void inorder(Node root) {
		if (root == null)
			return;
		else {
			inorder(root.left);
			System.out.print(root.data + " ");
			inorder(root.right);
		}
	}
	
	public boolean findPair(Node root, int sum, Set<Integer> set) {
		
		if(root == null)
			return false;
		if(findPair(root.left, sum,set))
			return true;
		
		int diff = sum - root.data;
		if(set.contains(diff)) {
			System.out.println("Pair: (" + diff + "," + root.data + ")");
			return true;
		}else
			set.add(root.data);
		
		return findPair(root.right, sum, set);
	}

}
