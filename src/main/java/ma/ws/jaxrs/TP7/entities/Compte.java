package ma.ws.jaxrs.TP7.entities;

import jakarta.persistence.*;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlRootElement;

import java.util.Date;

/**
 * Classe représentant un compte bancaire dans le système.
 * Cette classe est mappée à une table dans la base de données et peut être sérialisée en XML/JSON.
 */
@Entity
@XmlRootElement  // Permet la sérialisation XML de l'objet
@XmlAccessorType(XmlAccessType.FIELD)  // Spécifie que les champs doivent être sérialisés (et non les getters/setters)
public class Compte {

    /**
     * Identifiant unique du compte, généré automatiquement par la base de données.
     */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)  // Auto-incrémentation
    private Long id;

    /**
     * Solde actuel du compte.
     */
    private double solde;

    /**
     * Date de création du compte.
     * Stockée uniquement la date (sans l'heure) dans la base de données.
     */
    @Temporal(TemporalType.DATE)
    private Date dateCreation;

    /**
     * Type de compte (COURANT ou EPARGNE).
     * Stocké sous forme de chaîne de caractères dans la base de données.
     */
    @Enumerated(EnumType.STRING)
    private TypeCompte type;

    /**
     * Constructeur par défaut requis par JPA.
     */
    public Compte() {}

    /**
     * Constructeur avec paramètres pour créer un nouveau compte.
     * 
     * @param id L'identifiant du compte
     * @param solde Le solde initial du compte
     * @param dateCreation La date de création du compte
     * @param type Le type de compte (COURANT ou EPARGNE)
     */
    public Compte(Long id, double solde, Date dateCreation, TypeCompte type) {
        this.id = id;
        this.solde = solde;
        this.dateCreation = dateCreation;
        this.type = type;
    }

    /**
     * @return L'identifiant du compte
     */
    public Long getId() { return id; }
    
    /**
     * Définit l'identifiant du compte.
     * @param id Le nouvel identifiant
     */
    public void setId(Long id) { this.id = id; }

    /**
     * @return Le solde actuel du compte
     */
    public double getSolde() { return solde; }
    
    /**
     * Définit le solde du compte.
     * @param solde Le nouveau solde
     */
    public void setSolde(double solde) { this.solde = solde; }

    /**
     * @return La date de création du compte
     */
    public Date getDateCreation() { return dateCreation; }
    
    /**
     * Définit la date de création du compte.
     * @param dateCreation La nouvelle date de création
     */
    public void setDateCreation(Date dateCreation) { this.dateCreation = dateCreation; }

    /**
     * @return Le type de compte (COURANT ou EPARGNE)
     */
    public TypeCompte getType() { return type; }
    
    /**
     * Définit le type de compte.
     * @param type Le nouveau type de compte
     */
    public void setType(TypeCompte type) { this.type = type; }

    /**
     * Retourne une représentation textuelle de l'objet Compte.
     * @return Une chaîne de caractères représentant le compte
     */
    @Override
    public String toString() {
        return "Compte{" +
                "id=" + id +
                ", solde=" + solde +
                ", dateCreation=" + dateCreation +
                ", type=" + type +
                '}';
    }
}