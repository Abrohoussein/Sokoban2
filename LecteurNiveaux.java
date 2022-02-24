import java.util.Scanner;
import java.io.InputStream;

class LecteurNiveaux {
	Scanner my_scanner;

	LecteurNiveaux (InputStream in) {
		my_scanner = new Scanner(in);
	}
	
   Niveau lisProchainNiveau(){
		int i = 0;
		
		
		Niveau nv = new Niveau();
		while( my_scanner.hasNextLine() ){
			
   			String ligne = my_scanner.nextLine();
   			String nom_nv ="";
 			i++;
			int j = 0;
			while ( j < ligne.length() && ligne.charAt(j)!= '\n'){	
				 if( ligne.charAt(j) == ';'){
					j++;
					while (ligne.charAt(j) == ' '){ j++;}
					while (j < ligne.length()){
						nom_nv = nom_nv + ligne.charAt(j);
						j++;
					}
					nv.fixeNom(nom_nv);
					return nv;
				 }  
				 switch(ligne.charAt(j)){
					case '#': nv.ajouteMur(i,j);
							 break;
					case '$': nv.ajouteCaisse(i,j);
							 break;
					case '.': nv.ajouteBut(i,j);
							 break;
					case '@': nv.ajoutePousseur(i,j);
							 break;
					case ' ': nv.videCase(i,j);
							 break;
					default :
							 break;
				 }
				 j++;
				 nv.redimension(i, j);
			 }
	 	}
		return null;
	} 
}

