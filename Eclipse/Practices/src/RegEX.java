import java.util.regex.Matcher;
import java.util.regex.Pattern;

import package1.OOP;

public class RegEX {

	public static void main(String[] args) {
		
		Pattern pattern = Pattern.compile("([0-9]|[0-9][0-9]|[0-1][0-9][0-9]|[0-2][0-4][0-9]|2[0-5][0-5])");
		Matcher matcher = pattern.matcher("056");
		boolean b = matcher.matches();
		System.out.println(b);
		OOP oop = new OOP();
		oop.main(args);
		oop.print();
		oop.
}
}

//([0-9]{1,3})?[.].([0-9]{1,3})?[.].([0-9]{1,3})?[.].([0-9]{1,3})