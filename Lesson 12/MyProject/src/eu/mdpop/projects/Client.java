package eu.mdpop.projects;

/**
 * Class Client - client, which gave Order for Project
 * 
 * @author VR
 * @version 1.0
 * @since 19.12.2017
 *
 * 
 */

public class Client {
	
	private String nameOfClient;

	public Client(String nameOfClient) {
		this.nameOfClient = nameOfClient;
	}

	public String getNameOfClient() {
		return nameOfClient;
	}

	public void setNameOfClient(String nameOfClient) {
		this.nameOfClient = nameOfClient;
	}

	@Override
	public String toString() {
		return "Client [nameOfClient=" + nameOfClient + "]";
	}
	
}
