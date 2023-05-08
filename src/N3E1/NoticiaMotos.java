package N3E1;

public class NoticiaMotos extends Noticia{
	private String equip;

	public NoticiaMotos(String titular, String equip) {
		super(titular);
		this.equip = equip;
	}

	public String getEquip() {
		return equip;
	}

	public void setEquip(String equip) {
		this.equip = equip;
	}
	
	public int calcularPreuNoticia() {
		int preu = 100;
		preu += (this.equip.equalsIgnoreCase("Honda"))? 50:0;
		preu += (this.equip.equalsIgnoreCase("Yamaha"))? 50:0;
		
		return preu;
	}
	
	public int calcularPuntuacioNoticia(){
		int punts = 3;
		punts += (this.equip.equalsIgnoreCase("Hona"))? 3:0;
		punts += (this.equip.equalsIgnoreCase("Yamaha"))? 3:0;
		
		return punts;
	}
	
}
