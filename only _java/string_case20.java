import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class string_case20 {
	public static void main(String args[]) {
		try (Scanner in = new Scanner(System.in)) {
			System.out.print("Enter Gmail address:");
			String emailAddress = in.nextLine();
			if (isGmailAddress(emailAddress)) {
				System.out.println(emailAddress + " is a valid Gmail address.");
			} else {
				System.out.println(emailAddress + " is not a valid Gmail address.");
			}
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	public static boolean isGmailAddress(String emailAddress) {
		String expression = "^[\\w.+\\-]+@gmail\\.com$";
		CharSequence inputStr = emailAddress;
		Pattern pattern = Pattern.compile(expression, Pattern.CASE_INSENSITIVE);
		Matcher matcher = pattern.matcher(inputStr);
		return matcher.matches();

	}
}