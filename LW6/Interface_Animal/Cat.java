package Interface_Animal;

public class Cat implements Animal{
	
	private static String name;
	private String voice;
	private String feed;
	
	
	

	public Cat(String name, String voice, String feed) {
		super();
		this.name = name;
		this.voice = voice;
		this.feed = feed;
	}
	
	

	public String getName() {
		return name;
	}



	public void setName(String name) {
		this.name = name;
	}



	public String getVoice() {
		return voice;
	}



	public void setVoice(String voice) {
		this.voice = voice;
	}



	public String getFeed() {
		return feed;
	}



	public void setFeed(String feed) {

		this.feed = feed;
	}

	


	@Override
	public String toString() {
		return "Cat [name=" + name + ", voice=" + voice + ", feed=" + feed + "]";
	}



	@Override
	public String voice() {
		
		return voice;
	}

	@Override
	public String feed() {
		
		return feed;
	}

}
