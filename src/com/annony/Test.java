package com.annony;

public class Test {

	public static void main(String[] args) {
		
		//annonymous inner class that extends a class
		
		Popcorn p = new Popcorn()
				{
					public void taste()
					{
						System.out.println("sweet");
					}
				
				};
				p.taste();
		Popcorn p1 = new Popcorn();
		p1.taste();
		
		Popcorn p2 = new Popcorn()
				{
					public void taste()
					{
						System.out.println("spicy");
					}
				};
				p2.taste();

	}

}
