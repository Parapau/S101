package N1E2;

public class Cotxe {
	private static final String marca = "Seat";
	private static String model = "Panda";
	private final int potencia;
	
	public Cotxe(int potencia) {
		this.potencia = potencia;
	}

	public static String getMarca() {
		return marca;
	}

	public static String getModel() {
		return model;
	}

	public int getPotencia() {
		return potencia;
	}

	public static void setModel(String model) {
		Cotxe.model = model;
	}
	
	public void accelerar() {
		System.out.println("El cotxes esta accelerant");
	}
	
	public static void frenar() {
		System.out.println("El cotxe esta frenant");
	}
}
