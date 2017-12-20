import java.util.ArrayList;
import java.util.List;

public abstract class AbsCrossTable {

	final private int width;
	final private int height;
	private List<String> table;
	
	public AbsCrossTable(int width, int height) {
		this.width = width;
		this.height = height;
		this.table = new ArrayList<String>();
	}

	public int getWidth() {
		return width;
	}

	public int getHeight() {
		return height;
	}

	public List<String> getTable() {
		return table;
	}

	public void setTable(List<String> table) {
		this.table = table;
	}

	public abstract void showTable();
	
	public abstract void addField(int xPosition, int yPosition, String direction, int lengthOfField); 
	
	public abstract void putWord(int xPosition, int yPosition, String direction, String wordToPut);
	
	
	
}
