package N3E1;

public class NoticiaBasquet extends Noticia{
	private String competicio, club;

	public NoticiaBasquet(String titular, String competicio, String club) {
		super(titular);
		this.competicio = competicio;
		this.club = club;
	}

	public String getCompeticio() {
		return competicio;
	}

	public String getClub() {
		return club;
	}

	public void setCompeticio(String competicio) {
		this.competicio = competicio;
	}

	public void setClub(String club) {
		this.club = club;
	}	
	
	
	public int calcularPreuNoticia() {
		int preu = 250;
		preu += (this.competicio.equalsIgnoreCase("Eurolliga"))? 75:0;
		preu += (this.club.equalsIgnoreCase("Barça"))? 75:0;
		preu += (this.club.equalsIgnoreCase("Madrid"))? 75:0;
		
		return preu;
	}
	
	public int calcularPuntuacioNoticia(){
		int punts = 4;
		punts += (this.competicio.equalsIgnoreCase("Eurolliga"))? 3:0;
		punts += (this.competicio.equalsIgnoreCase("ACB"))? 2:0;
		punts += (this.club.equalsIgnoreCase("Barça"))? 1:0;
		punts += (this.club.equalsIgnoreCase("Madrid"))? 1:0;
		
		return punts;
	}
}
	

