package singleton.impl;

public class SingletonTester {
	public static void main(String args[]) {
		LetterGenerator generatorOne = LetterGenerator.getInstance();
		LetterGenerator generatorTwo = LetterGenerator.getInstance();
		// Return same hashcode as it is singleton
		System.out.println(System.identityHashCode(generatorOne));
		System.out.println(System.identityHashCode(generatorTwo));

		// They operate on the same collection
		System.out.println(generatorOne.getLetterCollection());
		System.out.println(generatorOne.getLetters(7));
		System.out.println(generatorOne.getLetterCollection());
		System.out.println(generatorTwo.getLetters(3));
		System.out.println(generatorOne.getLetterCollection());
		System.out.println(generatorTwo.getLetterCollection());
	}
}
