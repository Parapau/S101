package N1E1;

public class Main {
	public static void main (String args[]) {
		Vent instrument = new Vent ("Pere", 68);
		
		Percussio.metodeStatic();
		
		Vent.metodeStatic();
		
		Percussio tambor = new Percussio ("Josep", 6);
		Percussio tamboor = new Percussio ("Joseawdawp", 6);
		
		
		instrument.tocar();
		System.out.println();
	}
}
