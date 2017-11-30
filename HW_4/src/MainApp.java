import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class MainApp {
	
	public enum Breed{
		TERRIER,PITBULL,HASKI,SHEPHERD
	}
	
	public enum HttpErrors {
		BED_REQUEST,UNAUTHORIZED,PAYMENT_REQUIRED,FORBIDDEN
	}
	
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.println("Which part of task you want to run? Input 1 or 2:");
		int task = Integer.parseInt(br.readLine());

		switch (task) {
	case (1):	
		
		float[] n = new float[3];
		
		System.out.println("Input three numbers:");
		for (int i = 0; i < n.length; i++) {
			n[i] = Float.parseFloat(br.readLine());
		}
		
		int flag = 0;
		for (int i = 0; i < n.length; i++) {
			if ((n[i] < -5 || n[i] > 5)) {
				System.out.println("They aren`t belong to the range [-5;5]");
				flag = 1;
				break;
			}
		}

		if (flag == 0) {
			System.out.println("They are belong to the range [-5;5]");
		}

		int[] num = new int [3];
		int max = 0, min = 0;
		
		System.out.println("Input three numbers:");
		for (int i = 0; i < num.length; i++) {
			num[i] = Integer.parseInt(br.readLine());
		}
		
		max = num[0];
		for (int i = 0; i < num.length; i++) {
			if(num[i] > max)
				max = num[i];
		}

		min = num[0];
		for (int i = 0; i < num.length; i++) {
			if(num[i] < min)
				min = num[i];
		}
		
		System.out.println("The biggest number is: " + max);
		System.out.println("The least number is: " + min);
		
		HttpErrors err = HttpErrors.BED_REQUEST;
		
		System.out.println("Input number of error:");
		int key = Integer.parseInt(br.readLine());
		
		switch (key) {
		case 400:
			err = HttpErrors.BED_REQUEST;
			break;
			
		case 401:
			err = HttpErrors.UNAUTHORIZED;
			break;

		case 402:
			err = HttpErrors.PAYMENT_REQUIRED;
			break;
			
		case 403:
			err = HttpErrors.FORBIDDEN;
			break;
			
		default:
			System.out.println("Upps! Can`t find information about error");
			System.exit(0);;
		}
		
		System.out.println(key + " means " + err);
	break;	
	
	case (2):	
		
	    Dog[] dog = new Dog[3];
	
		dog[0] = new Dog("Lucky",Breed.HASKI,2);
		dog[1] = new Dog("Duk",Breed.PITBULL,7);
		dog[2] = new Dog("Pes",Breed.SHEPHERD,5);
		Dog oldDog = new Dog();
			
		System.out.println("There " + (Dog.isSameName(dog)?"are ":"aren`t ") + "dogs with the same name");
		
		oldDog = Dog.oldestDog(dog);
		System.out.println("The oldest dog is " + oldDog.getName() + " and his breed is " + oldDog.getBreed());

	}
}	
}
