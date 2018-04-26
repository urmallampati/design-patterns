package com.designpatterns.strategy.baddesign.alter1;

public class Account {
	private int accountNumber;
	private int routingNumber;

	public boolean canDointerbankTransfer(int sourceAcc, int destinationAcc) {
		// Some logic
		return true;
	}

	// This is a bad practice as intrabank transfer cannot be done from savings
	// account.Having this method in super class is a bad design practice.
	public boolean canDointrabankTransfer(int routingNum, int sourceAcc, int destinationAcc) {
		// Some logic
		return true;
	}
}
