package Assignment4;

import java.util.Scanner;

public class CountNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String s = sc.nextLine();
		
		count(s);
	}
	static void count(String s) {
		int specialChars = 0, vowels = 0, consonants = 0;
		
		for(int i = 0; i < s.length(); i++) {
			if(s.charAt(i) >= 32 && s.charAt(i) <= 64) {
				specialChars++;
			}
			else if(isVowel(s.charAt(i))) {
				vowels++;
			}
			else if(!(isVowel(s.charAt(i)))) {
				consonants++;
			}
		}
		System.out.println("Special characters: " + specialChars);
		System.out.println("Vowels: " + vowels);
		System.out.println("Consonants: " + consonants);
	}
	static boolean isVowel(char c) {
		c = Character.toUpperCase(c);
		
		if(c == 'A' || c == 'E' || c == 'I' || c == 'O' || c == 'U') {
			return true;
		}
		return false;
	}
}
