package N1E1;

public class Corda extends Instrument{
	public Corda (String nom, int preu) {
		super(nom, preu);
	}
	
	static {
		System.out.println("easrwe");
	}
	
	public String tocar() {
		return "Esta sonant un instrument de corda";
	}
	
	public static void metodeStatic() {
		System.out.println("soc un metode estatic");
	}
}
