package com.wmp.server.servlet;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class WebContext {
	private List<Entity> entitys = null;
	private List<Mapping> mappings = null;
	
	// key-->servlet-name  value-->servlet-class
	private Map<String,String> entityMap = new HashMap<String,String>();
	// ket-->url-pattern   value-->servlet-name
	private Map<String,String> mappingMap = new HashMap<String,String>();
	public WebContext() {
	}
	public WebContext(List<Entity> entitys, List<Mapping> mappings) {
		super();
		this.entitys = entitys;
		this.mappings = mappings;
		
		// 将entity的list转换成map
		for(Entity entity:entitys) {
			entityMap.put(entity.getName(), entity.getClz());
		}
		// 将mapping的list转换成map
		for(Mapping mapping:mappings) {
			for(String pattern:mapping.getPatterns()) {
				mappingMap.put(pattern, mapping.getName());
			}
			
		}
	}
	
	// 通过url路径找到了对应的class，然后反射进行class的实例化
	public String getClz(String pattern) {
		String name = mappingMap.get(pattern);
		
		return entityMap.get(name);
	}
	
}
