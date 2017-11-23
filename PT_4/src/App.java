import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class App {
	
	public enum Continent {
		EUROPE,ASIA,AMERICA
	}

	public static void main(String[] args) throws NumberFormatException, IOException {
		
		BufferedReader br = new BufferedReader(
				new InputStreamReader(System.in));
		
		int count=0;
		
		System.out.println("Input first number:");
		int n1 = Integer.parseInt(br.readLine());
		if(n1%2 != 0)
			count++;
		
		System.out.println("Input second number:");
		int n2 = Integer.parseInt(br.readLine());
		if(n2%2 != 0)
			count++;
		
		System.out.println("Input third number:");
		int n3 = Integer.parseInt(br.readLine());
		if(n3%2 != 0)
			count++;
		
		System.out.println("Number of odd = " + count);
	
		System.out.println("////////////////////////");
		
		System.out.println("Input number of the day of the week: ");
		int nDay = Integer.parseInt(br.readLine());
		
		switch (nDay) {
		case 1:
			System.out.println("Monday Ponedilok Ponedelnyk");
			break;
			
		case 2:
			System.out.println("Thusday Vivtorok Vtornyk");
			break;

		case 3:
			System.out.println("Wednesday Sereda Sreda");
			break;
			
		case 4:
			System.out.println("Thirthday Chetwer Chetwerg");
			break;
			
		case 5:
			System.out.println("Friday Pyatnyca Pyatnyca");
			break;
			
		case 6:
			System.out.println("Saturday Subota Subbota");
			break;
			
		case 7:
			System.out.println("Sunday Nedilya Voskresenye");
			break;
			
		default:
			System.out.println("Uups!");
			break;
		}
		
		System.out.println("////////////////////////");
			
		System.out.println("Input country:");
		String country = br.readLine();

		Continent con;
		con = Continent.EUROPE;	
		
		switch (country) {
		case "Ukraine": case "Germany" : case "France":
			con = Continent.EUROPE;
			break;
			
		case "USA": case "Canada" : case "Brasil":
			con = Continent.AMERICA;
			break;

		case "Russia": case "China" : case "OAE":
			con = Continent.ASIA;
			break;
			
		default:
			System.out.println("Upps!");
			break;
		}
		
	System.out.println("Your country located in " + con);
	
	System.out.println("////////////////////////");
	
		Product pr1 = new Product("Pen", 3.5,5);
		Product pr2 = new Product("Crayon", 2,55);
		Product pr3 = new Product("Ball", 150,25);
		Product pr4 = new Product("Flower", 80,11);
		
		double max = pr1.getPrice();
		double maxQty = pr1.getQuantity();
		Product prMax = pr1;
		Product prQty = pr1;
		
		if(max <= pr2.getPrice()) {
			max = pr2.getPrice();
			prMax = pr2;	
		}
		
		if(max <= pr3.getPrice()) {
			max = pr3.getPrice();
			prMax = pr3;
		}
		
		if(max <= pr4.getPrice()) {
			max = pr4.getPrice();
			prMax = pr4;
		}
		
		if(maxQty <= pr2.getQuantity()) {
			maxQty = pr2.getQuantity();
			prQty = pr2;
			}
		
		if(maxQty <= pr3.getQuantity()) {
			maxQty = pr3.getQuantity();
			prQty = pr3;
		}
		
		if(maxQty <= pr4.getQuantity()) {
			maxQty = pr4.getQuantity();
			prQty = pr4;
		}
			
		System.out.println("The most expensive item is " + prMax.getName() + " (" + prMax.getQuantity() + " qty)");
		System.out.println(prQty.getName() + " has the biggest quantity (" + prQty.getQuantity() + " qty)");
	}

}
