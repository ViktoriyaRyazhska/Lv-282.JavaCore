package hw8_3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class main {

	public static void main(String[] args) throws IOException {
		
//		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//		 System.out.println("Input your string");
//         String word = br.readLine();
         
        String word="You blame me for $400 USD,. return $300 ... and at least $10!!..!";
		Pattern p = Pattern.compile("\\$(\\d*)(\\.\\d{2})?");
		Matcher m = p.matcher(word);
		while (m.find()) {
	        System.out.print(word.substring(m.start(), m.end()) + " ");
}

	}

}
