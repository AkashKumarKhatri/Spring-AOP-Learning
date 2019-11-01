package services;

import org.aopalliance.intercept.MethodInterceptor;
import org.aopalliance.intercept.MethodInvocation;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import bussiness.Bank;

public class LogAroundService implements MethodInterceptor {

	@Override
	public Object invoke(MethodInvocation mi) throws Throwable {
		Log log = LogFactory.getLog(Bank.class);
		log.info("before deposit code ...");
		Object ob = mi.proceed();
		log.info("after deposit code ...");
		return ob;
	}
	
}
