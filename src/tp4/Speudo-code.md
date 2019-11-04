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
&nbsp;&nbsp;&nbsp;&nbsp;System.out.println("Combien de note ?");
&nbsp;&nbsp;&nbsp;&nbsp;int user = sc.nextInt();
&nbsp;&nbsp;&nbsp;&nbsp;int compteur = 0;
&nbsp;&nbsp;&nbsp;&nbsp;float tab_entree[] = new float[user];
&nbsp;&nbsp;&nbsp;&nbsp;float result = 0;
&nbsp;&nbsp;&nbsp;&nbsp;while (compteur < user) {
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;System.out.println("Note " + (compteur + 1));
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;tab_entree[compteur] += sc.nextFloat();
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;compteur++;
		}
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp; POUR i allant de 0 à longeur(user) {
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp; result += tab_entree[i];
		}
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp; float la_moyenne = result/user;
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp; System.out.println("voici la moyenne des "+user+" notes : "+ Math.floor(la_moyenne*100)/100);
		
		sc.close();