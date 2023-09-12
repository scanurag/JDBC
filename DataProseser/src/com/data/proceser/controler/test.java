package com.data.proceser.controler;
import java.util.Scanner;

import com.scanu.datahandler.util.StringHandler;
public class test {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter a String");
	String line=sc.nextLine();
	StringHandler handler=new StringHandler();
	Integer length=handler.stringCount(line);
	String  revs=handler.stringRev(line);
	System.out.println("length of the String  is"+length);
	System.out.println("rev of the String  is"+revs);
}
}
