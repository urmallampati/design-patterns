package singleton.impl;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class SingletonThreadTester {
	public static void main(String args[]) {
		// Messed Up...Two different hashcodes...old way
		// new Thread(() -> {
		// LetterGenerator generatorOne = LetterGenerator.getInstance();
		// System.out.println(System.identityHashCode(generatorOne));
		// }).start();
		// new Thread(() -> {
		// LetterGenerator generatorTwo = LetterGenerator.getInstance();
		// System.out.println(System.identityHashCode(generatorTwo));
		// }).start();

		// This will still give same hashcode as it is a single thread executor.
		// Execution is in sequence.

		// ExecutorService service = Executors.newSingleThreadExecutor();

		ExecutorService service = Executors.newFixedThreadPool(2);
		try {
			// Messed Up...Two different hashcodes
			Future<?> futureOne = service.submit(() -> {
				LetterGenerator generatorOne = LetterGenerator.getInstance();
				System.out.println(System.identityHashCode(generatorOne));
			});
			Future<?> futureTwo = service.submit(() -> {
				LetterGenerator generatorTwo = LetterGenerator.getInstance();
				System.out.println(System.identityHashCode(generatorTwo));
			});
			// Returns same hashcode
			Future<?> futureThree = service.submit(() -> {
				LetterGeneratorMTSupport generatorOne = LetterGeneratorMTSupport.getInstance();
				System.out.println("MultiThreaded version of singleton " + System.identityHashCode(generatorOne));
			});
			Future<?> futureFour = service.submit(() -> {
				LetterGeneratorMTSupport generatorTwo = LetterGeneratorMTSupport.getInstance();
				System.out.println("MultiThreaded version of singleton " + System.identityHashCode(generatorTwo));
			});
		} catch (Exception ex) {

		} finally {
			if (service != null) {
				service.shutdown();
			}
		}

	}
}
