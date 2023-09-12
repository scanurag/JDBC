package MethodRef;
import streamAPIImp.Person;
public class MethodRefClass {
public static  String opret(Person p) {
	return p.getName().toUpperCase();
	}
public static int opret(int i) {
	return i*i;
}
}
