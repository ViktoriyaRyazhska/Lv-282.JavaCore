package eu.mdpop.production;

import java.util.List;

import eu.mdpop.engine.IOClass;
import eu.mdpop.projects.Subproject;

public interface Production {

	default public void produce(List<Subproject> list) {
		for (Subproject subproject : list) {
			cut(subproject);			
		}
	}
	
	default public void cut(Subproject subproject) {
		CNC cnc = new CNC();
		System.out.println("Input cutting time for \"" + subproject.getSubprojectName() + "\" (minutes per 1 pcs)");
		cnc.setCuttingTime(IOClass.readIntValue());
		System.out.println("Input difficulty koef (1-5) for \"" + subproject.getSubprojectName() + "\"");
		cnc.setKoefDifficulty(IOClass.readIntValue());
		cnc.calculateCNCTime(subproject.getQuantity());
	}
}
