import java.util.Scanner;

public class ComditionalHome3 {

	public static void main(String[] args) {
		System.out.println("Перелік помилок: 101,102,105,202,203,204,306,305,304,400,401,402 ");
		System.out.println("Введіть помилку ");
		Scanner sc = new Scanner(System.in);
		int pomulka = sc.nextInt();
		
		 switch (pomulka) {
		
			case 101:
				System.out.println("It is " + enam.SwitchingProtocols); 
				break;
			case 105:
				System.out.println("It is " + enam.NameNotResolved );
				break;
			case 102 :
				System.out.println("It is " + enam.Processing );
			break;
		case 202:
			System.out.println("It is " + enam.Accepted);
			break;
		case 203:
			System.out.println("It is " + enam.NonInformation);
			break;
		case 204:
			System.out.println("It is " + enam.NoContent);
			break;
		case 304:
			System.out.println("It is " + enam.NotModified);
			break;
		case 305:
			System.out.println("It is " + enam.UseProxy);
			break;
		case 306:
			System.out.println("It is " + enam.SwitchProxy);
			break;
		case 400:
			System.out.println("It is " + enam.BadRequest);
			break;
		case 401:
			System.out.println("It is " + enam.Unauthorezed);
			break;
		case 402:
			System.out.println("It is " + enam.PaymentRequired);
			break;
		default:
			System.out.println("Неіснуюча помилка");
			sc.close();
		}
	}

}
