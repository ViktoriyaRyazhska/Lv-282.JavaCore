package eu.mdpop.projects;

import java.util.Calendar;

public interface Order {
	
	Calendar orderDate = Calendar.getInstance();
	Calendar loadingDate= null;
	
	public Calendar calculateLoadingDate();

}
