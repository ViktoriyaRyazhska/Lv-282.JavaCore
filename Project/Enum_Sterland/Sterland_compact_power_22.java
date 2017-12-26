package Enum_Sterland;

public enum Sterland_compact_power_22 {
	H500_D500(1077), H500_D600(1292), H500_D700(1507), H500_D800(1723), H500_D900(1938), H500_D1000(2153), H500_D1100(
			2369), H500_D1200(2584), H500_D1400(3015);

	private int id;

	Sterland_compact_power_22(int id1) {
		this.id = id1;
	}

	public int getId() {
		return id;
	}

	public static String getClassName() {
		return Sterland_compact_power_22.class.getName();
	}
}
