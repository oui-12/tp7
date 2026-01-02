package ma.ws.jaxrs.TP7.controllers;

import jakarta.ws.rs.*;                       // Pour les annotations JAX-RS
import jakarta.ws.rs.core.MediaType;          // Pour les types MIME (JSON/XML)
import org.springframework.stereotype.Component; // Pour la gestion des composants Spring
import ma.ws.jaxrs.TP7.repositories.CompteRepository; // Référence au repository des comptes
import ma.ws.jaxrs.TP7.entities.Compte;              // L'entité Compte

import org.springframework.beans.factory.annotation.Autowired; // Pour l'injection de dépendances
import java.util.List; // Pour la gestion des listes

/**
 * Contrôleur REST pour la gestion des opérations bancaires.
 * Cette classe expose des endpoints REST pour interagir avec les comptes bancaires.
 * Toutes les URLs commencent par "/banque".
 */
@Component  // Marque cette classe comme un composant Spring
@Path("/banque")  // Préfixe d'URL pour tous les endpoints de ce contrôleur
public class CompteRestJaxRSAPI {

    /**
     * Référence au repository pour l'accès aux données des comptes.
     * L'annotation @Autowired permet l'injection automatique de la dépendance.
     */
    @Autowired
    private CompteRepository repo;

    /**
     * Récupère la liste de tous les comptes bancaires.
     * 
     * @return Une liste de tous les comptes au format JSON ou XML
     * 
     * Exemple d'appel : GET /banque/comptes
     * Exemple de réponse (JSON) :
     * [
     *   {"id": 1, "solde": 1000.0, "dateCreation": "2023-01-01", "type": "COURANT"},
     *   {"id": 2, "solde": 5000.0, "dateCreation": "2023-02-15", "type": "EPARGNE"}
     * ]
     */
    @GET 
    @Path("/comptes")  // Chemin relatif : /banque/comptes
    @Produces({MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML})  // Format de réponse accepté
    public List<Compte> getComptes() { 
        // Appel au repository pour récupérer tous les comptes
        return repo.findAll(); 
    }
}