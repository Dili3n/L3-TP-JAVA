# Lambda, interface fonctionnelle et type fonction


 -------------------------------------------
 ### Exercice 1 - upperCaseAll
 
 #### 1 . Rappeler comment on met une chaîne de caractères en majusucules, indépendamment de la langue dans laquelle l'OS est configuré.

 Pour mettre une chaîne de caractères en majuscules, on utilise la méthode `toUpperCase()` de la classe `String`.

 #### 2. Quelle est l'interface fonctionnelle utilisée par la méthode replaceAll ?

    La méthode `replaceAll()` utilise l'interface `UnaryOperator`.

 #### 3. À quel type de fonction cela correspond-il ? Autrement dit, que prend la fonction en argument et que renvoie-t-elle ?

    La fonction prend en argument une chaîne de caractères pour renvoyaer de même.

 #### 4. Sachant que l'on appelle replaceAll avec une liste de String, quel est le type des paramètres de la lambda et quel est son type de retour ?

    Le type des paramètres de la lambda est `String` avec le même type de retour.

 ### Exercice 2 - occurences

 #### 1. Quelle est le type du paramètre de la méthode occurences ? Quelle est le type de retour de la méthode occurences ?

    Le type du paramètre de la méthode `occurences` est `List de String` et le type de retour est `Map Strng Int`.    

 #### 2. Quelle est l'implantation que l'on doit choisir ici ?

    l'implantation `HashMap`.

 #### 3. Quelle interface fonctionnelle prend-elle en paramètre ? Quel est le type fonction correspondant ? Ici, quels sont les types des paramètres / de retour de la lambda que vous allez utliser ?
    
        L'interface fonctionnelle prend en paramètre `BiFunction` et le type fonction correspondant est `String` et `Integer`.

 #### 4. Quelle interface fonctionnelle prend-elle en paramètre ? Quel est le type fonction correspondant ? Ici, quels sont les types des paramètres / de retour de la lambda que vous allez utliser ?
    
        L'interface fonctionnelle prend en paramètre `BiFunction` et le type fonction correspondant est `String` et `Integer`.

 ### Exercice 3 - groupBy

 #### 1. Quel est le type de paramètre de actorGroupByFirstName ? Quel est le type de retour de actorGroupByFirstName ?

    Le type de paramètre de `actorGroupByFirstName` est `List de Actor` et le type de retour est `Map de String et List de Actor`.

 #### 2. Rappeler comment marche la méthode Map.computeIfAbsent. Son second paramètre est une interface fonctionnelle, à quel type de fonction correspond-elle ?

    La méthode `Map.computeIfAbsent` prend une clé et val en param. la valeur est ajoutée à la clé si la clé n'exsite pas. Si la clé existe, la valeur est mise à jour.

 #### 3. Dans notre cas, quel doit être le type de la lambda passée en second paramètre de computeIfAbsent ?
 
    `List de Actor`.

 #### 5. Quelle doit être le type fonction du second paramètre de actorGroupBy ? Quelle est l'interface fonctionnelle correspondante ? Quelle doit être le type du second paramètre de actorGroupBy ?

    Le type fonction du second paramètre de `actorGroupBy` est `List de Actor` et l'interface est `Function`. Le type du second paramètre de `actorGroupBy` est `List de Actor`.
 -------------------------------------------
 
 Liens qui m'ont aidé à mieux comprendre java / le TP :    
 [Java](https://docs.oracle.com/en/java/javase/16/docs/api/)   
 [Cours] (https://igm.univ-mlv.fr/~beal/Teaching/poo8.pdf)
 

