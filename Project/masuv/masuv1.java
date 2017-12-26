package masuv;
/**
 * In this class, we create an array of Mar and Enum with a class ValueComparator
 */

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.TreeMap;

import Enum_Sterland.Sterland_compact_power_11;
import Enum_Sterland.Sterland_compact_power_22;
import Enum_Sterland.Sterland_compact_power_33;

public class masuv1 {

	int puver1;

	public masuv1() {
		this.puver1 = puver1;

	}

	// rray of heating batteries type 11
	public Map masuv_111(int puver1) {
		System.out.println("batareja 11");
		Map<String, Integer> map1 = new HashMap<String, Integer>();
		Map<String, Integer> map1_1 = new HashMap<String, Integer>();
		for (Sterland_compact_power_11 iterable_element_11 : Sterland_compact_power_11.values()) {
			map1.put(iterable_element_11.name(), iterable_element_11.getId());

		}

		Iterator<Map.Entry<String, Integer>> iter1 = map1.entrySet().iterator();
		// Виводжу елементи мапи на консоль

		while (iter1.hasNext()) {
			Map.Entry<String, Integer> temp1 = iter1.next();

			if ((puver1) <= temp1.getValue()) {

				map1_1.put(temp1.getKey(), temp1.getValue());
			}
			if ((puver1) > temp1.getValue()) {

				break;

			}

		}

		// sorting the array
		ValueComparator bvc = new ValueComparator(map1_1);
		TreeMap<String, Integer> sorted_map = new TreeMap<String, Integer>(bvc);
		sorted_map.putAll(map1_1);
		// System.out.println(puver1);
		// System.out.println(sorted_map);

		return sorted_map;
	}

	// rray of heating batteries type 11
	public Map masuv_222(int puver1) {
		System.out.println("batareja 22");

		Map<String, Integer> map2 = new HashMap<String, Integer>();
		Map<String, Integer> map2_2 = new HashMap<String, Integer>();
		for (Sterland_compact_power_22 iterable_element_22 : Sterland_compact_power_22.values()) {
			map2.put(iterable_element_22.name(), iterable_element_22.getId());

		}

		Iterator<Map.Entry<String, Integer>> iter2 = map2.entrySet().iterator();
		// Виводжу елементи мапи на консоль

		while (iter2.hasNext()) {
			Map.Entry<String, Integer> temp2 = iter2.next();

			if ((puver1) <= temp2.getValue()) {

				map2_2.put(temp2.getKey(), temp2.getValue());
			}
			if ((puver1) > temp2.getValue()) {

				break;
			}

		}

		// sorting the array
		ValueComparator bvc = new ValueComparator(map2_2);
		TreeMap<String, Integer> sorted_map = new TreeMap<String, Integer>(bvc);
		sorted_map.putAll(map2_2);
		// System.out.println(puver1);
		// System.out.println(sorted_map);

		return sorted_map;
	}

	// rray of heating batteries type 11
	public Map masuv_333(int puver1) {
		System.out.println("batareja 33");

		Map<String, Integer> map3 = new HashMap<String, Integer>();
		Map<String, Integer> map3_3 = new HashMap<String, Integer>();
		for (Sterland_compact_power_33 iterable_element_33 : Sterland_compact_power_33.values()) {
			map3.put(iterable_element_33.name(), iterable_element_33.getId());

		}

		Iterator<Map.Entry<String, Integer>> iter3 = map3.entrySet().iterator();
		// Виводжу елементи мапи на консоль

		while (iter3.hasNext()) {
			Map.Entry<String, Integer> temp3 = iter3.next();

			if ((puver1) <= temp3.getValue()) {

				map3_3.put(temp3.getKey(), temp3.getValue());
			}
			if ((puver1) > temp3.getValue()) {

				break;
			}

		}
		// sorting the array
		ValueComparator bvc = new ValueComparator(map3_3);
		TreeMap<String, Integer> sorted_map = new TreeMap<String, Integer>(bvc);
		sorted_map.putAll(map3_3);
		// System.out.println(puver1);
		// System.out.println(sorted_map);

		return sorted_map;
	}

}
