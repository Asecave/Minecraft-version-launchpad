package main;

import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class Window extends JPanel implements KeyListener, MouseListener {

	private JFrame frame;
	
	public Window() {
		
		Image icon = null;
		try {
			icon = ImageIO.read(Window.class.getResourceAsStream("icon.png"));
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		frame = new JFrame();
		frame.setSize(1000, 600);
		frame.setLocationRelativeTo(null);
		frame.setUndecorated(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setIconImage(icon);
		frame.addKeyListener(this);
		frame.addMouseListener(this);
		frame.add(this);
		frame.setVisible(true);
	}
	
	@Override
	public void paint(Graphics g) {
		super.paint(g);
		Graphics2D g2d = (Graphics2D) g;
		g2d.setStroke(new BasicStroke(4));
		g2d.setColor(Color.BLACK);
		g2d.fillRect(0, 0, frame.getWidth(), frame.getHeight());
		g2d.setColor(Color.WHITE);
		g2d.drawRect(0, 0, frame.getWidth(), frame.getHeight());
	}

	@Override
	public void keyTyped(KeyEvent e) {
	}

	@Override
	public void keyPressed(KeyEvent e) {
		if (e.getKeyCode() == KeyEvent.VK_ESCAPE) {
			System.exit(0);
		}
	}

	@Override
	public void keyReleased(KeyEvent e) {
	}

	@Override
	public void mouseClicked(MouseEvent e) {
	}

	@Override
	public void mousePressed(MouseEvent e) {
	}

	@Override
	public void mouseReleased(MouseEvent e) {
	}

	@Override
	public void mouseEntered(MouseEvent e) {
	}

	@Override
	public void mouseExited(MouseEvent e) {
	}
}
