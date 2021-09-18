package main;

import java.awt.Point;

public abstract class Button {

	protected boolean mouseIn(int x, int y, int w, int h) {
		Point mouse = Window.frame.getMousePosition();
		if (mouse == null) {
			return false;
		}
		return mouse.x > x && mouse.x < x + w && mouse.y > y && mouse.y < y + h;
	}
}
