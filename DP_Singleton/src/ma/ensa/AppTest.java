package ma.ensa;

public class AppTest {

	public static void main(String[] args) {
		for (int i = 0; i < 3; i++) {
			ThreadedTask threadedTask = new ThreadedTask("T" + i);
			threadedTask.start();
		}

	}

}
