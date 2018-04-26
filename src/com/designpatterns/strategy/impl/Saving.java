package com.designpatterns.strategy.impl;

public class Saving extends Account {
	public Saving() {
		setIntraTransferAbility(new CannotCategory());
	}
}
