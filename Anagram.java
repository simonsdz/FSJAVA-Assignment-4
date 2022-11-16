package Assignment4;

import java.util.Scanner;

public class Anagram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String s1 = sc.nextLine();
		String s2 = sc.nextLine();
		
		if(isAnagram(s1, s2) == true) {
			System.out.println("It is an Anagram");
		}
		else {
			System.out.println("It is not an Anagram");
		}
	}
	static boolean isAnagram(String s1, String s2) {
		int count[] = new int[256];
		
		for(int i = 0; i < s1.length(); i++) {
			count[s1.charAt(i)]++;
		}
		for(int i = 0; i < s2.length(); i++) {
			count[s2.charAt(i)]--;
		}
		for(int i = 0; i < count.length; i++) {
			if(count[i] > 0) {
				return false;
			}
		}
		return true;
	}
}
