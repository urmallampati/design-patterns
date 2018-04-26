package strategy.impl;

public class Checking extends Account {
	public Checking() {
		// This falls under can category as it allows intrabanktransfer.
		setIntraTransferAbility(new CanCategory());
	}
}
