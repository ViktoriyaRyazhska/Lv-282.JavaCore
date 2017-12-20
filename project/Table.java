import java.io.File;
import java.io.FileInputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.util.List;



public class Table extends AbsCrossTable {

	public static final String FREE_FIELD = "#";
	
	public Table(int width, int height) {
		super(width, height);
		firstFillTable();
	}

	@Override
	public int getWidth() {
		return super.getWidth();
	}

	@Override
	public int getHeight() {
		return super.getHeight();
	}

	@Override
	public List<String> getTable() {
		return super.getTable();
	}

	private void firstFillTable() {
		for (int i = 0; i < getHeight(); i++) {
			for (int j = 0; j < getWidth(); j++) {
				getTable().add(FREE_FIELD);
			}
		} 
	}

	@Override
	public void showTable() {
		
		String space; 
		System.out.print("    ");
		for (int i = 0; i < getWidth(); i++) {
			System.out.print(i + " ");
		}
		System.out.println();
		
		for (int i = 0; i < getHeight(); i++) {
			for (int j = 0; j < getWidth(); j++) {
				if (j == 0) {
					System.out.printf("%2d |", i);
				}
				space = (j < 10) ? (" ") : ("  ");
				System.out.print(getTable().get( i*getWidth() + j ) + space);
			}
			System.out.println();
		} 
		System.out.println();
	}
	
//	@Override
//	public void showTable() {
//		for (int i = 0; i < getHeight(); i++) {
//			for (int j = 0; j < getWidth(); j++) {
//				System.out.print(getTable().get( i*getWidth() + j ) + " ");
//			}
//			System.out.println();
//		} 
//	}
	
	private boolean BelongToMeasure(int x, int y, int xWidth, int yWidth) {
		if ((x >= 0) && (x <= yWidth) && (y >= 0) && (y <= xWidth)) {
			return true;
		}
		return false;
	} 
	
	private int takeIndex(int xPosition, int yPosition) {
		return xPosition*getWidth() + yPosition;
	}
	
	private boolean IsCorrectDirection(String direction) {
		if (((direction.toLowerCase().equals("h")) || (direction.toLowerCase().equals("v")))) {
			return true;
		}
		System.out.println("You input wrong direction");
		return false;
	} 
	
	private boolean canAddField(int xPosition, int yPosition, String direction, int lengthOfField) {
		
		if (!IsCorrectDirection(direction)){
			return false;
		}
		
		if ( !BelongToMeasure(xPosition, yPosition, getWidth(), getHeight())) {
			System.out.println("You coordinate is out of limit");
			return false;
		}
		
		if ( lengthOfField < 2 ) {
			System.out.println("You input incorrect length of word");
			return false;
		}
		
		if ( (direction.toLowerCase().equals("h")) && ( (yPosition + lengthOfField) > getWidth()) ) {
			System.out.println("The length of word are to big");
			return false;
		}
		
		if ( (direction.toLowerCase().equals("v")) && ( (xPosition + lengthOfField) > getHeight()) ) {	
			System.out.println("The length of word are to big");
			return false;
		}
		
		return true;
	}

	@Override
	public void addField(int xPosition, int yPosition, String direction, int lengthOfField) {
		
		if (canAddField(xPosition, yPosition, direction, lengthOfField)) {

			int StartIndex = xPosition*getWidth() + yPosition;
			
			if (direction.toLowerCase().equals("h")) {
				for (int i = 0; i < lengthOfField; i++) {
					if (getTable().get(StartIndex + i).equals(FREE_FIELD)){
						getTable().set(StartIndex + i, "*");
					}
				}
			}
			
			if (direction.toLowerCase().equals("v")) {
				for (int i = 0; i < lengthOfField; i++) {
					if (getTable().get(StartIndex + i*getWidth()).equals(FREE_FIELD)){
						getTable().set(StartIndex + i*getWidth(), "*");
					}
				}
			}

			showTable();
		}
	}
	
	private boolean beginOfWord(int xPosition, int yPosition, String direction){
		
		if ( !BelongToMeasure(xPosition, yPosition, getWidth(), getHeight())) {
			System.out.println("You coordinate is out of limit");
			return false;
		}

		if (!IsCorrectDirection(direction)) {
			return false;
		}
		
		if ( getTable().get(xPosition*getWidth() + yPosition).equals(FREE_FIELD)) {
			System.out.println("You chouse wrong position of start the word");
			return false;
		}
		
		if ( (direction.toLowerCase().equals("h"))){
			if ( (yPosition >= getWidth() - 1)) {
				return false;
			}
		
			if ( (yPosition == 0) && (getTable().get(takeIndex(xPosition, yPosition + 1)).equals(FREE_FIELD))){
				return false;
			}
			
			if ( (yPosition > 0) && (getTable().get(takeIndex(xPosition, yPosition + 1)).equals(FREE_FIELD))){
				return false;
			}
				
			if ( (yPosition > 0) && !(getTable().get(takeIndex(xPosition, yPosition - 1)).equals(FREE_FIELD))){
				System.out.println("middle");
				return false;
			}
			
		} 
		
		if ( (direction.toLowerCase().equals("v"))){
			
			if ( (xPosition >= getHeight() - 1)) {
				return false;
			}
			
			if ( (xPosition == 0) && (getTable().get(takeIndex(xPosition + 1, yPosition)).equals(FREE_FIELD))){
				return false;
			}
			
			if ( (xPosition > 0) && (getTable().get(takeIndex(xPosition + 1, yPosition)).equals(FREE_FIELD))){
				return false;
			}
			
			if ( (xPosition > 0) && !(getTable().get(takeIndex(xPosition - 1, yPosition)).equals(FREE_FIELD))){
				return false;
			}
		} 
		
		return true;
	}
	
	private int showLengthOfWord(int xPosition, int yPosition, String direction) {
		
		if (!beginOfWord(xPosition, yPosition, direction)) {
			return -1;
		}
		
		int count = 0;
		int yCurrent = yPosition; 
		int xCurrent = xPosition;
		int curentIndex = takeIndex(xCurrent, yCurrent);
		
		while (!getTable().get(curentIndex).equals(FREE_FIELD)) {
			
			if (direction.toLowerCase().equals("h")) {
				yCurrent++;
			} else {
				xCurrent++;
			}
			
			if ((xCurrent > getHeight() - 1 ) || (yCurrent > getWidth() - 1) ){
				return count + 1;
			}
			curentIndex = takeIndex(xCurrent, yCurrent);
			count++;
		}
		return count;
	}
	
	public String showLetters(int xPosition, int yPosition, String direction){
		
		if(!beginOfWord(xPosition, yPosition, direction)) {
			System.out.println("You intup wrong coordinate");
			return null;
		}
		
		int lenghtOfWord = showLengthOfWord(xPosition, yPosition, direction);
		StringBuilder word = new StringBuilder("");
		int index;
		int xCurrent = xPosition;
		int yCurrent = yPosition;
		
		for (int i = 0; i < lenghtOfWord; i++) {
			index = takeIndex(xCurrent, yCurrent);
			word.append(getTable().get(index));
			if (direction.toLowerCase().equals("h")) {
				yCurrent++;
			} else {
				xCurrent++;
			}
		}
		
		return word.toString();
	}
	
	private void putLetter(int xPosition, int yPosition, String letter) {
		int index = takeIndex(xPosition, yPosition);
		getTable().set(index, letter);
	}
	
	public void errise(int xPosition, int yPosition) {
		if (!BelongToMeasure(xPosition, yPosition, getWidth(), getHeight())) {
			System.out.println("Field you want o erise don't belong to this crosstable");
			return;
		}
		
		putLetter(xPosition, yPosition, FREE_FIELD);
		showTable();
	}
	
	@Override
	public void putWord(int xPosition, int yPosition, String direction, String wordToPut){
		
		if(!beginOfWord(xPosition, yPosition, direction)) {
			System.out.println("You input wrong values");
			return;
		}
		
		String wordFromField = showLetters(xPosition, yPosition, direction);
		
		if (wordToPut.length() != wordFromField.length()) {
			System.out.println("The length of word not equal to the length of crossword field's");
			return;
		}
		
		for (int i = 0; i < wordFromField.length(); i++) {
			if (!((wordFromField.charAt(i) == '*') || (wordToPut.toLowerCase().charAt(i) == wordFromField.toLowerCase().charAt(i)))) {
				System.out.println("You chouse wrong place to word");
				return;		
			}
		}
		
		int xCurrent = xPosition;
		int yCurrent = yPosition;
		for (int i = 0; i < showLengthOfWord(xPosition, yPosition, direction); i++) {
			putLetter(xCurrent, yCurrent, wordToPut.substring(i, i+1).toLowerCase());
			if (direction.toLowerCase().equals("h")) {
				yCurrent++;
			} else {
				xCurrent++;	
			}
		}
		
		showTable();
	}
	
	
	public void saveTable(String fileName) throws IOException {
		
		File file = new File(fileName.concat(".cw"));
		FileWriter fw = new FileWriter(file);
		
		fw.write(getWidth());
		fw.write(getHeight());
		for (String st: getTable()) {
			fw.write(st);
		}
		
		System.out.println("File saved");
		
		fw.close();
		
	}
	
	public static Table loadTable(String fileName) throws IOException {

		File file = new File(fileName.concat(".cw"));
		FileInputStream fi = new FileInputStream(file);
			
		int x = fi.read();
		int y = fi.read();
		int index = 0;
		
		Table table = new Table(x, y);
		
		for (int i = 0; i < x; i++) {
			for (int j = 0; j < y; j++) {
				table.getTable().set(index++, Character.toString ((char) fi.read()));
			}
		}  
		
		fi.close();
		return table; 
	}
	
	
}


