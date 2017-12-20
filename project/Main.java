import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static Table table;
	static String name = null;
	static Words word = new Words();
	
	public static void main(String[] args){
		
		System.out.println("Hello:)))\n");
		System.out.println("You can create new table or load existed");
		startMenu();
		
		
		boolean isEnd = false;
		
		while(!isEnd) {		
			
			String key = null;
			try {
				key = br.readLine();
			} catch (IOException e) {
				System.out.println("You input wrong value. Try again");
				startMenu();
			} 

			switch (key) {
			case "1":
				int width = 0;
				int height = 0;
				
				try {
					System.out.println("Input name of new crossword table");
					name = br.readLine();
					System.out.println("Input width of table");
					width = Integer.parseInt(br.readLine());
					System.out.println("Input height of table");
					height = Integer.parseInt(br.readLine());
				} catch (IOException e) {
					System.out.println("You input wrong name");
					startMenu();
					break;
				} catch (NumberFormatException e) {
					System.out.println("You input wrong value. Try again");
					startMenu();
					break;
				} 
				
				table = new Table(width, height);
				System.out.println("Table was successfully created");
				table.showTable();
				isEnd = true;
				break;
			
			case "2":
				System.out.println("Input name of the exsisting file:");
				try {
					name = br.readLine();
					table = Table.loadTable(name);
				} catch (IOException e) {
					System.out.println("You write wrong file name. Try again\n");
					startMenu();
					break;
				}
				table.showTable();
				isEnd = true;
				break;
			case "3":
				System.exit(1);
				break;			
			default:
				System.out.println("Make our choise!!!");
				break;
			}
		}

		isEnd = false;
		
		while (!isEnd) {
			showMenu();
			String key = null;
			try {
				key = br.readLine();
			} catch (IOException e) {
				System.out.println("You input wrong value. Try again");
			} 
			
			switch (key) {
			case "0":
				showMenu();
				break;
			case "1":
				table.showTable();
				break;
			case "2":
				addField();
				break;
			case "3":
				eraseField();
				break;	
			case "4":
				showPosibleWords();
				break;	
			case "5":
				putNewWord();
				break;	
			case "6":
				save();
				break;	
			case "7":
				isEnd = end();
				break;
			default:
				System.out.println("Make our choise!!!");
				break;
			}
			
			
		}
		
		System.out.println("End......");
	}


	private static void addField() {
		
		int xPosition = 0;
		int yPosition = 0;
		String direction = null;
		int lengthOfField = 0;
		
		try {
			System.out.println("Write row number: ");
			xPosition = Integer.parseInt(br.readLine());
			System.out.println("Write collumn number: ");
			yPosition = Integer.parseInt(br.readLine());
			System.out.println("Write direction (h or v): ");
			direction = br.readLine();
			System.out.println("Write length of field: ");
			lengthOfField = Integer.parseInt(br.readLine());
			table.addField(xPosition, yPosition, direction, lengthOfField);
		} catch (NumberFormatException e) {
			System.out.println("You write wrong value. Try again.");
		} catch (IOException e) {
			System.out.println("You write wrong value. Try again.");
		} catch (NullPointerException e) {
			System.out.println("You forgot enter value. Try again.");
		}
		
	}

	private static void eraseField() {
		
		int xPosition = 0;
		int yPosition = 0;
				
		try {
			System.out.println("Enter number of row ou want to erise: ");
			xPosition = Integer.parseInt(br.readLine());
			System.out.println("Enter number of row ou want to erise: ");
			yPosition = Integer.parseInt(br.readLine());
			table.errise(xPosition, yPosition);			
		} catch (NumberFormatException e) {
			System.out.println("You write wrong value. Try again.");
		} catch (IOException e) {
			System.out.println("You write wrong value. Try again.");
		} catch (NullPointerException e) {
			System.out.println("You forgot enter value. Try again.");
		}
				
	}
	
	private static void putNewWord() {
		
		int xPosition = 0;
		int yPosition = 0;
		String direction = null;
		String wordToPut = null;
		
		try {
			System.out.println("Write row number: ");
			xPosition = Integer.parseInt(br.readLine());
			System.out.println("Write collumn number: ");
			yPosition = Integer.parseInt(br.readLine());
			System.out.println("Write direction (h or v): ");
			direction = br.readLine();
			System.out.println("Write word you want to put: ");
			wordToPut = br.readLine();
			table.putWord(xPosition, yPosition, direction, wordToPut);
		} catch (NumberFormatException e) {
			System.out.println("You write wrong value. Try again.");
		} catch (IOException e) {
			System.out.println("You write wrong value. Try again.");
		} catch (NullPointerException e) {
			System.out.println("You forgot enter value. Try again.");
		}
		
	}

	private static void save() {
		
		try {
			table.saveTable(name);
		} catch (IOException e) {
			System.out.println("Can't save file");
		}
		
	}

	private static void showPosibleWords() {
		
		int xPosition = 0;
		int yPosition = 0;
		String direction = null;
		String maskWord = null;
		
		try {
			System.out.println("Write row number: ");
			xPosition = Integer.parseInt(br.readLine());
			System.out.println("Write collumn number: ");
			yPosition = Integer.parseInt(br.readLine());
			System.out.println("Write direction (h or v): ");
			direction = br.readLine();
			System.out.println("Write word you want to put: ");
			maskWord = table.showLetters(xPosition, yPosition, direction);
		} catch (NumberFormatException e) {
			System.out.println("You write wrong value. Try again.");
		} catch (IOException e) {
			System.out.println("You write wrong value. Try again.");
		} catch (NullPointerException e) {
			System.out.println("You forgot enter value. Try again.");
		}
		
		if (maskWord == null) {
			System.out.println("No word acording to you mask");
			return;
		} else {
			word.showByMask(maskWord);
		}
		
	}
	
	private static boolean end() {
		
		String choise = null;
		do {
			System.out.println("Do you want to save? (y/n)");
			try {
				choise = br.readLine();
			} catch (IOException e) {
				System.out.println("You wrote wrong choise. Try again");
			}
		} while (!((choise.toLowerCase().equals("y")) || (choise.toLowerCase().equals("n"))));
		if(choise.toLowerCase().equals("y")){
			save();
		}
		
		return true;
	}
	
	public static void showMenu() {
		
		System.out.println("0 - show Menu");
		System.out.println("1 - show crosstable");
		System.out.println("2 - add field");
		System.out.println("3 - erase field");
		System.out.println("4 - show all possible words");
		System.out.println("5 - add new word");
		System.out.println("6 - save");
		System.out.println("7 - exit");
		
	}
	
	public static void startMenu() {
		
		System.out.println("To create new press - \"1\" ");
		System.out.println("To load existed crossword table press - \"2\" ");
		System.out.println("To exit press - \"3\" ");
		
	}
	
}
