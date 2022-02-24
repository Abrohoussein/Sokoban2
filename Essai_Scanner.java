import java.util.Scanner;

class Essai_Scanner {
	public static void main (String [] args){
		Scanner my_scanner;
		int entier;
		boolean estEntier= false;
		
		
		System.out.println("Saisissez un entier");
		
		while (!estEntier){
			my_scanner = new Scanner(System.in);
			try{
				entier = my_scanner.nextInt();
				
				System.out.println ("Vous avez saisis l'entier : "+entier);
				estEntier = true;
			}
			catch(Exception e) {
				System.err.println ("Veuillez saisir un entier valide :"); 
			}
		}
	}
}
