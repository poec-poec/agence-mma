/**
 * 
 */
package com.poecpoec.agence;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Seme
 */
public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// /*
		// * Tests unitaires itération #1
		// */
		// System.out.println("Test it#1");
		// Aeroport cdg = new Aeroport("CDG");
		// Ville paris = new Ville("Paris", "France");
		// Ville londres = new Ville("Londres", "UK");
		// System.out.println(cdg);
		// System.out.println(paris);
		//
		// /*
		// * UT it#2
		// */
		// System.out.println("Test it#2");
		// cdg.ajouterVille(paris);
		// cdg.ajouterVille(londres);
		// System.out.println(cdg);
		//
		// /*
		// * UT it#3
		// */
		// System.out.println("Test it#3");
		// System.out.println(paris);
		//
		// /*
		// * UT it#4 : test de la connexion à la BDD
		// */
		// // déclaration des variables
		// List<Aeroport> aeroports = new ArrayList<>();
		//
		//
		// // j'ai besoin du DAO, alors je l'instancie
		// AeroportDao aeroportDao = new AeroportDao();
		// // j'appelle la méthode pour récupérer tous les objets de classe
		// // Aéroport de la BDD à l'aide du DAO Aéroport
		// aeroports = aeroportDao.findAll();
		//
		//
		// // j'affiche mes aéroports
		// System.out.println(aeroports);

		// TEAM MMA

		// IT#1 Création classe Adresse
		Adresse adresse = new Adresse();
		adresse.setId(1);
		adresse.setAdresse("15bis, Allée James Watt");
		adresse.setCodePostal("33700");
		adresse.setVille("Mérignac");
		adresse.setPays("France");
		System.out.println(adresse);

		// IT#2 Création classe Client + relation adresse.
		Client client = new Client();
		client.setAdresse(adresse);

		System.out.println(client);

		// IT#3 Création client DAO.
		List<Client> clients = new ArrayList<>();
		ClientDao clientDao = new ClientDao();
		clients = clientDao.findAll();
		System.out.println(clients);

		// IT#4 Mise en place des adresses crée
		for (int i = 0; i < clients.size(); i++) {
			clients.get(i).setAdresse(adresse);
		}
		System.out.println(clients);
	}

}
