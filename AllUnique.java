package Assignment4;

import java.util.Scanner;

public class AllUnique {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String s = sc.nextLine();
		
		if(isUnique(s) == true) {
			System.out.println("All unique");
		}
		else {
			System.out.println("Not all unique");
		}
	}
	static boolean isUnique(String s) {
		int[] count = new int[256];
		
		for(int i = 0; i < s.length(); i++) {
			count[s.charAt(i)]++;
		}
		for(int i = 0; i < count.length; i++) {
			if(count[i] > 1) {
				return false;
			}
		}
		return true;
	}
}
