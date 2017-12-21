package eu.mdpop.projects;

import java.util.Map;
import java.util.TreeMap;

import eu.mdpop.engine.*;

/**
 * @author VR
 * @version 1.0
 * @since 19.12.2017
 *
 *        Class Main
 * 
 */

public class Main extends Engine {

	public static void main(String[] args) {
		
		Project project1 = addProjectFromConsole();
		addProject(project1);
		addProject(addProjectFromConsole());
		produceProject(project1);
		printAllProjects();

		
	}

}
