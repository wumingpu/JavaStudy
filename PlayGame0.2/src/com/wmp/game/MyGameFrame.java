package com.wmp.game;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

import javax.swing.JFrame;

/**
 * 飞机游戏的主窗口
 * @author wmp
 *
 */
public class MyGameFrame extends JFrame {
	
	Image ball = GameUtil.getImage("images/ball.png");
	
	@Override
	public void paint(Graphics g) {
		// TODO Auto-generated method stub
		// 自动被调用，g变量相当于一支画笔
		Color c = g.getColor(); // 存储旧的颜色
		Font f = g.getFont();
		
		g.setColor(Color.BLUE);
		g.drawLine(100, 100, 300, 300);
		g.drawRect(100, 100, 300, 300);
		g.drawOval(100, 100, 300, 300);
		g.fillRect(100, 100, 40, 40);
		g.setFont(new Font("宋体", Font.BOLD, 50));
		g.drawString("abccc", 200, 200);
		
		g.drawImage(ball, 250, 250, null);
		
		g.setColor(c); // 将颜色还原
		g.setFont(f); // 将字体还原
	}

	
	/**
	 * 初始化窗口
	 */
	public void launchFrame() {
		this.setTitle("飞机游戏");
		this.setVisible(true);
		this.setSize(500, 500);
		this.setLocation(100, 100); // 左上角为原点
		
		this.addWindowListener(new WindowAdapter() {
			@Override
			public void windowClosing(WindowEvent e) {
				// TODO Auto-generated method stub
//				super.windowClosed(e);
				System.exit(0); // 关闭按钮，程序退出。
			}
		});
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyGameFrame f = new MyGameFrame();
		f.launchFrame();
	}

}
