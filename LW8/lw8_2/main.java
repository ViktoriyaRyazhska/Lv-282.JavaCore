package lw8_2;

public class main {

	public static void main(String[] args) {
		
		
		String st1="Пупкін Вася Петрович";
		System.out.println(st1);
		String[]st2=st1.split(" ");
		
		
		System.out.println(st2[0]+" "+st2[1].charAt(0)+". "+st2[2].charAt(0)+".");
		System.out.println(st2[1]+" "+st2[0]+" "+st2[2]);

	}
	
	

}
