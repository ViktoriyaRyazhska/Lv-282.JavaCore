package the_country;

public class country {
	
	private String  name;
	
	

	public country() {
		
	}

	public country(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "country [name=" + name + "]";
	}
	
	

}
