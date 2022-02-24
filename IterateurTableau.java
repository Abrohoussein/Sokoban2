import java.lang.Math;
public class IterateurTableau {
    SequenceTableau courant;
    int indice;

    IterateurTableau(SequenceTableau t){
        courant = t;
        indice = courant.i;
    }

    public boolean aProchain(){
        int Resultat = (int) (Math.sqrt(Math.pow(courant.j-courant.i,2)))-courant.n;
        return ((courant.j+1 != courant.i) && ( Resultat != 0));
    }

    public int prochain(){
        int courant_el ;
        courant_el = courant.tab[indice];
        if (indice == courant.nMax-1){
            indice = 0;
        }else{
            indice++;
        }
        return courant_el;
    }

    public void supprime(){
        int ind = indice;
        if (courant.j > courant.i) {
            if (indice == courant.j - 1) {
                courant.j--;
                courant.n--;
            }else if (indice == courant.i ) {
                courant.i++;
                indice++;
                courant.n--;
            }else{
                while (ind < courant.j-1) {
                    courant.tab[ind] = courant.tab[ind + 1];
                    ind++;
                }
                courant.j--;
                courant.n--;
            }
        }else{
            if (indice == courant.j - 1 && indice == 0) {
                courant.j = courant.nMax;
                courant.n--;
            }else if (indice == courant.i && indice == courant.nMax - 1) {
                courant.i = 0;
                indice = 0;
                courant.n--;
            }else if (indice >= courant.i && indice < courant.nMax ) {
                while (ind > courant.i) {
                    courant.tab[ind] = courant.tab[ind - 1];
                    ind--;
                }
                courant.i++;
                courant.n--;
            }else{
                while (ind < courant.j-1) {
                    courant.tab[ind] = courant.tab[ind + 1];
                    ind++;
                }
                courant.j--;
                courant.n--;
            }
        }
    }

}
