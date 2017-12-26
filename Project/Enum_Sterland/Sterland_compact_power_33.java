package Enum_Sterland;

public enum Sterland_compact_power_33 {
	H500_D600(1888), H500_D700(2203), H500_D800(2517), H500_D900(2832), H500_D1000(3147), H500_D1100(3461), H500_D1200(
			3776), H500_D1400(4405);

	private int id;

	Sterland_compact_power_33(int id1) {
		this.id = id1;
	}

	public int getId() {
		return id;
	}

	public static String getClassName() {
		return Sterland_compact_power_33.class.getName();
	}
}
