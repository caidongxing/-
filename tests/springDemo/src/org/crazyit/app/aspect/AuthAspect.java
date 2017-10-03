package org.crazyit.app.aspect;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;

@Aspect
public class AuthAspect {
	@Before("execution(* org.crazyit.app.service.impl.*.*(..))")
	public void authority(){
		System.out.println("模拟权限执行============");
	}
}
