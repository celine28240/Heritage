# Java Quest HERITAGE

@Wild Code School may 2019.
## Instructions

### Go Autoboat !

Afin de t'exercer à l'héritage, tu vas créer les classes suivantes :

    Crée une classe abstraite Vehicle
    Ajoute les attributs String brand et int kilometers
    Crée un constructeur permettant d'initialiser brand et kilometers
    Ajoute des getters et setters pour tous les attributs, en respectant les conventions
    Crée une classe Car qui étend la classe Vehicle
    Crée une classe Boat qui étend la classe Vehicle
    Ajoute dans Vehicle la méthode abstraite public String doStuff()
    Ajoute dans Car et Boat une implémentation du corps de la méthode doStuff(). Pour Car, tu devras retourner "Je suis {brand} et je fais vroum vroum !" et pour Boat : "Je suis {brand} et je fais glou glou !"
    Crée une classe Hangar qui possédera une méthode main()
    Ajoute des références vers des instances des classes Car et Boat dans la méthode main() de Hangar
    Pour chacune des références, affiche dans le terminal le résultat de l'appel de la méthode doStuff()
    Compile et teste Hangar : quand tout fonctionne, crée un dépôt git et envoie le tout sur GitHub
    Partage le lien du dépôt GitHub en solution

Exemple de résultat attendu lors de l'exécution de Hangar :

$ Je suis Clio et je fais vroum vroum !
$ Je suis Titanic et je fais glou glou !

### Critères de validation

    Le dépôt GitHub contient bien les fichiers Vehicle.java, Car.java, Boat.java et Hangar.java
    Les classes respectent les conventions de la POO : attributs privés, utilisation du mot-clef this, getters et setters nommés correctement.
    Des références à des instances de la classe Car et Boat sont présentes dans la classe Hangar
    La classe Hangar se compile sans erreur et affiche le résultat attendu dans le terminal



