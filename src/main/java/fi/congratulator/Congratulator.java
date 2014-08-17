package fi.congratulator;

import java.util.Locale;
import java.util.ResourceBundle;

public class Congratulator {
	
	public static void main(String[] a) {
				new Congratulator(a);
	}

	public Congratulator(String[] args) {
		if(args.length != 3) {
			System.err.
			println("Usage: Name Name Date");
		} else {
			parse(args);
		}
	}
	
	private void parse(String[] a) {
		ResourceBundle messages = 
				ResourceBundle.getBundle("message",
						new Locale("fi", "FI"));
		System.out.println(new StringBuilder()
		.append(a[0]).append(
				messages.getString("separator"))
		.append(a[1]).append(
				messages.getString("text"))
		.append(System.lineSeparator())
		.append("[")	.append(a[2])
		.append(", \u221e)").toString());
	}

}
