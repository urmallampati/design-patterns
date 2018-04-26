package com.designpatterns.strategy.impl;

public interface IIntraBankTransferAbility {
	boolean canDoIntraBankTransfer();
}

class CanCategory implements IIntraBankTransferAbility {

	@Override
	public boolean canDoIntraBankTransfer() {
		return true;
	}

}

class CannotCategory implements IIntraBankTransferAbility {
	@Override
	public boolean canDoIntraBankTransfer() {
		return false;
	}
}
