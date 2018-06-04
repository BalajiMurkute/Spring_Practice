package com.util.javapractice.dailyP_0301.immutable;

import singletonTest.SingletonTest;

public class ImmutableTest {

	private static final String NAME = null;
	private static final int ID = 0;

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Immutable immutable1=new Immutable(ID, NAME);
		Immutable immutable2=new Immutable(ID, NAME);
		
		if(immutable1==immutable2) {
			System.out.println("Both Instances are same");
		}
		System.out.println("Both the Instannces are different");
		
		SingletonTest obj1=new SingletonTest();
		SingletonTest obj2=new SingletonTest();
		if(obj1==obj2) {
			System.out.println("Both are same");
		}
		
	}

}
