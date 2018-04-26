package strategy.impl;

public class StrategyTester {
	public static void main(String args[]) {
		Account checkingAcc = new Checking();
		System.out.println("Checking has intrabankTransferAblity?" + checkingAcc.CanDoIntraBank());

		Account credit = new Credit();
		System.out.println("Credit has intrabankTransferAblity?" + credit.CanDoIntraBank());

		Account savingAcc = new Saving();
		System.out.println("Saving has intrabankTransferAblity?" + savingAcc.CanDoIntraBank());

		// Changing the ability of saving to do intrabank transfer
		savingAcc.setIntraTransferAbility(new CanCategory());
		System.out.println("Changed intrabanktransferability of Saving?" + savingAcc.CanDoIntraBank());
	}
}
