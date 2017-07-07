package com.poecpoec.agence;
/**
 * 
 * @author Miguel
 *
 */

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;





public class ClientDao {
	/**
	 * Data Access Objet
	 */
	public ClientDao() {

	}

	/**
	 * Retourner tous les clients de la BDD
	 * 
	 * @return Liste de client
	 */
	public List<Client> findAll() {
		List<Client> clients = new ArrayList<>();

		try {
			// Etape 1 : chargement du driver
			Class.forName("com.mysql.jdbc.Driver");
			// Etape 2 : création de la connexion
			String dsn = "jdbc:mysql://localhost:3306/agence";
			Connection connexion = DriverManager.getConnection(dsn, "user", "password");
			// Etape 3 : création du statement
			Statement statement = connexion.createStatement();
			// Etape 4 : Exécuter la requête SQL
			ResultSet resultats = statement.executeQuery("SELECT * FROM client");
			// Etape 5 : boucle de parcours des résultats
			while (resultats.next()) {
				// je crée un client vide
				Client client = new Client();
				client.setId(resultats.getInt("id"));
				client.setNom(resultats.getString("nom"));
				client.setNumeroTel(resultats.getString("telephone"));
				client.setEmail(resultats.getString("email"));

				// je l'ajoute à ma liste
				clients.add(client);
			}
			// Etape 6 : fermer le résultat
			resultats.close();
			// Etape 7 : fermer le statement
			statement.close();
			// Etape 8 : fermer la connexion
			connexion.close();
		} catch (ClassNotFoundException e) {
			System.out.println("Impossible de charger le driver. Vérifier votre classpath.");
		} catch (SQLException e) {
			System.out.println("Erreur SQL. Voir ci-après.");
			System.out.println(e.getMessage());
		}
		return clients;
	}
}
