package N3E1;

public class NoticiaTenis extends Noticia {
	private String competicio, tenistes;

	public NoticiaTenis(String titular, String competicio, String tenistes) {
		super(titular);
		this.competicio = competicio;
		this.tenistes = tenistes;
	}

	public String getCompeticio() {
		return competicio;
	}

	public String getTenistes() {
		return tenistes;
	}

	public void setCompeticio(String competicio) {
		this.competicio = competicio;
	}

	public void setTenistes(String tenistes) {
		this.tenistes = tenistes;
	}
	
	public void calcularPreuNoticia() {
		//si cal posar mes d'un tenista es pot fer un split
		int preu = 150;
		preu += (this.tenistes.equalsIgnoreCase("Nadal"))? 100:0;
		preu += (this.tenistes.equalsIgnoreCase("Federer"))? 100:0;
		preu += (this.tenistes.equalsIgnoreCase("Federer"))? 100:0;
		
		setPreu(preu);
	}
	
	public void calcularPuntuacioNoticia(){
		int punts = 4;
		punts += (this.tenistes.equalsIgnoreCase("Nadal"))? 3:0;
		punts += (this.tenistes.equalsIgnoreCase("Federer"))? 3:0;
		punts += (this.tenistes.equalsIgnoreCase("Federer"))? 3:0;
		
		setPuntuacio(punts);
	}
}
