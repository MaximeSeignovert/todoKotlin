# Application TodoKotlin

## Informations
- **Étudiant :** Maxime SEIGNOVERT
- **Formation :** Architecture Logiciel
- **Module :** Reactive Programming
- **Type :** Travaux Pratiques

## Description du Projet
Cette application Android de gestion de tâches (Todo) a été développée dans le cadre du module de Reactive Programming. Elle met en œuvre les principes de la programmation réactive et de la Clean Architecture en utilisant les technologies modernes de développement Android.

## Technologies Utilisées
- **Kotlin** - Langage de programmation principal
- **Jetpack Compose** - Framework UI moderne pour Android
- **Room** - Bibliothèque de persistance de données
- **Coroutines & Flow** - Pour la programmation asynchrone et réactive
- **Hilt** - Pour l'injection de dépendances
- **Clean Architecture** - Pour une architecture modulaire et maintenable

## Architecture
Le projet suit les principes de la Clean Architecture avec une séparation en trois couches :

### 1. Couche Domain
- Contient les modèles de données (Task)
- Définit les contrats des repositories
- Indépendante des frameworks externes

### 2. Couche Data
- Implémente la persistance avec Room
- Gère la conversion des données
- Implémente les repositories

### 3. Couche Presentation
- Utilise le pattern MVVM avec ViewModel
- Interface utilisateur avec Jetpack Compose
- Gestion des états avec StateFlow

## Fonctionnalités
- ✅ Affichage de la liste des tâches
- ✅ Ajout d'une nouvelle tâche
- ✅ Modification d'une tâche existante
- ✅ Suppression d'une tâche
- ✅ Persistance des données avec Room
- ✅ Interface utilisateur moderne et réactive

## Configuration Requise
- Android Studio Hedgehog | 2023.1.1 ou supérieur
- JDK 17
- Android SDK 34
- Gradle 8.2.2

## Installation
1. Cloner le repository
2. Ouvrir le projet dans Android Studio
3. Synchroniser le projet avec Gradle
4. Lancer l'application sur un émulateur ou un appareil physique (Android 8.0 minimum)

## Aspects Réactifs du Projet
- Utilisation de `StateFlow` pour la gestion des états
- Implémentation de `Flow` pour les opérations de base de données
- Gestion asynchrone avec les Coroutines
- UI réactive avec Jetpack Compose

## Structure du Projet
```
app/
├── src/
│   ├── main/
│   │   ├── java/com/example/todokotlin/
│   │   │   ├── data/
│   │   │   │   ├── local/
│   │   │   │   └── repository/
│   │   │   ├── di/
│   │   │   ├── domain/
│   │   │   │   ├── model/
│   │   │   │   └── repository/
│   │   │   └── presentation/
│   │   │       ├── components/
│   │   │       └── screens/
│   │   └── res/
│   └── test/
└── build.gradle.kts
``` 