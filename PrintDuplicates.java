package Assignment4;

import java.util.Scanner;

public class PrintDuplicates {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String s = sc.nextLine();
		
		System.out.println(print(s));
	}

	static String print(String str) {
		String s = str.toLowerCase();
		String dups = "";
		int[] count = new int[256];
		for(int i = 0; i < s.length(); i++) {
			if(count[s.charAt(i)] == 1) {
				dups += s.charAt(i);
			}
			count[s.charAt(i)]++;
		}
		return dups;
	}
}
