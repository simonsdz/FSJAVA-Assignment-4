package Assignment4;

import java.util.Scanner;

public class Pangram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String s = sc.nextLine();
		
		if(isPangram(s) == true) {
			System.out.println("It is an Pangram");
		}
		else {
			System.out.println("It is not an Pangram");
		}
	}
	static boolean isPangram(String s) {
		s = s.toLowerCase();
		int[] count = new int[256];
		for(int i = 0; i < s.length(); i++) {
			count[s.charAt(i)]++;
		}
		for(int i = 97; i <= 122; i++) {
			if(!(count[i] >= 1)) {
				return false;
			}
		}
		return true;
	}
}
