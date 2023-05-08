package N3E1;

public class NoticiaFurbo extends Noticia{
	private String competicio, equip, jugador;

	public NoticiaFurbo(String titular, String competicio, String equip, String jugador) {
		super(titular);
		this.competicio = competicio;
		this.equip = equip;
		this.jugador = jugador;
	}

	public String getCompeticio() {
		return competicio;
	}

	public String getEquip() {
		return equip;
	}

	public String getJugador() {
		return jugador;
	}

	public void setCompeticio(String competicio) {
		this.competicio = competicio;
	}

	public void setEquip(String equip) {
		this.equip = equip;
	}

	public void setJugador(String jugador) {
		this.jugador = jugador;
	}
	
	public int calcularPreuNoticia() {
		int preu = 300;
		preu += (this.competicio.equalsIgnoreCase("Lliga de campions"))? 100:0;
		preu += (this.equip.equalsIgnoreCase("Barça"))? 100:0;
		preu += (this.equip.equalsIgnoreCase("Madrid"))? 100:0;
		preu += (this.jugador.equalsIgnoreCase("Ferran Torres"))? 50:0;
		preu += (this.jugador.equalsIgnoreCase("Benzema"))? 50:0;
		
		return preu;
	}
	
	public int calcularPuntuacioNoticia(){
		int punts = 5;
		punts += (this.competicio.equalsIgnoreCase("Lliga de campions"))? 3:0;
		punts += (this.competicio.equalsIgnoreCase("Lliga"))? 3:0;
		punts += (this.equip.equalsIgnoreCase("Barça"))? 1:0;
		punts += (this.equip.equalsIgnoreCase("Madrid"))? 1:0;
		punts += (this.jugador.equalsIgnoreCase("Ferran Torres"))? 1:0;
		punts+= (this.jugador.equalsIgnoreCase("Benzema"))? 1:0;
		
		return punts;
	}
}
