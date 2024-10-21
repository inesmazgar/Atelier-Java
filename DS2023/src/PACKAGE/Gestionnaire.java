package PACKAGE;

import java.util.ArrayList;
import java.util.Scanner;


public class Gestionnaire {

	
	// allocation dynamique des listes
	
private ArrayList <Patient> ListePatient= new ArrayList<>() ; 
private ArrayList <Ordonnance> ListeOrdonnance= new ArrayList <> () ;
	
// Méthode 1

public Patient recherche_patient(int c) {
	
	System.out.println("Recherche de patients ") ;
	System.out.println("------------------------------------------ ") ;

	
	for(Patient patient : ListePatient)
	{
		if(patient.getCin()==c) {
			return patient	;
			
		}
	}
	
		
	return null ;

}


// Méthode 2

public void ajout_nouveau_patient() {
	
	System.out.println("Ajout d'un nouveau patient ") ;
	System.out.println("------------------------------------------ ") ;
	int x ;
	
	do       {
		
	
	System.out.println("Veuillez saisir la cin du patient : ") ;
	Scanner sc = new Scanner(System.in) ;
	int x=sc.nextInt() ; 
	
	} while(recherche_patient(x)!=null);
	
	
Patient nouveau_patient=new Patient(x) ;
ListePatient.add(nouveau_patient);

}

// Méthode 3


public void affichage_des_patients_AB_plus() {
	
	System.out.println("Affichage de la liste des patients avec groupe sanguin AB + ") ;
	System.out.println("------------------------------------------ ") ;
	
	for(Patient patient : ListePatient) {
		
	if((patient.getGroupe_sanguin()=="AB")&&(patient.getRhésus()=="+"))	 {
	
		System.out.println(" " + patient.toString()) ;
	}
	
	
}
}

// Méthode 4

public void ajout_ordonnance() {
	
	System.out.println("Ajout d'une nouvelle ordonnance ") ;
	System.out.println("------------------------------------------ ") ;
	Scanner sc = new Scanner(System.in) ;
	
	
	int x= ListeOrdonnance.size() ;
	
	// la dernière ordonnance dans la liste
	
	Ordonnance a=ListeOrdonnance.get(x) ;
	
	// w est l'identifiant de la dernière liste + 1 ( pour avoir un nouveau identifiant incrémenté )
	
	int w= a.getIdentifiant() + 1 ;
	
	Ordonnance nouvelle_ordonnace=new Ordonnance() ;

	System.out.println("Veux-tu clôturer ? (O/N) ") ;
	String q=sc.next() ;
	
	if(q=="N") 
	{
		return null ;
	}
	
	else
		
	
	
}

// Méthode 5

public int nombre_apparitions(String name) {
	
	int calcul=0 ;
	
	for(Ordonnance ordonnance : ListeOrdonnance) {
		
			if(ordonnance.getListePrescription(contains(name)))
			{
				calcul ++ ;
			}
		}
	return calcul ;
	
	
}


// Méthode 6

public void affichage_détails_ordonnances(String d, int cin) {
	
	for(Ordonnance ordonnance : ListeOrdonnance)
	{
		
	Patient p=ordonnance.getP();
	
		if((ordonnance.getDate()==d)&&(p.getCin()==cin)) {
		
	System.out.println(" " +ordonnance.toString()) ; }
}

}
	
}


