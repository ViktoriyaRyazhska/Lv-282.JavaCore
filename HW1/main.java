import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class main {

	public static void main(String[] args) throws NumberFormatException, IOException {
		
		BufferedReader br = new BufferedReader( new InputStreamReader(System.in));
		//BufferedReader br2 = new BufferedReader( new InputStreamReader(System.in));
		
//		System.out.println("enter the radius");
//		zavdanja_1 zv1 =new zavdanja_1(Integer.parseInt(br.readLine()));
//		zv1.perimeter();
//		zv1.area_by();
		
//		zavdanja_2 zv2= new zavdanja_2();
//		System.out.println("What is your name?");
//		zv2.name(br.readLine());
//		zv2.adress(br.readLine());
//		zv2.information();
		
		
		
		System.out.println("Input t1");
		double t1 = Double.parseDouble(br.readLine());
		System.out.println("Input t2");
		double t2 = Double.parseDouble(br.readLine());
		System.out.println("Input t3");
		double t3 = Double.parseDouble(br.readLine());
		zavdanja_3 zav3=new zavdanja_3(3.3, 4.5, 2.8,t1,t2,t3);
		zav3.c1_t1();
		zav3.c2_t2();
		zav3.c3_t3();		
		zav3.sum();
		
		
	}

}
