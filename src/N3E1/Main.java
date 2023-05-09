package N3E1;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
	static Scanner entrada = new Scanner(System.in);
	static ArrayList<Redactor> redactors = new ArrayList<Redactor>();
	public static void main(String args[]) {
		boolean seguir = true;
		int opcio;
		String missatge = "Quina de les següents opcions vols pendre?\n"
				+ "1.Contractar un nou redactor\n"
				+ "2.Despatxar un redactor\n"
				+ "3.Introduir la noticia d'un redactor\n"
				+ "4.Retirar la noticia d'un redactor\n"
				+ "5.Mostrar tot el portfolio del redactor\n"
				+ "6.Calcular la puntuacio d'una noticia\n"
				+ "7.Calcular el preu d'una noticia\n"
				+ "0.Sortire del programa\n"
				+ "Siusplau, introdueix el numero de l'accio que vols pendre.";

		do {
			System.out.println(missatge);
			opcio = numeros();
			switch (opcio) {
			case 1:
				System.out.println("Molt Be");
				nouRedactor();
				break;
			case 2:
				System.out.println("Molt be");
				foraRedactor();
				break;
			case 3:
				System.out.println("Molt be");
				novaNoticia();
				break;
			case 4:
				System.out.println("Molt be");
				foraNoticia();
				break;
			case 5:
				System.out.println("Molt be");
				veureNoticia();
				break;
			case 6:
				System.out.println("Molt be");
				calcularPunts();
				break;
			case 7:
				System.out.println("Molt be");
				calcularPreu();
				break;
			case 0:
				System.out.println("Molt be, fins un altre");
				seguir = false;
				break;
			default:
				System.out.println("Aixo no es una de les opcions, siusplau introdueix un numero correcte");
				break;

			}
			missatge = "Benvingut de nou, et torno a deixar aqui les opcions \n"
					+ "1.Contractar un nou redactor\n"
					+ "2.Despatxar un redactor\n"
					+ "3.Introduir la noticia d'un redactor\n"
					+ "4.Retirar la noticia d'un redactor\n"
					+ "5.Mostrar totes les noticies per redactor\n"
					+ "6.Calcular la puntuacio d'una noticia\n"
					+ "7.Calcular el preu d'una noticia\n"
					+ "0.Sortire del programa\n"
					+ "Siusplau, introdueix el numero de l'accio que vols pendre.";


		}while(seguir);
	}



	public static void nouRedactor() {
		String nom = null, DNI = null;
		int posicio;
		boolean seguir = true, trobat;
		while (seguir) {
			trobat = false;
			posicio = 0;
			System.out.println("Com es diu el nou redactor?");
			nom = entrada.nextLine();
			while (!trobat&&redactors.size()>posicio) {
				if (redactors.get(posicio).getNom().equalsIgnoreCase(nom)) {
					trobat = true;
					System.out.println("Aquest treballador ja tenim un treballador amb aquest nom, prova d'afegir mes cognoms en cas de que comparteixin nom i cognom");
				}
				posicio++;
			}
			seguir=(trobat)?true:false;
		}
		seguir = true;
		while (seguir) {
			trobat = false;
			posicio = 0;
			System.out.println("I quin es el seu DNI?");
			DNI = entrada.nextLine();
			while (!trobat&&redactors.size()>posicio) {
				if (redactors.get(posicio).getDNI().equalsIgnoreCase(DNI)) {
					trobat = true;
					System.out.println("Ja tenim un redactor amb aquest DNI, comprova que l'hagis introduit be.");
				}
				posicio++;
			}
			seguir=(trobat)?true:false;
		}
		Redactor redactor = new Redactor (nom, DNI);
		redactors.add(redactor);
	}


	public static void foraRedactor() {
		String nom = null;
		int posicio;
		boolean seguir = true, trobat;
		if (redactors.size()==0) {
			System.out.println("No tenim cap treballador, per tant no pots despatxar a ningum, estas sol.");
		} else {
			while (seguir) {
				trobat = false;
				posicio = 0;
				System.out.println("Com es diu el redactor que vols despatxar?");
				nom = entrada.nextLine();
				while (!trobat&&redactors.size()>posicio) {
					if (redactors.get(posicio).getNom().equalsIgnoreCase(nom)) {
						trobat = true;
						System.out.println("Molt be, aquest treballador sera despatxat\npobret:(");
						redactors.remove(posicio);
					}
					posicio++;
				}
				seguir=(!trobat)?true:false;
			}
		}



	}


	public static void novaNoticia() {

		String nom, titular = "", info1, info2, info3;
		int i = 0, j = 0, opcio;
		boolean trobat = false, seguir = true, trobacio = false;
		System.out.println("Introdueix el nom del redactor que ha escrit la noticia");
		nom = entrada.nextLine();
		while (!trobat&&redactors.size()>i) {
			if (redactors.get(i).getNom().equalsIgnoreCase(nom)) {
				trobat = true;
			} else {
				i++;
			}
		}
		if (trobat) {
			while (seguir) {
				j = 0;
				trobacio = false;
				System.out.println("Introdueix el titular de la noticia");
				titular = entrada.nextLine();
				while (!trobacio && redactors.get(i).getNoticies().size()>j) {
					if (redactors.get(i).getNoticies().get(j).getTitular().equalsIgnoreCase(titular)) {
						trobacio = true;
						System.out.println("Aquest redactor ja te una noticia amb aquest titular, siusplau introdueixne un altre.");
					} else {
						j++;
					}
				}
				seguir = (trobacio)?true:false;
			}
			seguir = true;
			while(seguir) {
				System.out.println("Indica sobre que tracta la noticia\n"
						+ "1.Futbol\n"
						+ "2.Basquet\n"
						+ "3.Tenis\n"
						+ "4.Formula1\n"
						+ "5.MotoGP");
				opcio = numeros();
				switch(opcio){
				case 1:
					System.out.println("futbol");
					System.out.println("Sobre quina competicio parla?");
					info1 = entrada.nextLine();
					System.out.println("Quin es l'equip protagonista?");
					info2 = entrada.nextLine();
					System.out.println("De quin jugador es parla mes?");
					info3 = entrada.nextLine();
					NoticiaFurbo noticiaFutbol = new NoticiaFurbo (titular, info1, info2, info3);
					redactors.get(i).getNoticies().add(noticiaFutbol);

					seguir = false;
					break;
				case 2:
					System.out.println("Basquet");
					System.out.println("Sobre quina competicio parla?");
					info1 = entrada.nextLine();
					System.out.println("Quin es l'equip protagonista?");
					info2 = entrada.nextLine();
					NoticiaBasquet noticiaBasquet = new NoticiaBasquet (titular, info1, info2);
					redactors.get(i).getNoticies().add(noticiaBasquet);

					seguir = false;
					break;
				case 3:
					System.out.println("Tenis");
					System.out.println("Sobre quina competicio parla?");
					info1 = entrada.nextLine();
					System.out.println("Quin es el protagonista?");
					info2 = entrada.nextLine();
					NoticiaTenis noticiaTenis = new NoticiaTenis (titular, info1, info2);
					redactors.get(i).getNoticies().add(noticiaTenis);

					seguir = false;
					break;
				case 4:
					System.out.println("Formula 1");
					System.out.println("Quina es l'escuderia protagonista?");
					info1 = entrada.nextLine();
					NoticiaF1 noticiaF1 = new NoticiaF1 (titular, info1);
					redactors.get(i).getNoticies().add(noticiaF1);

					seguir = false;
					break;
				case 5:
					System.out.println("Moto GP");
					System.out.println("Quin es l'equip protagonista?");
					info1 = entrada.nextLine();
					NoticiaMotos noticiaMoto= new NoticiaMotos(titular, info1);
					redactors.get(i).getNoticies().add(noticiaMoto);

					seguir = false;
					break;
				default:
					System.out.println("Aixo no es una opcio, tona a introduir un numero");
					break;
				}
			}
		} else {
			System.out.println("Aquest redactor no treballa per nosaltres, contracta'l si vols que escrigui alguna cosa.");
		}
	}


	public static void foraNoticia() {
		String nom, titular = "", missatge;
		int i = 0, j = 0;
		boolean trobat = false, seguir = true, trobacio = false;
		System.out.println("Introdueix el nom del redactor que ha escrit la noticia");
		nom = entrada.nextLine();
		while (!trobat&&redactors.size()>i) {
			if (redactors.get(i).getNom().equalsIgnoreCase(nom)) {
				trobat = true;
			} else {
				i++;
			}
		}
		if (trobat) {
			System.out.println("Introdueix el titular de la noticia");
			titular = entrada.nextLine();
			while (!trobacio && redactors.get(i).getNoticies().size()>j) {
				if (redactors.get(i).getNoticies().get(j).getTitular().equalsIgnoreCase(titular)) {
					trobacio = true;
					redactors.get(i).getNoticies().remove(j);
				} else {
					j++;
				}

			}
			
		}
		missatge = (trobacio)?"La noticia " + titular + " sera eliminada":"No he trobat aquesta noticia, et torno al menu";
		
		System.out.println(missatge);
	}


	public static void veureNoticia() {


		for (int i = 0; i < redactors.size(); i++) {
			System.out.println(redactors.get(i).getNom() + ":");
			if (redactors.get(i).getNoticies().size()==0) {
				System.out.println("         No te cap noticia");
			} else {
				for (int j = 0; j < redactors.get(i).getNoticies().size(); j++) {
					System.out.println("         " + redactors.get(i).getNoticies().get(j).getTitular());
				}
			}
		}	
		System.out.println();
	}

	
	public static void calcularPunts() {
		String nom, titular = "", missatge;
		int i = 0, j = 0;
		boolean trobat = false, seguir = true, trobacio = false;
		System.out.println("Introdueix el nom del redactor que ha escrit la noticia");
		nom = entrada.nextLine();
		while (!trobat&&redactors.size()>i) {
			if (redactors.get(i).getNom().equalsIgnoreCase(nom)) {
				trobat = true;
			} else {
				i++;
			}
		}
		if (redactors.get(i).getNoticies().get(j).getPuntuacio() > 0) {
			System.out.println("awdawdawd1");
			trobacio = true;
		}
		else if (trobat) {
			System.out.println("Introdueix el titular de la noticia");
			titular = entrada.nextLine();
			while (!trobacio && redactors.get(i).getNoticies().size()>j) {
				if (redactors.get(i).getNoticies().get(j).getTitular().equalsIgnoreCase(titular)) {
					trobacio = true;
					redactors.get(i).getNoticies().get(j).calcularPuntuacioNoticia();
				} else {
					j++;
				}

			}
			
		}
		missatge = (trobacio)?"La noticia " + titular + " te " + redactors.get(i).getNoticies().get(j).getPuntuacio() + " punts." :"No he trobat aquesta noticia, et torno al menu";
		
		System.out.println(missatge);
	}

	
	public static void calcularPreu() {
		String nom, titular, missatge;
		int i = 0, j = 0;
		boolean trobat = false, seguir = true, trobacio = false;
		System.out.println("Introdueix el nom del redactor que ha escrit la noticia");
		nom = entrada.nextLine();
		while (!trobat&&redactors.size()>i) {
			if (redactors.get(i).getNom().equalsIgnoreCase(nom)) {
				trobat = true;
			} else {
				i++;
			}
		}
		if (redactors.get(i).getNoticies().get(j).getPreu() > 0) {
			trobacio = true;
		}
		else if (trobat) {
			System.out.println("Introdueix el titular de la noticia");
			titular = entrada.nextLine();
			while (!trobacio && redactors.get(i).getNoticies().size()>j) {
				if (redactors.get(i).getNoticies().get(j).getTitular().equalsIgnoreCase(titular)) {
					trobacio = true;
					redactors.get(i).getNoticies().get(j).calcularPreuNoticia();
				} else {
					j++;
				}

			}
			
		}
		missatge = (trobacio)?"La noticia " + redactors.get(i).getNoticies().get(j).getTitular() + " val " + redactors.get(i).getNoticies().get(j).getPreu() + " euros." :"No he trobat aquesta noticia, et torno al menu";
		
		System.out.println(missatge);
	}
	
	



	public static int numeros (){
		int opcio = 0;
		boolean numeros;
		do {
			try {
				opcio = Integer.parseInt(entrada.nextLine());
				numeros = true;
			}
			catch (java.lang.NumberFormatException e) {
				System.err.println("Aixo no es un numero.");
				numeros = false;
			}
		} while (!numeros);
		return opcio;
	}
}

