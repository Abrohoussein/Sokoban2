
public class IterateurSequenceListe{
	
	SequenceListe courant,precedent,arrierePrecedent,s;
	boolean peutSupprimer = false;
	
	IterateurSequenceListe(SequenceListe l){
		courant = l;	
		s = l;
	}	
	
	public boolean aProchain(){
		return courant.suivant != null;
	}
	
	public int prochain(){
		int resultat = courant.element;
		arrierePrecedent = precedent;
		precedent = courant;
		courant = courant.suivant;
		peutSupprimer = true;
		return resultat;		
	}
	
	public void supprime(){
		if (peutSupprimer) {
			if (arrierePrecedent == null) {
				s = courant;
			}else{
				arrierePrecedent.suivant = courant;
			}
			
				precedent = arrierePrecedent;
		}else{
			throw new IllegalStateException("Deux suppressions d'affilée");
		}	
		peutSupprimer = false;	
	}
		
}
