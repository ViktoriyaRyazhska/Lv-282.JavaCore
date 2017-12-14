package snake.main;

import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

public class ControlOfSnake extends KeyAdapter {
	private int key;
	
	@Override
	public void keyPressed (KeyEvent event) {
		this.key = event.getKeyCode();
		switch (key) {
		case KeyEvent.VK_W: if(Snake.direction != 2) Snake.direction = 0;break;
		case KeyEvent.VK_D: if(Snake.direction != 3) Snake.direction = 1;break;
		case KeyEvent.VK_S: if(Snake.direction != 0) Snake.direction = 2;break;
		case KeyEvent.VK_A: if(Snake.direction != 1) Snake.direction = 3;break;
		}
	}
}
