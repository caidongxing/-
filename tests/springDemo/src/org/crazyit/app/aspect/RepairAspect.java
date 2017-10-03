package org.crazyit.app.aspect;

import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Aspect;

@Aspect
public class RepairAspect {
	@AfterThrowing(throwing="ax",pointcut="execution(* org.crazyit.app.service.impl.*.*(..))")
public void doRecoveryAction(Throwable ax){
	System.out.println("Ä£ÄâÒì³£ÐÞ¸´==========");
}
}
