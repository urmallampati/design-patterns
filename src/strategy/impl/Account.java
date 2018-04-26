package strategy.impl;

public class Account {
	private int accountNumber;
	private int routingNumber;

	// ******Key here is that choosing composition for deciding the strategy to
	// be used.

	// Account composes IntraBankTransferAbility. This means, we avoided code
	// duplication and we can dynamically change the intrabankTransferability of
	// an account type at runtime with no change in the source code and no
	// recompilations. Look at Tester for explanation.
	private IIntraBankTransferAbility intraTransferAbility;

	public boolean canDointerbankTransfer() {
		// Some logic
		return true;
	}

	public void setIntraTransferAbility(IIntraBankTransferAbility intraTransferAbility) {
		this.intraTransferAbility = intraTransferAbility;
	}

	public boolean CanDoIntraBank() {
		return intraTransferAbility.canDoIntraBankTransfer();
	}

}
