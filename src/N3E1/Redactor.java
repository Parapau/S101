package N3E1;

public class Redactor {
	private String nom;
	private final String DNI;
	private static int sou = 1500;
	
	
	public Redactor(String nom, String dNI) {
		this.nom = nom;
		DNI = dNI;
	}


	public String getNom() {
		return nom;
	}


	public String getDNI() {
		return DNI;
	}


	public static int getSou() {
		return sou;
	}


	public void setNom(String nom) {
		this.nom = nom;
	}


	public static void setSou(int sou) {
		Redactor.sou = sou;
	}
	
	
	
}
