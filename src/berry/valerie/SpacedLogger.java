package berry.valerie;

public class SpacedLogger implements Logger {

	@Override
	public void Log(String L) {
		for (char i : L.toCharArray()) {
			System.out.print(i + " ");
		}
		System.out.println();
		
	}

	@Override
	public void Error(String E) {
		System.out.print("Error: ");
		for (char i : E.toCharArray()) {
			System.out.print(i + " ");
		}

	}

}
