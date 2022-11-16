package Assignment4;

import java.util.Scanner;

public class RemoveDuplicates {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s = sc.nextLine();
		
		System.out.println(remove(s));
	}
	static String remove(String str) {
		// Just making all the characters lowercase so that same 
		//alphabet shouldn't be printed in big and small sizes
		String s = str.toLowerCase();
		String ans = "";
		int[] count = new int[256];
		for(int i = 0; i < s.length(); i++) {
			if(count[s.charAt(i)] == 0) {
				ans += s.charAt(i);
				count[s.charAt(i)]++;
			}
		}
		return ans;
	}
}
