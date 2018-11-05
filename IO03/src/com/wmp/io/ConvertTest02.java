package com.wmp.io;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.Reader;
import java.net.URL;

import java.io.InputStream;

/**
 * 转换流：InputStreamReader OutputStreamWriter
 * 1. 以字符流的形式操作字节流
 * 2. 指定字符集
 * @author WMP
 *
 */
public class ConvertTest02 {

	public static void main(String[] args){
		// TODO Auto-generated method stub
		// 操作System.in 和 System.out
		try(BufferedReader reader = 
				new BufferedReader(
						new InputStreamReader(
								new URL("http://www.baidu.com").openStream(), "UTF-8"));
				BufferedWriter writer = 
						new BufferedWriter(
								new OutputStreamWriter(
										new FileOutputStream("baidu.html"), "UTF-8"));){
			String msg;
			while((msg=reader.readLine())!=null) {
				writer.write(msg);
				writer.newLine();
			}
			writer.flush();
		}catch(IOException e) {
			System.out.println("操作异常");
		}
	}
	
	public static void test2() {
		// TODO Auto-generated method stub
				// 操作System.in 和 System.out
				try(InputStreamReader is = new InputStreamReader(new URL("http://www.baidu.com").openStream(), "UTF-8");){
					int temp;
					while((temp=is.read())!=-1) {
						System.out.print((char)temp);
						
					}
				}catch(IOException e) {
					System.out.println("操作异常");
					
				}
	}
	
	public static void test1(){
		// TODO Auto-generated method stub
		// 操作System.in 和 System.out
		try(InputStream is = new URL("http://www.baidu.com").openStream();){
			int temp;
			while((temp=is.read())!=-1) {
				System.out.print((char)temp); // 字节数不够，会出现乱码
				
			}
		}catch(IOException e) {
			System.out.println("操作异常");
			
		}
	}

}
