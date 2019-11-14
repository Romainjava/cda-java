# cda-java

Algo: Calculer la note
Role: Calculer la note de moyenne fourni par utilisateur
Variable : 
			int : user;
			int : compteur;
			float : tab_entree[];
			float : result;
			Scanner : sc;
			
DEBUT

&nbsp;&nbsp;&nbsp;&nbsp;Scanner sc = new Scanner(System.in);
&nbsp;&nbsp;&nbsp;&nbsp;affiche("Combien de note ?");
&nbsp;&nbsp;&nbsp;&nbsp;user = entree()
&nbsp;&nbsp;&nbsp;&nbsp;compteur = 0;
&nbsp;&nbsp;&nbsp;&nbsp;tab_entree[] = new float[user];
&nbsp;&nbsp;&nbsp;&nbsp;result = 0;
&nbsp;&nbsp;&nbsp;&nbsp;TANT QUE compteur < user FAIRE 
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;affiche("Note " + (compteur + 1));
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;tab_entree[compteur] += entree();
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;compteur+=1;
&nbsp;&nbsp;&nbsp;&nbsp;FIN TANT QUE		
&nbsp;&nbsp;&nbsp;&nbsp;POUR i allant de 0 à longeur(user) faire
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp; result += tab_entree[i];
&nbsp;&nbsp;&nbsp;&nbsp;FIN POUR
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp; float la_moyenne = result/user;
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp; affiche("voici la moyenne des "+user+" notes : "+ Math.floor(la_moyenne*100)/100);		
FIN	