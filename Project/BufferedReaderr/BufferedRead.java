package BufferedReaderr;
/**
 * This class is created to receive data
 */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BufferedRead {
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	private static int square;
	private static int text1;
	private static int text2;
	private static int text;

	public BufferedRead() {
		this.square = square;
	}

	// getting the square
	public static int Buffered_Reader_square() {

		System.out.println("Input square");
		try {

			int square = Integer.parseInt(br.readLine());
			//System.out.println(square);
			// br.close();
			return square;
		} catch (NumberFormatException e) {
			System.out.println("weraz");
			Buffered_Reader_square();

		} catch (IOException e) {

			e.printStackTrace();
		}
		return square;

	}

	// get data or room angles or not
	public static String Buffered_Reader_angle() throws IOException {

		System.out.println("corner room yes/no");
		String text = null;
		text = br.readLine();

		while (true) {
			if (text.equals("yes")) {
				String text1 = text;
				//System.out.println(text1);
				// br.close();
				return text1;

			}
			if (text.equals("no")) {
				String text2 = text;
				//System.out.println(text2);
				// br.close();
				return text2;
			}
			if ((text.equals("yes")) && (text.equals("no"))) {
				System.out.println("enter again value of the room");
				Buffered_Reader_angle();
				break;
			}
		}
		return null;

	}

}
