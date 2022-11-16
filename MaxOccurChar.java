package Assignment4;

import java.util.Scanner;

public class MaxOccurChar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String s = sc.nextLine();
		
		System.out.println(moreOccurence(s));
	}
	static char moreOccurence(String s) {
		int[] count = new int[256];
		
		for(int i = 0; i < s.length(); i++) {
			count[s.charAt(i)]++;
		}
		int max = 0, maxIndex = 0;
		char ch = ' ';
		for(int i = 0; i < count.length; i++) {
			if(count[i] > max) {
				max = count[i];
				maxIndex = i;
				ch = (char) maxIndex;
			}
		}
		return ch;
	}
}
