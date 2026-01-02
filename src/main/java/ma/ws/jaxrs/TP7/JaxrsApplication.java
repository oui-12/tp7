package ma.ws.jaxrs.TP7;

// Import des classes du modèle et des repositories
import ma.ws.jaxrs.TP7.entities.Compte;
import ma.ws.jaxrs.TP7.entities.TypeCompte;
import ma.ws.jaxrs.TP7.repositories.CompteRepository;

// Import des classes Spring Boot
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.Date;  // Pour la gestion des dates

/**
 * Classe principale de l'application Spring Boot.
 * 
 * <p>Cette classe contient la méthode main() qui est le point d'entrée de l'application.
 * L'annotation @SpringBootApplication active la configuration automatique, le scan de composants
 * et la configuration des beans Spring.</p>
 * 
 * <p>L'application expose une API REST pour gérer des comptes bancaires avec les fonctionnalités suivantes :
 * <ul>
 *   <li>Création de comptes</li>
 *   <li>Récupération de la liste des comptes</li>
 *   <li>Gestion des types de comptes (courant/épargne)</li>
 * </ul>
 * 
 * @see Compte
 * @see TypeCompte
 * @see ma.ws.jaxrs.TP7.controllers.CompteRestJaxRSAPI
 */
@SpringBootApplication  // Combine @Configuration, @EnableAutoConfiguration et @ComponentScan
public class JaxrsApplication {
    /**
     * Point d'entrée principal de l'application Spring Boot.
     * 
     * @param args les arguments de la ligne de commande
     */
    public static void main(String[] args) {
        // Lance l'application Spring Boot
        SpringApplication.run(JaxrsApplication.class, args);
    }

    /**
     * Méthode d'initialisation qui s'exécute au démarrage de l'application.
     * 
     * <p>Cette méthode crée des données de démonstration dans la base de données
     * pour faciliter les tests de l'application.</p>
     * 
     * @param repo Le repository pour accéder aux données des comptes
     * @return Une implémentation de CommandLineRunner qui sera exécutée au démarrage
     */
    @Bean  // Définit cette méthode comme un bean Spring
    CommandLineRunner start(CompteRepository repo) {
        return args -> {
            // Création de comptes de démonstration avec des soldes aléatoires
            repo.save(new Compte(null, Math.random()*9000, new Date(), TypeCompte.EPARGNE));
            repo.save(new Compte(null, Math.random()*9000, new Date(), TypeCompte.COURANT));
            repo.save(new Compte(null, Math.random()*9000, new Date(), TypeCompte.EPARGNE));
            
            // Affichage de tous les comptes dans la console
            System.out.println("=== Comptes créés dans la base de données ===");
            repo.findAll().forEach(System.out::println);
        };
    }
}