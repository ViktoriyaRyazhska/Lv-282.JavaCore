package task;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class PhoneCalls {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader (System.in));
		
		 		
		System.out.print("������ ������� ������� ����������� ������ ��� ����� �1: ");
		Double c1 = Double.parseDouble(br.readLine());
		System.out.print("������ ��������� ����������� ������ �:1(�������): ");
		Double t1 = Double.parseDouble(br.readLine());
		System.out.println("������� ����������� ������ ��� ����� �1 = "+(c1*t1));
		
				System.out.print("������ ������� ������� ����������� ������ ��� ����� �2: ");
				Double c2 = Double.parseDouble(br.readLine());
				System.out.print("������ ��������� ����������� ������ �:2(�������): ");
				Double t2 = Double.parseDouble(br.readLine());
				System.out.println("������� ����������� ������ ��� ����� �2 = "+(c2*t2));
		
			System.out.print("������ ������� ������� ����������� ������ ��� ����� �3: ");
			Double c3 = Double.parseDouble(br.readLine());
			System.out.print("������ ��������� ����������� ������ �:3(�������): ");
			Double t3 = Double.parseDouble(br.readLine());
			System.out.println("������� ����������� ������ ��� ����� �3 = "+(c3*t3)); 		
		
				System.out.println("�������� ������� = "+(c1*t1+c2*t2+c3*t3));

	}

}
