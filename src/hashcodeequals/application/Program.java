package hashcodeequals.application;

import hashcodeequals.entities.Client;

public class Program {

	public static void main(String[] args) {
		Client c1 = new Client("Maria", "maria@gmail.com");
		Client c2 = new Client("Maria", "maria@gmail.com");
		
		String s1 = new String("Test");
		String s2 = new String("Test");
		
		String s3 = "Test2";
		String s4 = "Test2";
		
		System.out.println(c1.hashCode());
		System.out.println(c2.hashCode());
		System.out.println(c1.equals(c2));
		System.out.println(c1 == c2);
		System.out.println(s1 == s2);
		System.out.println(s3 == s4);
	}

}
