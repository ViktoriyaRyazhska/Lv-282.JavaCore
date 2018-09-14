import java.util.Scanner;


public class IntroductionHome1 {

	public static void main(String[] args) {
		System.out.println("Input radius");
        Scanner s  = new Scanner (System.in);
        int r = s.nextInt();
		double Perumetr = 2*Math.PI* r;
		double Ploscha = Math.PI*r*r;
        s.close();
        System.out.println("Perumetr of circle is  " + Perumetr);
        System.out.println("Ploscha of circle is  " + Ploscha);
	}

}
