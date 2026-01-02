<img width="1919" height="1079" alt="image" src="https://github.com/user-attachments/assets/4e622180-859e-4d36-96eb-2676732222b4" />

🏦 Gestion Bancaire - TP7 🚀
📋 Description
Application de gestion de comptes bancaires développée avec Spring Boot et JAX-RS (Jersey).

✨ Fonctionnalités
✅ Création de comptes
📊 Consultation des soldes
🔄 Gestion des opérations bancaires
🌐 API RESTful
🛠️ Technologies
Java 17
Spring Boot 3.5.7
JAX-RS (Jersey)
H2 Database
Maven
🚀 Démarrage
mvn spring-boot:run
🌐 Accès
API: http://localhost:7459/banque/comptes
Console H2: http://localhost:7459/h2-console
JDBC URL: jdbc:h2:mem:banque
User: sa
Password: (laissez vide)
📝 Exemple de requête
GET /banque/comptes
Accept: application/json
📂 Structure du projet
src/
├── main/
│   ├── java/ma/ws/jaxrs/TP7/
│   │   ├── config/       # Configuration
│   │   ├── controllers/  # Contrôleurs REST
│   │   ├── entities/     # Entités JPA
│   │   └── repositories/ # Repositories
│   └── resources/       
│       └── application.properties
└── test/                # Tests
📄 Licence
MIT © 2024
