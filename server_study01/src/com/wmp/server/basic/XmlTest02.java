package com.wmp.server.basic;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.xml.parsers.ParserConfigurationException;
import javax.xml.parsers.SAXParser;
import javax.xml.parsers.SAXParserFactory;

import org.xml.sax.Attributes;
import org.xml.sax.SAXException;
import org.xml.sax.helpers.DefaultHandler;

public class XmlTest02 {

	public static void main(String[] args) throws SAXException, IOException, ParserConfigurationException {
		// SAX解析
		//1. 获取解析工厂
		SAXParserFactory factory = SAXParserFactory.newInstance();
		//2. 从解析工厂获取解析器
		SAXParser parse = factory.newSAXParser();
		//3.加载文档Document注册处理器
		//4.编写处理器
		PersonHandler handler = new PersonHandler();
		//5.解析
		parse.parse(Thread.
				currentThread().
				getContextClassLoader().
				getResourceAsStream("com/wmp/server/basic/p.xml"), 
				handler);
		// 获取数据
		List<Person> persons = handler.getPersons();
		for(Person p:persons) {
			System.out.println(p.getName()+p.getAge());
		}
	}

}

class PersonHandler extends DefaultHandler{
	private List<Person> persons;
	private Person person;
	public List<Person> getPersons() {
		return persons;
	}

	private String tag; // 存储操作的标签
	
	@Override
	public void startDocument() throws SAXException{
		System.out.println("---解析文档开始---");
		persons = new ArrayList<Person>();
	}
	
	
	@Override
	public void startElement(String uri, String localName, String qName, Attributes attributes) throws SAXException {
		System.out.println(qName+"-->解析开始");
		if(null!=qName) {
			tag = qName; // 存储标签名
		}
		
		if(tag.equals("person")) {
			person = new Person();
		}
	}
	
	@Override
	public void endElement(String uri, String localName, String qName) throws SAXException {
		System.out.println(tag+"-->解析结束");
		if(tag.equals("person")) {
			persons.add(person);
		}
		tag = null;
	}
	
	@Override
	public void characters(char[] ch, int start, int length) throws SAXException {
		String contents = new String(ch, start, length).trim();
		if(null != tag) {
			if(tag.equals("name")) {
				person.setName(contents);
				
			}
			else if(tag.equals("age")){
				if(contents.length()>0) {
					person.setAge(Integer.valueOf(contents));
				}
			}
		}
	}
	
	@Override
	public void endDocument() throws SAXException {
		System.out.println("---解析文档结束---");
	}
}
