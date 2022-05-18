import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class REGEX1 {

	public static void main(String[] args) {
		allUpper("ELLO");
		oneDigit("2h");
		phoneNum("7348599588");
		dateMatch("09/22/2002");
	}

	//method which verifies all characters in a string are uppercase
	public static void allUpper(String text) {
		String pat = "^\\p{javaUpperCase}+$";

		Pattern ptn = Pattern.compile(pat);
		Matcher mt = ptn.matcher(text);

		boolean result = mt.matches();
		System.out.println(result);
	}

	// method which verifies at least one character in a string is a digit
	public static void oneDigit(String text) {
		String pat = "\\d.";

		Pattern ptn = Pattern.compile(pat);
		Matcher mt = ptn.matcher(text);

		boolean result = mt.matches();
		System.out.println(result);
	}

	// method which verifies a phone number is entered correctly
	public static void phoneNum(String text) {
		String pat = "\\d\\d\\d\\d\\d\\d\\d\\d\\d\\d";

		Pattern ptn = Pattern.compile(pat);
		Matcher mt = ptn.matcher(text);

		boolean result = mt.matches();
		System.out.println(result);
	}

	// method which verifies a calendar date is entered correctly
	public static void dateMatch(String text) {
		String pat = "\\d\\d.\\d\\d.\\d\\d\\d\\d";

		Pattern ptn = Pattern.compile(pat);
		Matcher mt = ptn.matcher(text);

		boolean result = mt.matches();
		System.out.println(result);
	}
}
