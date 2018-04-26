package singleton.impl;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class LetterGenerator {
	// On demand creation of instance.
	private static LetterGenerator instance = null;
	String[] StringArray = { "a", "a", "b", "c", "d", "r", "l", "a", "a", "b", "c", "d", "r", "l", "a", "a", "b", "c",
			"d", "r", "l", "k", "j", "d", "f", "V", "b", "k" };
	private List<String> letterCollection = new LinkedList<>(Arrays.asList("a", "a", "b", "c", "d", "r", "l", "a", "a",
			"b", "c", "d", "r", "l", "a", "a", "b", "c", "d", "r", "l", "k", "j", "d", "f", "V", "b", "k"));

	private LetterGenerator() {

	}

	public static LetterGenerator getInstance() {
		if (instance == null) {
			instance = new LetterGenerator();
		}
		return instance;
	}

	public List<String> getLetters(int number) {
		List<String> returnList = new LinkedList<>();
		if (number <= letterCollection.size()) {

			for (int i = 0; i < number; i++) {
				returnList.add(letterCollection.remove(0));
			}
		} else {
			System.out.println("Not enough letters");
		}
		return returnList;
	}

}
