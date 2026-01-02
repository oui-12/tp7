package ma.ws.jaxrs.TP7.repositories;

import ma.ws.jaxrs.TP7.entities.Compte;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Interface de repository pour l'entité Compte.
 * 
 * <p>Cette interface hérite de JpaRepository qui fournit des méthodes CRUD (Create, Read, Update, Delete)
 * standards pour la gestion des entités Compte dans la base de données.</p>
 * 
 * <p>Spring Data JPA implémentera automatiquement cette interface au démarrage de l'application,
 * fournissant ainsi une implémentation concrète avec toutes les méthodes de base.</p>
 * 
 * <p>Exemple d'utilisation :
 * <pre>{@code
 * @Autowired
 * private CompteRepository compteRepository;
 * 
 * // Récupérer tous les comptes
 * List<Compte> tousLesComptes = compteRepository.findAll();
 * 
 * // Enregistrer un nouveau compte
 * Compte nouveauCompte = new Compte(null, 1000.0, new Date(), TypeCompte.COURANT);
 * compteRepository.save(nouveauCompte);
 * 
 * // Trouver un compte par son ID
 * Optional<Compte> compte = compteRepository.findById(1L);
 * }</pre>
 * </p>
 * 
 * @see org.springframework.data.jpa.repository.JpaRepository
 * @see ma.ws.jaxrs.TP7.entities.Compte
 */
public interface CompteRepository extends JpaRepository<Compte, Long> {
    // Cette interface hérite automatiquement des méthodes standards de JpaRepository :
    // - save(), saveAll() : pour sauvegarder des entités
    // - findById(), findAll() : pour récupérer des entités
    // - delete(), deleteAll() : pour supprimer des entités
    // - count() : pour compter les entités
    // - existsById() : pour vérifier l'existence d'une entité
    
    // Vous pouvez ajouter ici des méthodes de requête personnalisées si nécessaire
    // Par exemple :
    // List<Compte> findByType(TypeCompte type);
    // List<Compte> findBySoldeGreaterThan(double montant);
}