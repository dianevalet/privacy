# Projet Differencial privacy
Cette premiere version a ete realis�e avec jpa, maven, mysql, tomcat.
l'interface html est encore en construction.

#Installation

-Telecharger le projet sur github sur le lien https://github.com/dianevalet/privacy
- Creer une base de donn�e vide dans mysql avec pour nom sbd 
- Copier le script qui se trouve dans le fichier script.txt pour creer la table adult 
- importer  le jeu de donn�es au format adult.csv qui se trouve dans le repository
- ouvrir le projet dans eclispe
- dans src/main/java puis jpa lancer le main
- dans la console on a le nombre reel d'individu par race
le nombre avec du bruit et le bruit ajout�.
Dans cette version nous nous sommes concentr� sur les requetes de type count
la fonction pour obtenir le bruit est est la methode bruit de la classe Laplace.

Tester il ne reste que ca!