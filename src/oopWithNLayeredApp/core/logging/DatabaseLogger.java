package oopWithNLayeredApp.core.logging;

public class DatabaseLogger implements ILogger{

	@Override
	public void log(String data) {
		System.out.println("Vetitabanına loglandı " + data);
	}

}
