package prototype.impl;

public class PrototypeTester {
	/*
	 * Imagine the scenario where
	 */
	public static void main(String args[]) {
		PublicLibrary libraryOne = new PublicLibrary();

		try {
			// Database call
			libraryOne.loadBooks();
			printStat(libraryOne);
			System.out.println("Creating library two by cloning library one...concentrate on hashcodes");

			PublicLibrary libraryTwo = (PublicLibrary) libraryOne.clone();

			printStat(libraryOne, libraryTwo);

			System.out.println("Removing a book from shallow copy...It effects both lists");

			removeBook(libraryTwo);
			printStat(libraryOne, libraryTwo);
			// Using deepcopy
			System.out.println("Creating library four by deep cloning library one...concentrate on hashcodes");
			PublicLibrary libraryFour = (PublicLibrary) libraryOne.deepClone();
			printStat(libraryOne, libraryFour);

			System.out.println("Removing a book from deep copy...It should effect one list");
			removeBook(libraryFour);
			printStat(libraryOne, libraryFour);

		} catch (CloneNotSupportedException ex) {
			ex.printStackTrace();
		}

	}

	private static void removeBook(PublicLibrary library) {
		if (library.getBookList() != null && library.getBookList().size() > 0) {
			library.getBookList().remove(0);
		}
	}

	private static void printStat(PublicLibrary... libraries) {

		for (PublicLibrary library : libraries) {
			System.out.println("library id:" + library.getLibraryId() + " hashcode:" + System.identityHashCode(library)
					+ " Bookslist hashcode : " + System.identityHashCode(library.getBookList())
					+ " library Name string hascode " + System.identityHashCode(library.getLibraryName()));

		}
		System.out.println();
		for (PublicLibrary library : libraries) {
			System.out.println(library);
		}
		System.out.println();

	}
}
