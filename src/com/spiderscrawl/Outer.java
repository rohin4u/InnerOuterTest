package com.spiderscrawl;

public class Outer {
	
	
	
	public void m1()
	{
		int x = 10;
		String y = "india";
		
		class Inner
		{
			public void m2() {
				
				System.out.println(x);
				System.out.println(y);
				
			}
			
		}
		Inner i = new Inner();
		i.m2();
	}
	
	public static void main(String[] args) {
		
		Outer o = new Outer();
		o.m1();
	}

}
