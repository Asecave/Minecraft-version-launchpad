package main;

import java.awt.Color;
import java.awt.Graphics2D;

public class AddButton extends Button {

	private int x, y, w, h;
	private boolean soundPlayed;

	public AddButton(int x, int y, int w, int h) {
		this.x = x;
		this.y = y;
		this.w = w;
		this.h = h;
	}

	public void draw(Graphics2D g2d) {
		if (mouseIn(x, y, w, h)) {
			if (!soundPlayed) {
				Window.playSound("rollover.wav");
				soundPlayed = true;
			}
			g2d.setColor(new Color(1f, 1f, 1f, 0.5f));
			g2d.fillRect(x, y, w, h);
		} else {
			soundPlayed = false;
		}
		g2d.setColor(Color.WHITE);
		g2d.drawRect(x, y, w, h);
		g2d.drawLine(Window.frame.getWidth() - 30, Window.frame.getHeight() - 40, Window.frame.getWidth() - 30, Window.frame.getHeight() - 20);
		g2d.drawLine(Window.frame.getWidth() - 40, Window.frame.getHeight() - 30, Window.frame.getWidth() - 20, Window.frame.getHeight() - 30);
	}
	
	public void click() {
		if (mouseIn(x, y, w, h)) {
			new CreateButtonWindow();
		}
	}

}
