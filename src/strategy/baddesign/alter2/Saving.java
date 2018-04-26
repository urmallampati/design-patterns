package strategy.baddesign.alter2;

public class Saving extends Account {

	public boolean canDointrabankTransfer(int routingNum, int sourceAcc, int destinationAcc) {
		// Some logic
		return false;
	}
}
