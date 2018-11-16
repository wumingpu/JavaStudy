package com.wmp.thread;
/**
 * 创建线程方式1：
 * 1. 创建：集成Thread+重写run
 * 2. 调用 start方法
 * @author WMP
 *
 */
public class StartThread extends Thread{
	
	@Override
	public void run() {
		for(int i=0; i<20;i++) {
			System.out.println("听歌");
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StartThread st = new StartThread();
		st.start();
//		st.run();//run只是普通的方法调用，实现不了多线程了
		for(int i=0;i<20;i++) {
			System.out.println("coding");
		}
	}

}
