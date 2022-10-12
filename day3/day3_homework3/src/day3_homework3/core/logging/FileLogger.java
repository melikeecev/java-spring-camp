package day3_homework3.core.logging;

public class FileLogger implements Logger{

	@Override
	public void log(String data) {
		System.out.println("Loggend to file" + data);
	}
	
}
