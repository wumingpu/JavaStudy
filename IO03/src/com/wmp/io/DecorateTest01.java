package com.wmp.io;
/**
 * 实现放大器的功能
 * @author WMP
 *
 */
public class DecorateTest01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Person p = new Person();
		p.say();
		
		// 装饰器 模式。
		// 其实就是类与类之间的关系。
		Amplifier am = new Amplifier(p);
		am.say();
	}

}

interface Say{
	void say();
}

class Person implements Say{
	// 属性
	private int voice = 10;

	public int getVoice() {
		return voice;
	}

	public void setVoice(int voice) {
		this.voice = voice;
	}

	@Override
	public void say() {
		System.out.println("人的声音为："+this.getVoice());
	}
	
}

class Amplifier implements Say{
	private Person p;
	Amplifier(Person p){
		this.p = p;
	}
	@Override
	public void say() {
		// TODO Auto-generated method stub
		System.out.println("人的声音为："+p.getVoice()*100);
		System.out.println("噪音");
	}
}
