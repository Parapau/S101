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
	
	public abstract int calcularPreuNoticia();

	
	public abstract int calcularPuntuacioNoticia();
	
}
