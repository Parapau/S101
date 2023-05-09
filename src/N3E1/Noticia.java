package N3E1;

public abstract class Noticia {
	private String titular, text;
	private int preu, puntuacio;
	public Noticia(String titular) {
		this.titular = titular;
		this.text = "";
		this.preu = 0;
		this.puntuacio = 0;
	}
	
	
	
	
	public String getTitular() {
		return titular;
	}

	public String getText() {
		return text;
	}

	public int getPreu() {
		return preu;
	}

	public int getPuntuacio() {
		return puntuacio;
	}

	
	
	public void setTitular(String titular) {
		this.titular = titular;
	}

	public void setText(String text) {
		this.text = text;
	}

	public void setPreu(int preu) {
		this.preu = preu;
	}

	public void setPuntuacio(int puntuacio) {
		this.puntuacio = puntuacio;
	}




	public abstract void calcularPreuNoticia();

	
	public abstract void calcularPuntuacioNoticia();
	
}
