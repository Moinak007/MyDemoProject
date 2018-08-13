package com.moinak.demo1;

import java.util.Scanner;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Enter the number" );
        Scanner sc= new Scanner(System.in);
        int p=sc.nextInt();
        for(int i=0;i<p;i++)
        {
        	for(int j=0;j<(i*2)+1;j++)
        	{
        		System.out.print("*");
        	}
        	System.out.println();
        }
    }
}
