package map;

import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class Main_Map {
	public static void main(String[] args) {
		
		Map<Integer, String> employeeMap = new TreeMap<Integer, String>();

		//then you just access the reversedMap however you like...
		for (Map.Entry entry : employeeMap.entrySet()) {
		    System.out.println(entry.getKey() + ", " + entry.getValue());
		}

		// ���������� ������� � ����������
		employeeMap.put(45 , "�������");
		employeeMap.put(23, "��������");
		employeeMap.put(55  , "�����");
		employeeMap.put(3, "���������");
		employeeMap.put(32, "����������");
		employeeMap.put(476 , "��������");
		employeeMap.put(7 , "���������");
		
		for (Map.Entry entry : employeeMap.entrySet()) {
		    System.out.println(entry.getKey() + ", " + entry.getValue());
		}
		
		System.out.println("Pls enter ID:");
		 Scanner input = new Scanner(System.in); 
		 int id = input.nextInt();
		 
			 
		 if (employeeMap.get(id) != null) {
			 System.out.println(employeeMap.get(id));}
		 else {
			 System.out.println("Not present");
		 }
		 System.out.println("Pls enter Name:");
		 String str = input.next();
		 
		 if (employeeMap.containsValue(str)) {
			 System.out.println(employeeMap.values());}
		 else {
			 System.out.println("Not present");
		 }
		 
		
		
		
	}

}
