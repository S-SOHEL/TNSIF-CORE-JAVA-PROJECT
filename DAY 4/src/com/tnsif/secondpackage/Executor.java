package com.tnsif.secondpackage;

	

import firstpackage.base;


public class Executor {

	public static void main(String[] args) {
		
		
		//accessing different package class
		
		base b1 = new base();
		
		//private, default , protected and public 
		
		b1.methodPublic();
		b1.varPublic=34567;
		b1.methodPublic();

	}

}