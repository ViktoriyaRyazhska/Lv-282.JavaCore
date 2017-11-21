package task;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(
	new InputStreamReader(System.in));

System.out.println("Hello. What is your first name?");
String firstName = br.readLine();
System.out.println("What is your second name?" + " " +   firstName);
String secondName = br.readLine();
System.out.println("Name's street where you live?" + " " + firstName + " " + secondName);
String streetName = br.readLine();
System.out.println("Number of this street?" + " " + firstName  + " " + secondName  + " " + "who live in street" + " " + streetName);
int number = Integer.parseInt(br.readLine());
System.out.println("Hello " + firstName + " " + secondName + "," + "who live in " + streetName + " " + number + " " + ":)");
  }
}