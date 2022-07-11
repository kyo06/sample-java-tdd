Exemple TDD en Java (Source: https://igm.univ-mlv.fr/~dr/XPOSE2009/TDD/pagesHTML/ExempleJAVA.html)

Objectifs
Le but de cet exemple est de décrire chaque étape de la méthode TDD à travers un exemple simple et pratique. L'exemple sera codé en Java et l'outil de test unitaire utilisé est JUnit.

L'objectif fonctionnel de l'exemple est le suivant :

On souhaite créer un jeu d'action ou le héros principal est un loup. Il est demandé à ce que le loup puisse tourner dans le sens des aiguilles d'une montre (Orientation nord, est, sud et ouest). De plus il est précisé que le loup doit débuter le jeu à la position nord.

Le but est tout d'abord de tester que le loup commence au nord et C'est pourquoi le nom de la méthode de test porte le nom testPositionInitialeAuNord.
Les erreurs de compilation signalent que l'objet Loup et Orientation n'existent pas. La méthode employée est donc la bonne, en écrivant les tests on considère que nous avons besoin de tel objet et méthode pour respecter une règle fonctionnelle. Ici, en l'occurrence il est nécessaire de disposer de l'objet Loup (qui sera créé par la suite) ainsi que d'introduire la notion d' orientation (qui pourra par exemple être de type énumération).

Dans le but de corriger les erreurs de compilation il faut créer les objets Loup et Orientation avec le minimum d'information.



Ajout d'une méthode de test et du minimum d'implémentation :
Il est maintenant souhaité de trouver un moyen pour que le loup puisse tourner selon le sens des aiguilles d'une montre. Pour cela les tests vont d'abord être rédigés comme précédemment.

Ici, la méthode tourner a été imaginé pour faire tourner l'objet Loup et la nouvelle méthode testTournerUneFois contrôle qu'une fois après avoir tourné le loup qui est au départ à la position NORD passe ensuite à la position EST. Le minimum de l'implémentation a été écrit afin que le code compile.
