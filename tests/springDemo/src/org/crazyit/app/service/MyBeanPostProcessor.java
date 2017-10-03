package org.crazyit.app.service;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;

public class MyBeanPostProcessor implements BeanPostProcessor {

	@Override
	public Object postProcessAfterInitialization(Object arg0, String arg1)
			throws BeansException {
		System.out.println("Bean后处理器在初始化之后对"+arg1+"进行增强处理");
//		if(arg0 instanceof Chinese )
//		{
//			Chinese chinese=(Chinese)arg0;
//					chinese.useAxe();
//		}
		return arg0;
	}

	@Override
	public Object postProcessBeforeInitialization(Object arg0, String arg1)
			throws BeansException {
			System.out.println("Bean后处理器在初始化之前对"+arg1+"进行增强处理");
		return arg0;
	}

}
