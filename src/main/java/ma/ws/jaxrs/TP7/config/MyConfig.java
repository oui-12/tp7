package ma.ws.jaxrs.TP7.config;

import org.glassfish.jersey.jackson.JacksonFeature;  // Pour la sérialisation/désérialisation JSON
import org.glassfish.jersey.server.ResourceConfig;    // Classe de base pour la configuration JAX-RS
import org.springframework.context.annotation.Bean;    // Pour définir des beans Spring
import org.springframework.context.annotation.Configuration;  // Marque cette classe comme une classe de configuration Spring

/**
 * Classe de configuration principale pour l'application JAX-RS.
 * Cette classe définit la configuration de base pour Jersey (l'implémentation JAX-RS utilisée).
 */
@Configuration  // Indique que cette classe contient la configuration Spring
public class MyConfig {

    /**
     * Crée et configure la configuration des ressources JAX-RS.
     * 
     * @return Une instance configurée de ResourceConfig
     */
    @Bean  // Définit cette méthode comme un bean Spring
    public ResourceConfig resourceConfig() {
        // Crée une nouvelle configuration de ressources JAX-RS
        ResourceConfig cfg = new ResourceConfig();

        // Configure le scan des packages pour trouver les contrôleurs JAX-RS
        // Note: Le chemin du package semble incorrect (devrait probablement être "ma.ws.jaxrs.TP7.controllers")
        cfg.packages("ma.ws.jaxrs.controllers");

        // Active la prise en charge de la sérialisation/désérialisation JSON avec Jackson
        cfg.register(JacksonFeature.class);

        // Retourne la configuration configurée
        return cfg;
    }
}