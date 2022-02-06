package com.gl.dsa.assigment3.question2;
import java.io.*;

class Node
{
	int data;
	Node left, right;
	Node(int item)
	{
		data = item;
		left = right = null;
	}
}
public class skewedTree
{
	public static Node node;
	static Node previousNode = null;
	static Node headNode = null;
	static void skewTree(Node root, int order)
	{
		if(root == null)
		{
			return;
		}
		if(order > 0)
		{
			skewTree(root.right, order);
		}
		else
		{
			skewTree(root.left, order);
		}
		Node rightNode = root.right;
		Node leftNode = root.left;
		if(headNode == null)
		{
			headNode = root;
			root.left = null;
			previousNode = root;
		}
		else
		{
			previousNode.right = root;
			root.left = null;
			previousNode = root;
		}
		if (order > 0)
		{
			skewTree(leftNode, order);
		}
		else
		{
			skewTree(rightNode, order);
		}
	}
	static void rightSkew(Node root)
	{
		if(root == null)
		{
			return;
		}
		System.out.print(root.data + " ");
		rightSkew(root.right);	
	}
	public static void main (String[] args)
	{
	
		skewedTree root = new skewedTree();
		root.node = new Node(50);
		root.node.left = new Node(30);
		root.node.right = new Node(60);
		root.node.left.left = new Node(10);
		root.node.right.left= new Node(55);
		int order = 0;
		skewTree(node, order);
		rightSkew(headNode);
	}
}
