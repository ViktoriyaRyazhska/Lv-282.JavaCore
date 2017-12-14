package snake.main;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.image.BufferedImage;
import java.io.IOException;
import javax.imageio.ImageIO;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.Timer;

public class Paint extends JPanel implements ActionListener {
	private static final long serialVersionUID = 1L;
	
	private Snake snake = new Snake();
	private Food food = new Food();
	private Timer timer;
	private BufferedImage background;
	
	private BufferedImage head0Image;
	private BufferedImage head1Image;
	private BufferedImage head2Image;
	private BufferedImage head3Image;
	
	private BufferedImage bodyImage;
	
	private BufferedImage tale0Image;
	private BufferedImage tale1Image;
	private BufferedImage tale2Image; 
	private BufferedImage tale3Image;
	
	private BufferedImage foodImage;

	public Paint() {
		try {
			imageInitialization();
			
		} catch(IOException | IllegalArgumentException e) {
			JOptionPane.showMessageDialog(null, "Can't find textures!");
		}
		
		this.timer = new Timer(1000/SnakeMain.VELOCITY,this);
		timer.start();
		addKeyListener(new ControlOfSnake());
		setFocusable(true);
	}
	
	private void imageInitialization() throws IOException {
		background = ImageIO.read(getClass().getResourceAsStream("/background.jpg"));
		
		head0Image = ImageIO.read(getClass().getResourceAsStream("/SnakeHead0.png"));
		head1Image = ImageIO.read(getClass().getResourceAsStream("/SnakeHead1.png"));
		head2Image = ImageIO.read(getClass().getResourceAsStream("/SnakeHead4.png"));
		head3Image = ImageIO.read(getClass().getResourceAsStream("/SnakeHead3.png"));
		
		bodyImage = ImageIO.read(getClass().getResourceAsStream("/SnakeBody.png"));
		
		tale0Image = ImageIO.read(getClass().getResourceAsStream("/tale0.png"));
		tale1Image = ImageIO.read(getClass().getResourceAsStream("/tale1.png"));
		tale2Image = ImageIO.read(getClass().getResourceAsStream("/tale4.png"));
		tale3Image = ImageIO.read(getClass().getResourceAsStream("/tale3.png"));
		
		foodImage = ImageIO.read(getClass().getResourceAsStream("/applelittle.png"));
	}

	private void drawBackground(Graphics g) {
		g.drawImage(background, 0, 0, SnakeMain.WIDTH*SnakeMain.SCALE, SnakeMain.HEIGHT*SnakeMain.SCALE, null);

		if (SnakeMain.GREED) {
			g.setColor(Color.DARK_GRAY);
			for (int x = 0; x <= SnakeMain.WIDTH*SnakeMain.SCALE; x += SnakeMain.SCALE) {
				g.drawLine(x, 0, x, SnakeMain.HEIGHT*SnakeMain.SCALE);
			}
			for (int y = 0; y <= SnakeMain.HEIGHT*SnakeMain.SCALE; y += SnakeMain.SCALE) {
				g.drawLine(0, y, SnakeMain.WIDTH*SnakeMain.SCALE, y);
			}
		}
	}
	private void drawSnakeHead(Graphics g) {
		if(Snake.direction == 0)
			g.drawImage(head0Image, snake.getSnX().get(0), snake.getSnY().get(0), SnakeMain.SCALE, SnakeMain.SCALE, null);
		if(Snake.direction == 1)
			g.drawImage(head1Image, snake.getSnX().get(0), snake.getSnY().get(0), SnakeMain.SCALE, SnakeMain.SCALE, null);
		if(Snake.direction == 2)
			g.drawImage(head2Image, snake.getSnX().get(0), snake.getSnY().get(0), SnakeMain.SCALE, SnakeMain.SCALE, null);
		if(Snake.direction == 3)
			g.drawImage(head3Image, snake.getSnX().get(0), snake.getSnY().get(0), SnakeMain.SCALE, SnakeMain.SCALE, null);
	}
	private void drawSnakeBody(Graphics g) {
		for(int i = 1; i < snake.getSnX().size() - 1; i++) {
			g.drawImage(bodyImage, snake.getSnX().get(i), snake.getSnY().get(i), SnakeMain.SCALE, SnakeMain.SCALE, null);
		}
	}
	private void drawSnakeTail(Graphics g) {
		int tailIndex = snake.getSnX().size()-1;
		if(snake.taleDirection() == 0)
			g.drawImage(tale0Image,snake.getSnX().get(tailIndex), snake.getSnY().get(tailIndex), SnakeMain.SCALE, SnakeMain.SCALE, null);
		if(snake.taleDirection() == 1)
			g.drawImage(tale1Image,snake.getSnX().get(tailIndex), snake.getSnY().get(tailIndex), SnakeMain.SCALE, SnakeMain.SCALE, null);
		if(snake.taleDirection() == 2)
			g.drawImage(tale2Image,snake.getSnX().get(tailIndex), snake.getSnY().get(tailIndex), SnakeMain.SCALE, SnakeMain.SCALE, null);
		if(snake.taleDirection() == 3)
			g.drawImage(tale3Image,snake.getSnX().get(tailIndex), snake.getSnY().get(tailIndex), SnakeMain.SCALE, SnakeMain.SCALE, null);
	}
	private void drawSnakeFood(Graphics g) {
		g.drawImage(foodImage, food.getX(), food.getY(), SnakeMain.SCALE, SnakeMain.SCALE, null);
	}
	@Override
	public void paint(Graphics g) {
		drawBackground(g);
		drawSnakeFood(g);
		drawSnakeBody(g);
		drawSnakeTail(g);
		drawSnakeHead(g);
	}
	
	private void snakeIsCrashed() {
		JOptionPane.showMessageDialog(null, "You are crashed!" + snake.score() + "\nWould you like to restart?");
		timer.stop();
		snake = new Snake();
		food.newRandomCoords();
		timer.start();	
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		snake.move();
		snake.eatFood(food);
		repaint();
		if(snake.crash()) { 
			snakeIsCrashed();
		}
	}
}
