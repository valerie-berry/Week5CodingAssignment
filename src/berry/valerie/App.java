package berry.valerie;

public class App {

	public static void main(String[] args) {
		Logger myAsteriskLogger = new AsteriskLogger();
		
		Logger mySpacedLogger = new SpacedLogger();
		
		myAsteriskLogger.Log("Connecting to the server...");
		myAsteriskLogger.Error("Connection failed");
		
		mySpacedLogger.Log("Loading assets...");
		mySpacedLogger.Error("Couldn't find required assets");

	}

}
