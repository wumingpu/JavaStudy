package com.wmp.io;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;

/**
 * 数据流：
 * 1. 写出后读取
 * 2. 读取的顺序与写出一致
 * @author WMP
 *
 */
public class DataTest {

	public static void main(String[] args) throws IOException {
		// 写出
		ByteArrayOutputStream baos = new ByteArrayOutputStream(); // 字节流
		DataOutputStream dos = new DataOutputStream(new BufferedOutputStream(baos));
		
		dos.writeUTF("我");
		dos.writeInt(8);
		dos.writeBoolean(false);
		dos.writeChar('a');
		dos.flush();
		byte[] datas = baos.toByteArray();
		// 读取
		DataInputStream dis = new DataInputStream(new BufferedInputStream(new ByteArrayInputStream(datas)));
		String msg = dis.readUTF();
		int age = dis.readInt();
		boolean flag = dis.readBoolean();
		char ch = dis.readChar();
		System.out.println(msg);
	}

}
