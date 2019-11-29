package ma.ensa;

public class ThreadedTask extends Thread {

	private String taskName;

	public ThreadedTask(String taskName) {
		super();
		this.taskName = taskName;
	}

	@Override
	public void run() {
		Singleton singleton = Singleton.getInstance();
		singleton.traiter(taskName);
	}
}
