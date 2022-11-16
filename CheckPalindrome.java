package Assignment4;

public class CheckPalindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "2552";
		
		if(isPalindrome(s) == true) {
			System.out.println("It is a Palindrome");
		}
		else {
			System.out.println("It is not a Palindrome");
		}
	}
	static boolean isPalindrome(String s) {
		int left = 0, right = s.length()-1;
		while(left < right) {
			if(s.charAt(left) != s.charAt(right)) {
				return false;
			}
			left++; right--;
		}
		return true;
	}
}
