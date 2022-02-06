
package com.gl.dsa.assignment3.driver;
import java.util.Scanner;

import com.gl.dsa.assignment3.question1.StackImplementation;
public class Driver 
{

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the total no of floors in the building"); 
		int N = sc.nextInt();
		int[] floors = new int[N];
		for(int i = 0; i < N; i++) 
		{  
			System.out.println("Enter the floor size given on day " + (i+1));
			floors[i] = sc.nextInt(); 
		}  
		sc.close();
		StackImplementation si = new StackImplementation();
		si.printStack(floors);
	}

}