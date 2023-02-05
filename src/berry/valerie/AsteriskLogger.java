package berry.valerie;

public class AsteriskLogger implements Logger {

	@Override
	public void Log(String L) {
		System.out.println("***" + L + "***");		
	}

	@Override
	public void Error(String E) {
		System.out.print("*************");
		for (int a = 0; a < E.length(); a++) { System.out.print("*"); }
		System.out.println();
		System.out.println("***Error: " + E + "***");
		System.out.print("*************");
		for (int a = 0; a < E.length(); a++) { System.out.print("*"); }
		System.out.println();
	}

}
