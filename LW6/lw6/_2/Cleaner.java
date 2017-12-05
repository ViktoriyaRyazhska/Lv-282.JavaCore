package lw6._2;

import sun.awt.dnd.SunDragSourceContextPeer;

public class Cleaner extends Staff{
	TYPE_PERSON type_person;

	
	
	
	

	public Cleaner(String name) {
		super();
		this.type_person = type_person;
		setName(name);
	}

	@Override
	public void salary() {
		System.out.println(getName()+"have salary 10000");
		
	}

	@Override
	public void print() {
		System.out.println("Name "+getName());
		System.out.println("I am a "+type_person.CLEANER );
		
	}

}
