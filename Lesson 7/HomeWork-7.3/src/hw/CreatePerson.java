package hw;

import java.util.Random;

public interface CreatePerson {

	static final int sizeOfArray = 250;

	public final String[] NAMES = {"Jacob", "Michael", "Joshua", "Matthew", "Ethan", "Andrew", "Daniel", "Anthony",
			"Christopher", "Joseph", "William", "Alexander", "Ryan", "David", "Nicholas", "Tyler", "James", "John",
			"Jonathan", "Nathan", "Samuel", "Christian", "Noah", "Dylan", "Benjamin", "Logan", "Brandon", "Gabriel",
			"Zachary", "Jose", "Elijah", "Angel", "Kevin", "Jack", "Caleb", "Justin", "Austin", "Evan", "Robert",
			"Thomas", "Luke", "Mason", "Aidan", "Jackson", "Isaiah", "Jordan", "Gavin", "Connor", "Aiden", "Isaac",
			"Jason", "Cameron", "Hunter", "Jayden", "Juan", "Charles", "Aaron", "Lucas", "Luis", "Owen", "Landon",
			"Diego", "Brian", "Adam", "Adrian", "Kyle", "Eric", "Ian", "Nathaniel", "Carlos", "Alex", "Bryan", "Jesus",
			"Julian", "Sean", "Carter", "Hayden", "Jeremiah", "Cole", "Brayden", "Wyatt", "Chase", "Steven", "Timothy",
			"Dominic", "Sebastian", "Xavier", "Jaden", "Jesse", "Devin", "Seth", "Antonio", "Richard", "Miguel",
			"Colin", "Cody", "Alejandro", "Caden", "Blake", "Carson", "Kaden", "Jake", "Henry", "Liam", "Victor",
			"Riley", "Ashton", "Patrick", "Bryce", "Brady", "Vincent", "Trevor", "Tristan", "Mark", "Jeremy", "Oscar",
			"Marcus", "Jorge", "Parker", "Kaleb", "Cooper", "Kenneth", "Garrett", "Joel", "Ivan", "Josiah", "Alan",
			"Conner", "Eduardo", "Paul", "Tanner", "Braden", "Alexis", "Edward", "Omar", "Nicolas", "Jared", "Peyton",
			"George", "Maxwell", "Cristian", "Francisco", "Collin", "Nolan", "Preston", "Stephen", "Ayden", "Gage",
			"Levi", "Dakota", "Micah", "Eli", "Manuel", "Grant", "Colton", "Damian", "Ricardo", "Giovanni", "Andres",
			"Emmanuel", "Peter", "Malachi", "Cesar", "Javier", "Max", "Hector", "Edgar", "Shane", "Fernando", "Ty",
			"Jeffrey", "Bradley", "Derek", "Travis", "Brendan", "Shawn", "Edwin", "Spencer", "Mario", "Dalton", "Erick",
			"Johnathan", "Erik", "Jonah", "Donovan", "Leonardo", "Wesley", "Elias", "Marco", "Trenton", "Devon",
			"Brody", "Abraham", "Jaylen", "Bryson", "Josue", "Sergio", "Drew", "Damien", "Raymond", "Andy", "Dillon",
			"Gregory", "Roberto", "Roman", "Martin", "Andre", "Jace", "Oliver", "Miles", "Harrison", "Jalen", "Corey",
			"Dominick", "Avery", "Clayton", "Pedro", "Israel", "Calvin", "Colby", "Dawson", "Cayden", "Jaiden",
			"Taylor", "Landen", "Troy", "Julio", "Trey", "Jaxon", "Rafael", "Dustin", "Ruben", "Camden", "Frank",
			"Scott", "Mitchell", "Zane", "Payton", "Kai", "Keegan", "Skyler", "Brett", "Johnny", "Griffin", "Marcos",
			"Derrick", "Drake", "Raul", "Kaiden", "Gerardo"};

	public default String chooseRandomName(Random random) {
		return NAMES[random.nextInt(sizeOfArray)];
	}

	public default int chooseRandomInt(Random random, int min, int max) {
		return random.nextInt(max + 1 - min) + min;
	}

}
