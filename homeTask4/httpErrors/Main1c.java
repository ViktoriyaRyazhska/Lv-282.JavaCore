package hw4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main1c {

	enum HTTPError { Bad_Request, Unauthorized, Payment_Required, Forbidden, Not_Found, Method_Not_Allowed, Unknown_Error}
	
	
	
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	
	public static void main(String[] args) throws IOException {
	
		int errorNumber = getNumberOfError();
		System.out.println("For your code " + errorNumber + " the error is " + returnError(errorNumber));
	}

	
	public static int getNumberOfError() throws NumberFormatException, IOException {
		System.out.println("Write number of error");
		return Integer.parseInt(br.readLine());
		
	}
	
	public static HTTPError returnError(int errorNumber) throws NumberFormatException, IOException {
		
		HTTPError error;
		switch (errorNumber) {
		
		case 400:
			error = HTTPError.Bad_Request;
			break;
		case 401:
			error = HTTPError.Unauthorized;
			break;
		case 402:
			error = HTTPError.Payment_Required;
			break;
		case 403:
			error = HTTPError.Forbidden;
			break;	
		case 404:
			error = HTTPError.Not_Found;
			break;
		case 405:
			error = HTTPError.Method_Not_Allowed;
			break;	
		default:
			error = HTTPError.Unknown_Error; 
			break;
		}
		
		return error;
	}
	
}
