package snake.main;

import javax.swing.JFrame;
import javax.swing.WindowConstants;

public class SnakeMain {
	
	public static final int VELOCITY = 10;
	public static final int SCALE = 60;
	public static final int WIDTH = 10;
	public static final int HEIGHT = 10;
	public static final boolean GREED = true;
	
	
	public static void main(String[] args) {
		JFrame jFrame;
		
		jFrame = new JFrame("Snake v1.0");
		jFrame.setSize(SnakeMain.WIDTH * SnakeMain.SCALE + 16, SnakeMain.HEIGHT * SnakeMain.SCALE + 39);
		jFrame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
		jFrame.setLocationRelativeTo(null);
		jFrame.add(new Paint());
		jFrame.setVisible(true);

	}

}
