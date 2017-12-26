package Enum_Sterland;

public enum Sterland_compact_power_11 {
	H500_D500(549), H500_D600(659), H500_D700(768), H500_D800(878), H500_D900(988), H500_D1000(1098), H500_D1100(
			1208), H500_D1200(1317), H500_D1400(1537);

	private int id;

	Sterland_compact_power_11(int id1) {
		this.id = id1;
	}

	public int getId() {
		return id;
	}

	public static String getClassName() {
		return Sterland_compact_power_11.class.getName();
	}

}
