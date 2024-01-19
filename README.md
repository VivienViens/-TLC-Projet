# -TLC-Projet
[ESIR2 TLC] Projet Compilateur
Vivien JULIENNE - Nolah MAZET - Mawa SYLLA - Jean YAO - Louis NIANGO
--------------------------------------------------------------------

Le projet n'étant pas achevé, le programme ne génère pas d'exécutable.

- Architecture :
On peut retrouver les différentes étapes de notre travail dans le dossier "code".
Dans ce dossier, il y a un fichier Main.java qu'il faut exécuter. 
Le dossier "Ressources" contient la library ANTLR ainsi que l'application ANTLR.
Le dossier "noeuds" contient les fichiers .java nécessaires à la génération du code 3 adresses.
Enfin, le fichier TableSymbole.java contient la classe nécessaire à la génération de la table des symboles.

- Fichier Main.java : 
Le string whileClassContent contient le programme while que l'on souhaite compiler. Après avoir définit les
lexer et parser, on affiche successivement la table des symboles (le plus haut niveau étant en bas de la table),
puis les résultats de la compilation et enfin le code 3 adresses correspondant.
