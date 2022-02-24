import java.util.Scanner;

class SequenceTableau{
	int []tab;
	int i,j,n ;
	int nMax;  // Le nombre maximal d'élément du tableau 
			   // est défini à la création de clui ci  
	
	SequenceTableau(int max) {
		nMax = max;
		tab = new int [nMax];
		i = 0; // Indice du premier element
		j = 0; // Indice du dernier element
		n = 0; // Nombre d'élément présent dans le tableau
	}
	
	// Insere un element a l'indice i-1 
	void insereTete(int element){
		if (nMax == n || i-1 == j){
			System.out.print("Tableau plein \n");
			return;
		}else{
			if (i == 0  && j != nMax-1){
				if(tab[i] == -1){
					this.tab[i] = element;
					tab[i+1] = -1;
				}else{
					this.i = nMax-1;
					this.tab[i] = element;
				}
			}else if (i > j && j+1 != i ){
				i--;
				this.tab[i] = element;
			}else if (i < j && i > 0){
				i--;
				this.tab[i] = element;

			}
		this.n++;
		}
	}
	
	// Insere un element a l'indice j+1 
	void insereQueue(int element){
		if (nMax == n || j+1 == nMax ){
			System.out.print("Tableau plein !!!\n");
			return;
		}
		if (j == 0 || i == j){
			this.tab[j] = element;
			j++;
		}else if (i < j && j < nMax-1 ){
			this.tab[j] = element;
			j++;
		}else if (i > j && j+1 != i){
			this.tab[j] = element;
			j++;
		}
		this.n++;
	}
	
	// Extrais l'élément en tête (a l'indice i)
	// et le renvoie
	int extraitTete(){
		if (i == nMax-1 ){
			i=0;
			n--;
			return tab[nMax-1];
		}else{
			i++;
			n--;
			return tab[i-1];
		}
	}
	
	// Indique si le tableau est vide
	boolean estVide(){
		return j-i == 0;
	}

	// Affiche les éléments du tableau
	void afficher(){
		int k = i;
		if (i == j){
			return;
		}
		if (i < j){
			while(k < j){
				System.out.print(tab[k]+"-");
				k++;
			}
			System.out.print("\n");
		}else{
			while(k < nMax ){
				System.out.print(tab[k]+"-");
				k++;
			}
			k=0;
			while(k < j){
				System.out.print(tab[k]+"-");
				k++;
			}
			System.out.print("\n");
		}
	}
}



