package test;

import org.springframework.aop.framework.ProxyFactoryBean;

import bussiness.Bank;
import services.LogBeforeService;

public class Client {
	public static void main(String[] args) {
		// Create Target
		Bank bank = new Bank();
		
		// Create Advice
		LogBeforeService lbs = new LogBeforeService();
		
		// Add Target + Advice to proxy
		ProxyFactoryBean pfb = new ProxyFactoryBean();
		pfb.setTarget(bank);
		pfb.addAdvice(lbs);
		
		// get generated proxy object
		Bank bankProxy = (Bank) pfb.getObject();
		int amount = bankProxy.deposite("sbi123", 15);
		System.out.println(amount);
		
	}
}
