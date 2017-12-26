package Main;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import BufferedReaderr.BufferedRead;

import masuv.masuv1;
import Ñalculation.Ñalculation;

import java.util.Map.Entry;

public class Main {

	public static void main(String[] args) throws NumberFormatException, IOException, NullPointerException {

		BufferedRead br = new BufferedRead();
		int a = br.Buffered_Reader_square();
		String s = br.Buffered_Reader_angle();

		Ñalculation cal = new Ñalculation(a, s);

		int w = cal.puwer();

		int ss = cal.add_puver1(w);

		System.out.println();
		// calculations of the Map table of type 11 battery
		masuv1 mas1 = new masuv1();
		try {
			Map<String, Integer> map1 = mas1.masuv_111(ss);
			List<String> listt1 = new ArrayList<String>();
			listt1.addAll(map1.keySet());
			// System.out.println(listt1.get(0));
			String str1 = listt1.get(0);
			String pattern1 = "[0-9]+";
			Pattern p1 = Pattern.compile(pattern1);
			Matcher m1 = p1.matcher(str1);
			System.out.println("you need a battery with data type 11");
			System.out.println("height width");
			while (m1.find()) {

				System.out.print(str1.substring(m1.start(), m1.end()) + " ");

			}
		} catch (IndexOutOfBoundsException e) {
			System.out.println("vam potribnuj klas 22,33");
			e.getMessage();

		}

		System.out.println();
		System.out.println();
		// calculations of the Map table of type 22 battery
		try {
			Map<String, Integer> map2 = mas1.masuv_222(ss);
			List<String> listt2 = new ArrayList<String>();
			listt2.addAll(map2.keySet());
			// System.out.println(listt2.get(0));
			String str2 = listt2.get(0);
			String pattern2 = "[0-9]+";
			Pattern p2 = Pattern.compile(pattern2);
			Matcher m2 = p2.matcher(str2);
			System.out.println("you need a battery with data type 22");
			System.out.println("height width");
			while (m2.find()) {

				System.out.print(str2.substring(m2.start(), m2.end()) + " ");

			}
		} catch (IndexOutOfBoundsException e) {
			System.out.println("vam potribnuj klas 33");
			e.getMessage();
		}

		System.out.println();
		System.out.println();
		//// calculations of the Map table of type 33 battery
		try {
			Map<String, Integer> map3 = mas1.masuv_333(ss);
			List<String> listt3 = new ArrayList<String>();
			listt3.addAll(map3.keySet());
			// System.out.println(listt3.get(0));
			String str3 = listt3.get(0);
			String pattern3 = "[0-9]+";
			Pattern p3 = Pattern.compile(pattern3);
			Matcher m3 = p3.matcher(str3);
			System.out.println("you need a battery with data type 33");
			System.out.println("height width");
			while (m3.find()) {

				System.out.print(str3.substring(m3.start(), m3.end()) + " ");

			}
		} catch (IndexOutOfBoundsException e) {
			System.out.println("vam potribnuj pozdilutu plowy popolam");
			e.getMessage();
			System.out.println();

		}
	}

}
