package com.scanu.datahandler.util;

public class StringHandler {

	public Integer stringCount(String data) {
		return data.length();
	}
	public String stringRev(String data) {
		String value="";
		for(int i=data.length()-1;i>=0;i--) {
			value+=data.charAt(i);
		}
		return value;
	}
}
