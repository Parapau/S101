package N3E1;

import java.util.ArrayList;

public class Redactor {
	private String nom;
	private final String DNI;
	private static int sou = 1500;
	private ArrayList<Noticia> noticies = new ArrayList<Noticia>();
	
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

	public ArrayList<Noticia> getNoticies(){
		return noticies;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}


	public static void setSou(int sou) {
		Redactor.sou = sou;
	}
	
	
	
}
