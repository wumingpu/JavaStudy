package com.wmp.io;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.Reader;

/**
 * 转换流：InputStreamReader OutputStreamWriter
 * 1. 以字符流的形式操作字节流
 * 2. 指定字符集
 * @author WMP
 *
 */
public class ConvertTest {

	public static void main(String[] args){
		// TODO Auto-generated method stub
		// 操作System.in 和 System.out
		try(BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
			BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(System.out));){
			String msg = "";
			while(!msg.equals("exit")) {
				msg = reader.readLine();
				writer.write(msg);
				writer.newLine();
				writer.flush();
			}
		}catch(IOException e) {
			System.out.println("操作异常");
			
		}
	}

}
