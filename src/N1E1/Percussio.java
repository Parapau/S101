package N1E1;

public class Percussio extends Instrument{
	public Percussio (String nom, int preu) {
		super(nom, preu);
	}
	
	static {
		System.out.println("Inicialitzada percussio");
	}
	
	
	public String tocar() {
		return "Esta sonant un instrument de Percussio";
	}
	
	public static void metodeStatic() {
		System.out.println("soc un metode estatic");
	}

}
