package stringReverse;

import java.util.Scanner;

public class Reverse {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s = sc.nextLine();
		String s1 = "String Reverse Example";
		int length = s1.length();
		for(int i=length-1; i>=0; i--);
		{
			int i = 0;
			char chr = s1.charAt(i);
			System.out.println(chr);
		}
	}

}
