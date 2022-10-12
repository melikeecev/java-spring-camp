package day3_homework3.core.logging;

public class DatabaseLogger implements Logger{

	@Override
	public void log(String data) {
		System.out.println("Loggend to database" + data);
	}

}
