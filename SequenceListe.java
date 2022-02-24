
public class SequenceListe{
	int element;
	SequenceListe suivant;

	SequenceListe() {
		this.element = -1;
		this.suivant = null;
	}
	
	void insereTete(int element){
		if (this.element == -1){
			this.element = element;
		}else{
			SequenceListe nouvelleTete = new SequenceListe();
			nouvelleTete.element = this.element;
			nouvelleTete.suivant = suivant;
			this.element = element;
			this.suivant = nouvelleTete;	
		}
	}
	
	void insereQueue(int element){
		
		if (this.element == -1){
			this.element = element;
		}else{
			SequenceListe tmp_seq = this;
			while (tmp_seq.suivant != null){
				tmp_seq = tmp_seq.suivant ; 
			}			
			tmp_seq.suivant = new SequenceListe();	
			tmp_seq.suivant.element = element;
		}
	}
	
	int extraitTete(){
		int elem_ext = this.element;
		if (this.suivant != null){
			this.element = suivant.element;
			this.suivant = suivant.suivant;
		}else if(this.suivant == null && this.element != -1 ){
			this.element = -1;
			this.suivant = null;	
		}
		return elem_ext;
	}
	
	boolean estVide(){
		return this.element == -1;
	}

	void afficher(){
		SequenceListe tmp_seq = this;
		while (tmp_seq.suivant != null){
			System.out.print(tmp_seq.element+"->");
			tmp_seq = tmp_seq.suivant ; 
		}
			System.out.print(tmp_seq.element+"\n");
	}
}



