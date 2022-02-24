import java.util.*;

public class Niveau {
	String nom;
	char [][] grille;
	int L,H; 
	
	Niveau(){
		L = 0;
		H = 0;
		grille = new char[100][100];
	}
	
		void redimension(int i, int j){
			if (L <= j){
				L = j+1;
			}
			if (H <= i){
				H = i+1;
			}
		}
		
	 	void fixeNom(String s){
			nom = s;
		}

		void videCase(int i, int j){
				grille[i][j] = ' ';
		} 
		
		void ajouteMur(int i, int j){
				grille[i][j] ='#';
		}
		void ajoutePousseur(int i, int j){
				grille[i][j] = '@';
		}
		void ajouteCaisse(int i, int j){
				grille[i][j] = '$';
		}
		void ajouteBut(int i, int j){
				grille[i][j] = '.';
		}
		

		int lignes(){
			return L;
		}
		int colonnes(){
			return H;
		}
		String nom(){
			return nom;
		} 
		boolean estVide(int l, int c){
			if (!(( l >= 0 & l < L) & ( c >= 0 & c < H ))){
				return false;
			}
			return grille[l][c] == ' ';
		} 

		
		boolean aMur(int l, int c){
			if (!(( l >= 0 & l < L) & ( c >= 0 & c < H ))){
				return false;
			}
			return grille[l][c] == '#';
		}
		boolean aBut(int l, int c){
			if (!(( l >= 0 & l < L) & ( c >= 0 & c < H ))){
				return false;
			}
			return grille[l][c] == '.';
		} 
		boolean aPousseur(int l, int c){
			if (!(( l >= 0 & l < L) & ( c >= 0 & c < H ))){
				return false;
			}
			return grille[l][c] == '@';
		}
		boolean aCaisse(int l, int c){
			if (!(( l >= 0 & l < L) & ( c >= 0 & c < H ))){
				return false;
			}
			return grille[l][c] == '$';
		}


}
