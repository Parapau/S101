package N1E1;

public class Vent extends Instrument{
	public Vent(String nom, int preu) {
		super(nom, preu);
	}
	
	static {
		System.out.println("INICIALITZAT JODER fiu fiu");
	}
	
	
	public String tocar() {
		return "Esta sonant un instrument de vent";
	}
	
	public static void metodeStatic() {
		System.out.println("Soc un metode estatic");
	}
}
