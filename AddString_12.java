package JavaLeetCodes;
//415. Add Strings-
public class AddString_12 {
	public static void main(String[] args) {
		System.out.println(addStrings("123", "456"));
	}
	public static String addStrings(String num1, String num2) {
        int i = num1.length() - 1;
        int j = num2.length() - 1;
        StringBuilder builder = new StringBuilder();
        //The StringBuilder in Java represents a mutable sequence of characters.
        int carry = 0;
        while (i >= 0 || j >= 0) {
            if (i >= 0) {
                carry += num1.charAt(i) - '0';
                //System.out.println(carry);
            }
            if (j >= 0) {
                carry += num2.charAt(j) - '0';
            }
            builder.append((char)(carry % 10 + '0'));
            carry /= 10;
            i--;
            j--;
        }
        if (carry == 1) {
            builder.append('1');
        }
        return builder.reverse().toString();
    }
}
