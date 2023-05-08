package N3E1;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
	static Scanner entrada = new Scanner(System.in);
	static ArrayList<Redactor> redactors = new ArrayList<Redactor>();
	public static void main(String args[]) {
		boolean seguir = true;
		String opcio;//CAMBIA AIXO PER NUMERIUS
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
			opcio = entrada.nextLine();
			switch (opcio) {
			case "A":
				System.out.println("Molt Be");
				nouRedactor();
				break;
			case "B":
				System.out.println("Molt be");
				foraRedactor();
				break;
			/*case 3:

				break;
			case 4:

				break;
			case 5:

				break;
			case 6:

				break;
			case 7:

				break;
			case 0:

				break;*/
			default:
				System.out.println("Aixo no es una de les opcions, siusplau introdueix un numero correcte");
				break;
			
			}
			missatge = "Benvingut de nou, et torno a deixar aqui les opcions \n"
					+ "1.Contractar un nou redactor\n"
					+ "2.Despatxar un redactor\n"
					+ "3.Introduir la noticia d'un redactor\n"
					+ "4.Retirar la noticia d'un redactor\n"
					+ "5.Mostrar tot el portfolio del redactor\n"
					+ "6.Calcular la puntuacio d'una noticia\n"
					+ "7.Calcular el preu d'una noticia\n"
					+ "0.Sortire del programa\n"
					+ "Siusplau, introdueix el numero de l'accio que vols pendre.";


		}while(true);
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









	public static int numeritus() {
		//TODO
		return 1;
	}
}

