package N2E1;

public class Smartphone extends Telefon implements Camera, Rellotge {

	public Smartphone(String marca, String model) {
		super(marca, model);
	}
	
	public void fotografiar() {
		System.out.println("S'estat fent una foto");
	}
	
	public void alarma() {
		System.out.println("Esta sonant l'alarma, Riing");
	}
}
