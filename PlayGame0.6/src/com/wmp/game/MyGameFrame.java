package com.wmp.game;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

import javax.swing.JFrame;

/**
 * 飞机游戏的主窗口
 * @author wmp
 *
 */
public class MyGameFrame extends JFrame {
	
	Image planeImg = GameUtil.getImage("images/plane.png");
	Image bg = GameUtil.getImage("images/bg.jpg");
	
	Plane plane = new Plane(planeImg, 250, 250);
	
	@Override
	public void paint(Graphics g) {
		// TODO Auto-generated method stub
		// 自动被调用，g变量相当于一支画笔
		g.drawImage(bg, 0, 0, null);
		plane.drawSelf(g); // 画飞机
	}
	
	class PaintThread extends Thread{
		@Override
		public void run() {
			// TODO Auto-generated method stub
			while(true) {
				// System.out.println("窗口重画中。");
				repaint(); // 重画窗口
				
				try {
					Thread.sleep(40);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
		}
	}

	// 定义键盘监听的内部类
	class KeyMonitor extends KeyAdapter{

		@Override
		public void keyPressed(KeyEvent e) {
			plane.addDirection(e);
		}

		@Override
		public void keyReleased(KeyEvent e) {
			plane.minusDirection(e);
		}
		
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
		
		// 启动线程
		new PaintThread().start();
		addKeyListener(new KeyMonitor());
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyGameFrame f = new MyGameFrame();
		f.launchFrame();
	}

}
