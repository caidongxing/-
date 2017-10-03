package org.crazyit.app.service;

import java.lang.reflect.Field;

import org.springframework.beans.factory.FactoryBean;

public class getFieldBeanFactory implements FactoryBean<Object> {
	private String targetClass;
	private String targetField;
	public String getTargetClass() {
		return targetClass;
	}
	public void setTargetClass(String targetClass) {
		this.targetClass = targetClass;
	}
	public void setTargetField(String targetField) {
		this.targetField = targetField;
	}
	public Object getObject() throws Exception
	{
		Class<?> clazz=Class.forName(targetClass);
		Field field =clazz.getField(targetField);
		return field.get(null);
	}
	public Class<? extends Object> getObjectType(){
		return Object.class ;
	}
	public boolean isSingleton(){
		return false;
	}
}







