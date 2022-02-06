package com.gl.dsa.assignment3.question1;
import java.util.Stack;

public class StackImplementation 
{
	
	public void printStack(int[] floors) 
	{
		
		System.out.println("\nThe order of construction is as follows: ");
		
		Stack<Integer> building = new Stack<Integer>();

		int N = floors.length;

		for (int i = 0; i < floors.length; i++) 
		{

			System.out.println("Day: " + (i+1));

			building.add(floors[i]);

			while (!building.isEmpty() && building.peek() == N) 
			{
				System.out.print(building.pop() + " ");
				N--;
			}

			System.out.println();

		}
	}
	
}