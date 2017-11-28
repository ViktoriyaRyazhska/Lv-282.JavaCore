package HTTP_Error;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class main {

	public static void main(String[] args) throws NumberFormatException, IOException {
		HTTP_Error_Enum http_Error_Enum;
		
		BufferedReader br = new BufferedReader( new InputStreamReader(System.in));
		System.out.println("Input Error number 400..");
		int httpError = Integer.parseInt(br.readLine());
		int coont=0;
		
		for (HTTP_Error_Enum http_Error_Enum1: HTTP_Error_Enum.values()) {	
		
		if(httpError==http_Error_Enum1.getId()) {
			System.err.println(http_Error_Enum1);
			coont++;
		}
		
		}
		if(coont==0){
			System.err.println("error !");
		}
		
		

	}

}
