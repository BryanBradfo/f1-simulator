# F1-Simulator 🏎️

![F1 Wallpaper](f1.jpg)

**English:** Become the director of an F1 team, earn money to improve your two cars for the next races! Get ready and join this adventure.

**Français:** Devenez directeur d'une écurie de F1, gagnez de l'argent afin d'améliorer vos deux voitures pour vos prochaines courses ! Soyez prêt et rejoignez cette aventure.

## Features / Fonctionnalités ✨

*   **Team Management / Gestion d'Écurie:**
    *   Choose from 10 official F1 teams (Ferrari, Mercedes, RedBull, etc.) or potentially create your own.
    *   Manage your team's budget.
    *   Earn money based on race performance.
    *   Gain team experience.
*   **Car Management / Gestion de la Voiture:**
    *   View detailed stats of your car (Weight, Performance Index).
    *   Manage individual car components: Aerodynamics, Chassis, Brakes, Engine, Wheels.
    *   Upgrade specific car components to improve performance, spending your budget wisely.
    *   Monitor component durability and repair them.
*   **Driver Management / Gestion des Pilotes:**
    *   View detailed statistics for your two drivers (Name, Nationality, Age, Experience, etc.).
    *   Drivers gain experience over time.
*   **Race Simulation / Simulation de Course:**
    *   Participate in races on circuits like Bahrain International Circuit.
    *   Race simulation takes into account car performance, driver experience, and circuit characteristics (sectors, DRS zones, turns).
    *   View real-time (simulated turn-by-turn) and final race standings.
*   **Persistence / Sauvegarde:**
    *   Save and load your game progress using one of the multiple save slots.
    *   Delete unwanted save files.
*   **Graphical User Interface / Interface Graphique:**
    *   User-friendly interface built with Java Swing (using MVC pattern).
    *   Custom buttons and image backgrounds.
    *   Includes background music (`maintheme.wav`).

## Technologies Used / Technologies Utilisées 💻

*   **Language:** Java
*   **GUI:** Java Swing (with Nimbus Look and Feel)
*   **Persistence:** Java Serialization (`.ser` file)
*   **Audio:** Java Sound API (`javax.sound.sampled.*`)
*   **Testing:** JUnit 5
*   **IDE/Build:** Primarily developed with Eclipse (inferred from `.project` and `.classpath` files).

## Project Structure / Structure du Projet 📁

```text
.
├── src/                      # Main source code directory / Répertoire principal du code source
│   ├── modele/               # Core game logic classes (Ecurie, Voiture, Pilote, Circuit...)
│   ├── exceptions/           # Custom exception classes
│   ├── MVC_interface_graphique/ # GUI related classes (Model, View, Controller)
│   │   ├── Modèle/
│   │   ├── Vue/
│   │   └── Contrôle/
│   ├── utils/                # Utility classes (Sauvegarde, BoutonPerso...)
│   ├── Main.java             # Main application entry point / Point d'entrée principal
│   └── save.ser              # Default save file location / Emplacement du fichier de sauvegarde
├── livrables/                # Deliverable files as requested / Fichiers livrables demandés
├── docs/                     # Documentation files (LaTeX, Markdown...) / Fichiers de documentation
├── img/                      # Image assets / Ressources graphiques
├── sons/                     # Sound assets / Ressources audio
├── bin/                      # Compiled .class files (Should NOT be versioned) / Fichiers .class compilés (Ne devraient PAS être versionnés)
├── .classpath                # Eclipse build path configuration
├── .project                  # Eclipse project configuration
├── README.md                 # This file / Ce fichier
└── LISEZ-MOI.txt             # Original SVN instructions (French) / Instructions SVN originales (Français)
```
**Note:** As recommended in `LISEZ-MOI.txt`, compiled files (`.class` in `bin/`) and other generated files should not be committed to version control (like SVN or Git). Consider using a `.gitignore` or `svn:ignore` property.

## How to Run / Comment Lancer le Jeu 🚀

1.  **Prerequisites:**
    *   Make sure you have a compatible Java Runtime Environment (JRE) installed.
2.  **Using an IDE (Recommended):**
    *   Import the project into an IDE like Eclipse.
    *   Ensure JUnit 5 is added to the build path (as specified in `.classpath`).
    *   Make sure the `img/` and `sons/` folders are accessible from the project root.
    *   Run the `src/Main.java` file.
3.  **Using Command Line (May require classpath adjustments):**
    *   Compile the source files from the `src/` directory, outputting to `bin/`:
        ```bash
        # Navigate to the project's root directory (containing src, img, etc.)
        javac -d bin -cp src src/Main.java src/modele/*.java src/exceptions/*.java src/utils/*.java src/MVC_interface_graphique/Modèle/*.java src/MVC_interface_graphique/Vue/*.java src/MVC_interface_graphique/Contrôle/*.java
        # (You might need to adjust the command based on your exact structure and dependencies)
        ```
    *   Run the compiled code from the project root, ensuring `bin` is in the classpath:
        ```bash
        java -cp bin Main
        ```
    *   Ensure the `img/`, `sons/` folders and `save.ser` (if it exists) are in the same directory where you run the `java` command (the project root).

## How to Build / Comment Compiler 🛠️

*   Use the compile command shown in the "How to Run" section.
*   Alternatively, use the build functionality of your IDE (e.g., Eclipse's "Build Project"). The output directory is configured as `bin/`.
