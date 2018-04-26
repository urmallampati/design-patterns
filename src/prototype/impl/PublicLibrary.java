package prototype.impl;

import java.util.ArrayList;
import java.util.List;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

/*
 * Imagine the scenario where the PublicLibrary instance can be constructed with a list of books loaded from database. 
 * In such a case, it is very expensive to construct PublicLibrary instances whenever opening a new public library as
 * it involves making a db call.
 */

// Clonable is a marker interface here. 
// Which means there are no methods in the interface.
// It is used to just mark that it is OK to clone this class.
@Getter
@Setter
@ToString
public class PublicLibrary implements Cloneable {
	private int libraryId;
	private String libraryName;
	private List<Book> bookList = new ArrayList<Book>();

	public PublicLibrary() {
		this.setLibraryName("Flowermound public library");
		this.setLibraryId(2325);
	}

	protected Object deepClone() throws CloneNotSupportedException {
		// Calling clone from Object super class
		List<Book> clonedBookList = new ArrayList<>();
		for (Book book : getBookList()) {
			clonedBookList.add(book);
		}
		PublicLibrary cloneLibrary = new PublicLibrary();
		cloneLibrary.bookList = clonedBookList;
		cloneLibrary.libraryId = this.libraryId;
		// The following commented code gives same object.
		// cloneLibrary.libraryName = this.libraryName;
		// This gives different object
		cloneLibrary.libraryName = new String(this.libraryName);
		return cloneLibrary;
	}

	// Ovverride clone from the Object class.
	// super.clone() gives the shallow copy of the this object
	@Override
	protected Object clone() throws CloneNotSupportedException {
		// Calling clone from Object super class
		return super.clone();
	}

	// Lets imagine that this is a db call.
	public void loadBooks() {

		for (int i = 0; i < 3; i++) {
			getBookList().add(new Book("book" + i));
		}
	}

}
