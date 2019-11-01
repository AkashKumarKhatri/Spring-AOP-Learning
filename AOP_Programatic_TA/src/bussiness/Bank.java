package bussiness;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

public class Bank {
	private int amount = 5000;
	private String acNo = "sbi123";
	
	public int deposite(String acno, int amount) {
		if (acno.equals(acNo)) {
			/*
			 * Log log = LogFactory.getLog(Bank.class); log.info("deposit method..");
			 */
			System.out.println("In deposit menthod");
			this.amount = this.amount + amount; 
			return this.amount;
		}
		else {
			throw new AcnoNotFoundException();
		}
	}
}
