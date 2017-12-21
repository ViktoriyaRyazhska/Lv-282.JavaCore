package eu.mdpop.production;

/**
 *        Class CNC represents all information about CNC cutting of all workpieces for Subproject
 * @author VR
 * @version 1.0
 * @since 19.12.2017
 *
 * 
 */
public class CNC {
	
	private double cuttingTime;
	private int koefDifficulty = 1; /** Coefficient of Subproject's difficulty. Acceptable value = 1 or 2 or 3 or 4 or 5. Otherwise = 1.  */
	private int extraTimePercent;
	
	public CNC() {}
	
	public CNC(double cuttingTime, int koefDifficulty) {
		this.cuttingTime = cuttingTime;
		this.koefDifficulty = koefDifficulty;
	}
	

	public double getCuttingTime() {
		return cuttingTime;
	}

	public void setCuttingTime(double cuttingTime) {
		this.cuttingTime = cuttingTime;
	}

	public int getKoefDifficulty() {
		return koefDifficulty;
	}

	public void setKoefDifficulty(int koefDifficulty) {
		if (koefDifficulty>0&koefDifficulty<=5) {
			this.koefDifficulty = koefDifficulty;			
		} else {
			System.out.println("Not correct input!");
			System.out.println("Difficulty of project was set as dafault");
			this.koefDifficulty = 1;
		}
	}

	
	private int calculateExtraTimePercent() {
		switch (koefDifficulty) {
		case 1: extraTimePercent = 10;
		case 2: extraTimePercent = 15;
		case 3: extraTimePercent = 20;
		case 4: extraTimePercent = 25;
		case 5: extraTimePercent = 30;
		default: extraTimePercent = 10;
		}
		return extraTimePercent;
	}
	
	/**
	 * Calculates quantity of hours for CNC cutting for Subproject.
	 * 
	 * @param quantity - quantity of Subproject according to Order.
	 * @return quantity of hours for CNC cutting without any extra.
	 */
	private double calculateTotalCuttingTime(int quantity) {
		return (cuttingTime*quantity)/60;
	}
	
	/**
	 * Calculation of CNC time with extra, according to difficulty of Subproject.
	 * @param quantity - quantity of Subproject according to Order.
	 * @return quantity of hours for CNC cutting with extra time.
	 */
	public double calculateCNCTime(int quantity) {
		double cncTime = calculateTotalCuttingTime(quantity)*calculateExtraTimePercent();
		System.out.println("CNC time = " + cncTime + " hours");
		return cncTime;
	}
}
