package com.edu;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
  public static void main(String[] args) throws IOException {
int timeUK = 35;
int costUK= 30 * timeUK ;
System.out.println("Hello. You speak whith UK,one minute cost 30 uah!You speak" + " "  + timeUK + " "  + "minute"  + " " + "and it cost" + " "  + costUK + " " + "uah" ); 
int timeChaina = 40;
int costChaina= 30 * timeChaina ;
System.out.println("Hello. You speak whith UK,one minute cost 30 uah!You speak" + " "  + timeChaina + " "  + "minute"  + " " + "and it cost" + " "  + costChaina + " " + "uah" );  
int timeLondon = 45;
int costLondon= 30 * timeLondon ;
System.out.println("Hello. You speak whith UK,one minute cost 30 uah!You speak" + " "  + timeLondon + " "  + "minute"  + " " + "and it cost" + " "  + costLondon + " " + "uah" );
int allTime =timeUK + timeChaina + timeLondon;
int allCost=costLondon + costChaina + costUK;
System.out.println("So. You speak whith three country,one minute cost 30 uah!You speak whith"  +  "UK, Chaina, London" +  " all time of speaking are" + " " + allTime + "! "  + "All this phone calls cost " + allCost + "uah" );
  }
}