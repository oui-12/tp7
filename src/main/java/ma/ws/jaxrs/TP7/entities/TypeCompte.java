package ma.ws.jaxrs.TP7.entities;

/**
 * Énumération représentant les différents types de comptes bancaires disponibles.
 * Chaque constante représente un type de compte spécifique.
 */
public enum TypeCompte {
    /**
     * Compte courant - Compte bancaire standard pour les opérations quotidiennes
     */
    COURANT, 
    
    /**
     * Compte épargne - Compte destiné à l'épargne avec des intérêts
     */
    EPARGNE
}