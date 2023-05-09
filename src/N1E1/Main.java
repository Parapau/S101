package N1E1;

public class Main {
	public static void main (String args[]) {
		Vent instrument = new Vent ("flauta", 68);
		
		Vent.metodeStatic();
		
		Percussio.metodeStatic();
		
		Percussio tambor = new Percussio ("Josep", 6);
		System.out.println(tambor);
		Percussio tamboor = new Percussio ("Joseawdawp", 6);
		
		
		instrument.tocar();
		System.out.println();
	}
}
