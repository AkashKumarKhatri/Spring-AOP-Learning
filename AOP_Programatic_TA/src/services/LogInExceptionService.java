package services;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.aop.ThrowsAdvice;

import bussiness.Bank;

public class LogInExceptionService implements ThrowsAdvice {
	public void afterThrowing(Exception ex) {
		Log log = LogFactory.getLog(Bank.class);
		log.info("Incase of exception in deposite: ");
	}
}
