package com.wmp.game;

import java.awt.Graphics;
import java.awt.Image;

public class Plane extends GameObject {
	public Plane(Image img, double x, double y) {
		this.img = img;
		this.x = x;
		this.y = y;
	}
	
	@Override
	public void drawSelf(Graphics g) {
		g.drawImage(img, (int)x, (int)y, null);
		x++;
	}
	
	
}
