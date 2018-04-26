package strategy.impl;

public class Credit extends Account {
	public Credit() {
		setIntraTransferAbility(new CanCategory());
	}
}
