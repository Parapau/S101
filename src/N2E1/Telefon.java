package N2E1;

public class Telefon {
	private String marca, model;

	public Telefon(String marca, String model) {
		this.marca = marca;
		this.model = model;
	}

	public String getMarca() {
		return marca;
	}

	public String getModel() {
		return model;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public void setModel(String model) {
		this.model = model;
	}
	
	public void trucar(String numero) {
		System.out.println("S'esta trucant al " + numero);
	}
	
	
}
