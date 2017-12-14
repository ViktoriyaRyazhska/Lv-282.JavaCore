package snake.main;

import java.util.ArrayList;
import java.util.List;

public class Snake {
	public static int direction;

	private List<Integer> snX = new ArrayList<Integer>();
	private List<Integer> snY = new ArrayList<Integer>();
	
	
	public Snake() {
		this.snX.add(SnakeMain.WIDTH*SnakeMain.SCALE/2);
		this.snY.add(SnakeMain.HEIGHT*SnakeMain.SCALE/2);
		this.snX.add((SnakeMain.WIDTH*SnakeMain.SCALE/2) - SnakeMain.SCALE);
		this.snY.add(SnakeMain.HEIGHT*SnakeMain.SCALE/2);
		this.snX.add((SnakeMain.WIDTH*SnakeMain.SCALE/2) - SnakeMain.SCALE*2);
		this.snY.add(SnakeMain.HEIGHT*SnakeMain.SCALE/2);
		Snake.direction = 1;
	}
	
	
	
	public List<Integer> getSnX() {
		return snX;
	}
	public void setSnX(List<Integer> snX) {
		this.snX = snX;
	}
	public List<Integer> getSnY() {
		return snY;
	}
	public void setSnY(List<Integer> snY) {
		this.snY = snY;
	}
	
	private void moveBody() {
		for (int i = snY.size() - 1; i > 0; i--) {
			snY.set(i, snY.get(i-1));
			snX.set(i, snX.get(i-1));
		}
	}
	private void moveHead() {
		switch(direction){
		case 0: snY.set(0, snY.get(0) - SnakeMain.SCALE);break;
		case 1: snX.set(0, snX.get(0) + SnakeMain.SCALE);break;
		case 2: snY.set(0, snY.get(0) + SnakeMain.SCALE);break;
		case 3: snX.set(0, snX.get(0) - SnakeMain.SCALE);break;
		}
	}
	private void moveOutOfField() {
		if(snX.get(0) < 0) { snX.set(0,SnakeMain.WIDTH*SnakeMain.SCALE - SnakeMain.SCALE); }
		if(snX.get(0) > SnakeMain.WIDTH*SnakeMain.SCALE-SnakeMain.SCALE) { snX.set(0,0); }
		if(snY.get(0) < 0) { snY.set(0,SnakeMain.HEIGHT*SnakeMain.SCALE - SnakeMain.SCALE); }
		if(snY.get(0) > SnakeMain.HEIGHT*SnakeMain.SCALE-SnakeMain.SCALE) { snY.set(0,0); }	
	}

	public void move() {
			moveBody();
			moveHead();
		moveOutOfField();
	}
	
	public int taleDirection() {
		int taleIndex = snX.size() - 1;
		if(snX.get(taleIndex) - snX.get(taleIndex-1) > 0) {
			return 3;
		}
		else {
			if(snX.get(taleIndex) == snX.get(taleIndex-1) ) {
				if(snY.get(taleIndex) - snY.get(taleIndex-1) > 0) {
					return 0;
				}
				else {
					return 2;
				}
			}
			return 1;
		}
	}
	
	public void eatFood(Food food) {
		for (int i = 1; i < snX.size(); i++) {
			if( (snX.get(i) == food.getX()) && (snY.get(i) == food.getY()) ) {
				food.newRandomCoords();
				break;
			}	
		}
		if((snX.get(0) == food.getX()) && (snY.get(0) == food.getY())) {
			food.newRandomCoords();
			snX.add(snX.get(snX.size()-1));
			snY.add(snY.get(snY.size()-1));
		}
	}
	
	public boolean crash() {
		int headX = snX.get(0);
		int headY = snY.get(0);
		boolean crash = false;
		for (int i = 1; i < snX.size(); i++) {
			if( (headX == snX.get(i)) && (headY == snY.get(i)) ) {
				crash = true;
				break;
			}
		}
		return crash;
	}

	public String score() {
		return "\nYour score is "+ snX.size();
	}
}