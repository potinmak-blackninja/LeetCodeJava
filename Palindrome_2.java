package JavaLeetCodes;

import java.util.Scanner;

public class Palindrome_2 {
	public static void main(String[] args) {
		Scanner myObj = new Scanner(System.in);
		System.out.println("Please input your word:");
		int word = myObj.nextInt();
		System.out.println(ispalindrome(word));
	}
	
	public static Boolean ispalindrome(int num) {
		int num_old = num;
		int reversed = 0;
		if (num <0) {
			return false;
		}
		if (num <10) {
			return true;
		}else {
		while(num != 0) {
				 //956
				int digit = num%10; //6
				reversed = reversed*10 +digit;//6
				num /= 10; //95
				}
			if (num_old == reversed) {
				return true;
			}return false;
			
		}
		
	}
	
}


