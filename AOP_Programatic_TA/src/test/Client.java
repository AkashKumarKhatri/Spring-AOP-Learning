package test;

import org.springframework.aop.framework.ProxyFactoryBean;

import bussiness.Bank;
import services.LogInExceptionService;

public class Client {
	public static void main(String[] args) {
		// Create Target
		Bank bank = new Bank();
		
		// Create Advice
		LogInExceptionService las = new LogInExceptionService();
		
		// Add Target + Advice to proxy
		ProxyFactoryBean pfb = new ProxyFactoryBean();
		pfb.setTarget(bank);
		pfb.addAdvice(las);
		
		// get generated proxy object
		Bank bankProxy = (Bank) pfb.getObject();
		int amount = bankProxy.deposite("sbi23", 15);
		System.out.println(amount);
		
	}
}
