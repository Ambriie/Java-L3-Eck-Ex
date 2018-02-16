package myproject;

import java.util.Scanner;

public class EE34 {
	private static Scanner stdin;

	public static void main(String[] args) {
		
	stdin = new Scanner(System.in);
		
	System.out.println("Veuillez renseigner la phrase que vous souhaitez découper :");
	String s = stdin.nextLine();
	String[] sep=s.split("\\W+");
	int l=sep.length;
	int i;
	
	for (i=0;i<l;i++){
		System.out.println(sep[i]);
		}
	}
	
	
}
