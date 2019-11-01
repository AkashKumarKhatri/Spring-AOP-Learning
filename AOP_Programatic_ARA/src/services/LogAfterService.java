package services;

import java.lang.reflect.Method;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.aop.AfterReturningAdvice;
import org.springframework.aop.MethodBeforeAdvice;

import bussiness.Bank;

public class LogAfterService implements AfterReturningAdvice {

	@Override
	public void afterReturning(java.lang.Object arg0, Method arg1, java.lang.Object[] arg2, java.lang.Object arg3)
			throws Throwable { 
		Log log = LogFactory.getLog(Bank.class);
		log.info("deposit method..");
	}
	
}
