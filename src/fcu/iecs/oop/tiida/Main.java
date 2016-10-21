package fcu.iecs.oop.tiida;

import java.util.Scanner;

public class Main
{
	public static void main(String[] args)
	{
		int numbers;
		Scanner input=new Scanner(System.in);
		NissanTiida nta=new NissanTiida();
		
		System.out.print("Please enter a number:");
		numbers=input.nextInt();
		for(int i=0;i<numbers;i++)
		{
			nta.tiida();
			System.out.printf("\n");
		}
		input.close();
	}
}
