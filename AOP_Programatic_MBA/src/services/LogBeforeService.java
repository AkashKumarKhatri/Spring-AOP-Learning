package services;

import java.lang.reflect.Method;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.aop.MethodBeforeAdvice;

import bussiness.Bank;

public class LogBeforeService implements MethodBeforeAdvice {

	@Override
	public void before(Method m, Object[] param, Object o) throws Throwable {
		Log log = LogFactory.getLog(Bank.class);
		log.info("deposit method..");
	}
	
}
