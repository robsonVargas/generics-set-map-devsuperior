package exercise2.application;

import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class Program {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		Set<Integer> set = new TreeSet<>();
		
		System.out.print("How many students for course A? ");
		int courseA = sc.nextInt(); 
		
		for (int i = 0; i < courseA; i++) {
			int aluno = sc.nextInt();
			set.add(aluno);
		}
		
		System.out.print("How many students for course B? ");
		int courseB = sc.nextInt(); 
		
		for (int i = 0; i < courseB; i++) {
			int aluno = sc.nextInt();
			set.add(aluno);
		}
		
		System.out.print("How many students for course C? ");
		int courseC = sc.nextInt(); 
		
		for (int i = 0; i < courseC; i++) {
			int aluno = sc.nextInt();
			set.add(aluno);
		}
		
		System.out.println("Total students = " + set.size());
		
		
		
		sc.close();
	}

}
