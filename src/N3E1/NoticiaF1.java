package N3E1;

public class NoticiaF1 extends Noticia{
	private String escuderia;

	public NoticiaF1(String titular, String escuderia) {
		super(titular);
		this.escuderia = escuderia;
	}

	public String getEscuderia() {
		return escuderia;
	}

	public void setEscuderia(String escuderia) {
		this.escuderia = escuderia;
	}
	
	public void calcularPreuNoticia() {
		int preu = 100;
		preu += (this.escuderia.equalsIgnoreCase("Ferrari"))? 50:0;
		preu += (this.escuderia.equalsIgnoreCase("Mercedes"))? 50:0;
		
		setPreu(preu);;
	}
	
	public void calcularPuntuacioNoticia(){
		int punts = 4;
		punts += (this.escuderia.equalsIgnoreCase("Ferrari"))? 2:0;
		punts += (this.escuderia.equalsIgnoreCase("Mercedes"))? 2:0;
		
		setPuntuacio(punts);
	}
}
