import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.Color;
import java.awt.Container;
import java.awt.Graphics;

import java.util.Random;

import javax.swing.*;


@SuppressWarnings("serial")
public class MovingBall2 extends JFrame implements Runnable, MouseListener {
	private Thread thread;
	private int xBall = 0;
	private int yBall = 0;
	private Color ballColor = Color.BLUE;
	final static long MILLISECONDS_DELAY = 100;
	private static JFrame window = new JFrame("Moving Ball");
	//private int runCount = 0;
	private int threadCount = 0;
	

	// Constructor
	public MovingBall2(){
		window.addMouseListener(this);
	}
	public MovingBall2(int xB, int yB, Color bColor, int tC) {
		xBall = xB;
		yBall = yB;
		ballColor = bColor;
		threadCount = tC;
			}

	public void run() {
		System.out.println("The x start = " + threadCount);
		for (int n = 0; n < 100; n++) {
			Graphics g = window.getContentPane().getGraphics();
			g.setColor(Color.WHITE);
			g.fillOval(xBall, yBall, 20, 20);
			yBall = yBall + 5;
			if (yBall > 380) yBall = 0;
			g.setColor(ballColor);
			g.fillOval(xBall, yBall, 20, 20);
			//System.out.println("Thread " + Thread.currentThread().getName() + "Run count = " + runCount++);
			try {
				Random generator = new Random();
				int x = generator.nextInt(10);
				Thread.sleep(MILLISECONDS_DELAY * x);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}

	public void mouseClicked(MouseEvent arg0) {
		 Random generator = new Random();
		int x = generator.nextInt(400);
		int y = generator.nextInt(400);
		MovingBall2 mb = new MovingBall2(x, y, Color.GREEN, x);
		mb.thread = new Thread(mb);
		mb.thread.start();
		
	}
	public void mouseEntered(MouseEvent arg0) {
		System.out.println("Mouse event");
	}
	public void mouseExited(MouseEvent arg0) {
		System.out.println("Mouse event");
	}
	public void mousePressed(MouseEvent arg0) {
		
	}
	public void mouseReleased(MouseEvent arg0) {
		System.out.println("Mouse event");
	}

	public static void main(String[] args) {
			window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			window.setSize(400, 400);
			
			Container c = window.getContentPane();
			@SuppressWarnings("unused")
			MovingBall2 test = new MovingBall2();
			c.setBackground(Color.WHITE);
			window.setVisible(true);
		
			
			
			
		}
}

