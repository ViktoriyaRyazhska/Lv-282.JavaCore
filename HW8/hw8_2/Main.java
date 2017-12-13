package hw8_2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		System.out.println("Input your string");
        String text = br.readLine();
       
        Pattern p = Pattern.compile("[\\S]+[\\s]");
		Matcher m = p.matcher(text);

		while (m.find()) {
			System.out.print(text.substring(m.start(), m.end()));
		}

}

	}


