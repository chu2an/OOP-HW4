package fcu.iecs.oop.password;

import java.util.Scanner;

public class Main
{
	public static void main(String[] args)
	{
		String stringa="0";
		Scanner input=new Scanner(System.in);
		PasswordEnocorder per=new PasswordEnocorder() ;
		
		while(stringa.equalsIgnoreCase("exit")==false)
		{
			System.out.println("Please enter a password");
			stringa=input.next();
			per.encode(stringa);
		}
		System.out.println("Good bye!");
		input.close();
	}
}
