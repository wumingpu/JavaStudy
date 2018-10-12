package com.wmp.game;

import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

import javax.swing.JFrame;

/**
 * 飞机游戏的主窗口
 * @author wmp
 *
 */
public class MyGameFrame extends JFrame {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyGameFrame f = new MyGameFrame();
		f.launchFrame();
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

}
