package snake.main;

import java.util.Random;

public class Food {
	private int x = SnakeMain.SCALE*2;
	private int y = SnakeMain.SCALE*2;
	
	private Random rand = new Random();
	
	public int getX() {
		return this.x;
	}
	public int getY() {
		return this.y;
	}
	
	public void newRandomCoords() {
		this.x = rand.nextInt(SnakeMain.WIDTH)*SnakeMain.SCALE;
		this.y = rand.nextInt(SnakeMain.HEIGHT)*SnakeMain.SCALE;
	}
}
