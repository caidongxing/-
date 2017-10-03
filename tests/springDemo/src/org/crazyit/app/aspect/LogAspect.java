package org.crazyit.app.aspect;

import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Aspect;

@Aspect
public class LogAspect {
	@AfterReturning(returning="rvt",pointcut="execution(* org.crazyit.app.service.impl.*.*(..))")
	public void log(Object rvt){
		System.out.println("Ä£ÄâÈÕÖ¾============");
	}
}
