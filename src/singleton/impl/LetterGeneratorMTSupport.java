package singleton.impl;

public class LetterGeneratorMTSupport {
	// On demand creation of instance.
	private static LetterGeneratorMTSupport instance = null;

	private LetterGeneratorMTSupport() {

	}
	// Synchronizing at method level is very expensive as no other thread cannot
	// even enter the method when one thread is executing it.

	// public synchronized static LetterGeneratorMTSupport getInstance() {
	// if (instance == null) {
	// instance = new LetterGeneratorMTSupport();
	// }
	// return instance;
	// }

	// Block level synchronization.
	public static LetterGeneratorMTSupport getInstance() {
		if (instance != null) {
			return instance;
		}
		synchronized (LetterGeneratorMTSupport.class) {
			if (instance == null) {
				instance = new LetterGeneratorMTSupport();
			}
		}
		return instance;
	}
}
