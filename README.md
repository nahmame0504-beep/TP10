# Exercice 1 : Triplet Homogène

##  Objectif
Définir une classe générique simple `Triplet<T>` permettant de stocker et manipuler trois objets du même type, tout en garantissant la sécurité de type à la compilation.

##  Structure du Projet
- **Package :** `ma.projet`
- **Classes :**
  - `Triplet.java` : Classe générique à un seul paramètre de type `<T>` encapsulant trois éléments de même type.
  - `TestTriplet.java` : Programme de test instanciant des triplets d'entiers et de chaînes de caractères.

##  Compilation et Exécution

Depuis le répertoire `src/` :

```bash
javac ma/projet/Triplet.java ma/projet/TestTriplet.java
java ma.projet.TestTriplet
Exercice 2 : `README_EX2.md`

```markdown
# Exercice 2 : Triplet Hétérogène

##  Objectif
Étendre la notion de généricité en utilisant plusieurs paramètres de type `<A, B, C>` pour stocker et manipuler trois objets de types potentiellement différents au sein d'une même structure.

## Structure du Projet
- **Package :** `ma.projet`
- **Classes :**
  - `TripletH.java` : Classe générique à trois paramètres de type `<A, B, C>` avec accesseurs typés.
  - `TestTripletH.java` : Programme de test illustrant la création de triplets hétérogènes.

##  Compilation et Exécution

Depuis le répertoire `src/` :

```bash
javac ma/projet/TripletH.java ma/projet/TestTripletH.java
java ma.projet.TestTripletH
```
<img width="1236" height="317" alt="EX2tp10" src="https://github.com/user-attachments/assets/734d6803-c6e8-4c4e-a9bb-751956fe2ff8" />
<img width="1236" height="297" alt="EX1tp10" src="https://github.com/user-attachments/assets/38a70b41-a8d2-4ddb-a596-7d1af2e7c1eb" />
