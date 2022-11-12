#	Interface, Polymorphisme, Liaison tardive


 -------------------------------------------
 ### Exercice 1 - Arbre d'expressions
 
 #### 4. Comment corriger ce problème ?
 
 Pour corriger ce problème il suffit de passer l'interface en sealed et d'y 
 autoriser seulement Add, Mul et Sub.
 
 #### 6. Quelle interface que doit-on utiliser à la place de Scanner pour que l'on puisse appeler la méthode parse avec un Scanner ou à partir d'une List.
 
 Une interface iterator.
 
 #### 8. Le type BinOp doit-il être un record, une classe ou une interface ?
 
 Une interface, pour pouvoir faire comme avec Expr
 
 #### 9 comment eval doit être déclarée ? Et comment, dans eval de BinOp, peut-on accéder aux champs left et right, qui sont déclarés dans Add, Sub et Mul ?
 
 Dans bin op eval doit être déclarer comme ça : 
 default int eval();
 Pour accéder aux différents champs left et right on utilise Expr left() et Expr right()
 
 
 -------------------------------------------
 
 Liens qui m'ont aidé à mieux comprendre java / le TP :    
 [Java](https://docs.oracle.com/en/java/javase/16/docs/api/)   
 [Cours n°6](https://igm.univ-mlv.fr/~beal/Teaching/poo6.pdf)
 

