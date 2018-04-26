package com.designpatterns.strategy.baddesign.alter2;

public class Account {
	public boolean canDointerbankTransfer(int sourceAcc, int destinationAcc) {
		// Some logic
		return true;
	}

	// Now canDoIntrabankTransfer is moved to respective subclasses. This led to
	// lot of code duplications in each and evry subclass.

}
