package com.designpatterns.strategy.baddesign.alter2;

public class Credit extends Account {

	public boolean canDointrabankTransfer(int routingNum, int sourceAcc, int destinationAcc) {
		// Some logic
		return true;
	}
}
