
public class test_lecteur {
	public static void main (String [] argv){		
		try{
			SequenceTableau n = new SequenceTableau(10);
			n.insereQueue(4);
			n.insereQueue(5);
			n.insereQueue(6);
			n.insereQueue(7);
			n.insereQueue(8);
			n.insereQueue(9);
			n.insereQueue(10);
			n.insereQueue(11);
			n.insereQueue(12);
			n.insereQueue(13);
			IterateurTableau it = new IterateurTableau(n);
		
			
			// System.out.print ("->"+it.prochain());
			// System.out.print ("->"+it.prochain()+"\n");
			// n.afficher();
			//it.supprime();
			//it.courant.afficher();
			//it.courant.afficher();
			
			//it.prochain();
			//it.prochain();
			n.afficher();

			//System.out.print(it.prochain()+"\n");
			//System.out.print(it.prochain()+"\n");
			//System.out.print(it.prochain()+"\n");
			//System.out.print(it.prochain()+"\n");

			System.out.print("--- j="+n.j+" i="+n.i+" n="+n.n+"\n");
			System.out.print(it.prochain()+"\n");
			System.out.print(it.prochain()+"\n");
			System.out.print(it.prochain()+"\n");
			System.out.print(it.prochain()+"\n");

			it.supprime();
			//System.out.print(it.prochain()+"\n");
			n.afficher();
			System.out.print("--- j="+n.j+" i="+n.i+" n="+n.n+"\n");
			//System.out.print(it.prochain()+"\n");
			//System.out.print(it.prochain()+"\n");
			//System.out.print(it.prochain()+"\n");
			//System.out.print(it.prochain()+"\n");
			//System.out.print(it.prochain()+"\n");
			//System.out.print(it.prochain()+"\n");
			//System.out.print(it.prochain()+"\n");
			//System.out.print(it.prochain()+"\n");
			//it.precedent.afficher();
			//it.arrierePrecedent.afficher();
			//System.out.print(n.extraitTete()+"\n");
			//System.out.print(n.extraitTete()+"\n");
			//System.out.print(n.extraitTete()+"\n");
			//System.out.print(n.extraitTete()+"\n");
			//System.out.print(n.extraitTete()+"\n");
			//n.insereQueue(6);
			n.afficher();
			//System.out.print(n.extraitTete()+" \n");
			//n.afficher();
			//n.afficher();
			/*File f = new File(argv[0]);
			FileInputStream df = new FileInputStream(f);
			LecteurNiveaux lv = new LecteurNiveaux(df);
			Niveau nv = new Niveau();
			nv = lv.lisProchainNiveau();
			System.out.println ("Vous avez saisis l'entier : "+nv.nom());
			
			for (int i=0; i<nv.H; i++) {
				for(int j=0; j<nv.L; j++){
				
				System.out.print(nv.grille[i][j]);
				}
				System.out.print("\n");
			}
			nv = lv.lisProchainNiveau();
			System.out.println ("Vous avez saisis l'entier : "+nv.nom());
			
			for (int i=0; i<nv.H; i++) {
				for(int j=0; j<nv.L; j++){
				
				}
				System.out.print("\n");
			}*/
		}
		catch(Exception e) {
			System.err.println ("Le fichier entrer n'éxiste pas :"+e); 
		}		
	}
}
