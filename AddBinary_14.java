package JavaLeetCodes;

//67. Add Binary
public class AddBinary_14 {
	public static String addBinary(String a, String b) {
		StringBuilder sb = new StringBuilder();
		int i = a.length() - 1;
		int j = b.length() - 1;
		int carry = 0;
		
		while (i >= 0 || j >= 0) {
			int sum = carry;
			if (i >= 0) sum += a.charAt(i) - '0';
			System.out.println(sum);
			if (j >= 0) sum += b.charAt(j) - '0';
			sb.append(sum % 2);
			carry = sum / 2;
			
			i--;
			j--;
		}
		
		if (carry != 0) sb.append(carry);
		System.out.println(sb.toString());
		return sb.reverse().toString();
		
	}
	public static void main(String[] args) {
		System.out.println(addBinary("11", "1"));
	}

}
