package PACKAGE;

import java.util.Scanner;

public class Patient {

// Question 1
	
	// les attributs
	
		private int cin ;
		private String nom ;
		private String groupe_sanguin ;
		private String rhésus ;
		private int âge ;
		private String statut ;
		private boolean diabétique ;
		
		
		// les accesseurs et mutateurs
		
		public int getCin() {
			return cin;
		}
		
	    public void setCin(int cin) {
			this.cin = cin;
		}
		public String getNom() {
			return nom;
		}
		public void setNom(String nom) {
			this.nom = nom;
		}
		public String getGroupe_sanguin() {
			return groupe_sanguin;
		}
		public void setGroupe_sanguin(String groupe_sanguin) {
			this.groupe_sanguin = groupe_sanguin;
		}
		public String getRhésus() {
			return rhésus;
		}
		public void setRhésus(String rhésus) {
			this.rhésus = rhésus;
		}
		public int getÂge() {
			return âge;
		}
		public void setÂge(int âge) {
			this.âge = âge;
		}
		public String getStatut() {
			return statut;
		}
		public void setStatut(String statut) {
			this.statut = statut;
		}
		public boolean isDiabétique() {
			return diabétique;
		}
		public void setDiabétique(boolean diabétique) {
			this.diabétique = diabétique;
		}
		
		public Patient(int c) {
			
			this.cin=c  ;
			Scanner sc= new Scanner(System.in) ;
			
			System.out.println("Veuillez saisir le nom ") ;
			this.nom=sc.next() ;
			System.out.println("Veuillez saisir le groupe sanguin (A, B, AB ou O ) ") ;
			this.groupe_sanguin=sc.next() ;
			System.out.println("Veuillez saisir le rhésus du groupe sanguin ( + ou - ) ") ;
			this.rhésus=sc.next() ;
			System.out.println("Veuillez saisir le statut matériel ( Marié, célibataire, divorcé ou veuf ) ") ;
			this.rhésus=sc.next() ;
			
			System.out.println(" êtes vous diabétiques ? (O/N) ") ;
			
			char reponse=sc.next().charAt(0) ;
			{

			if((reponse=='o') || (reponse=='O'))
				{ this.diabétique=true ;
			
		}
			else	
			{
				this.diabétique=false ;
			}
		}
			
		}
		
		@Override

		public String toString() {
			
			String message2 ;
			
			String message1=" La personne avec cin " +this.cin + ", " +this.nom + " avec groupe sanguin " + this.groupe_sanguin + " " + this.rhésus + " qui est " + this.statut ;
			
			if(this.diabétique==true)
				
			{
				message2=" est diabétique " ;
			}
			
			else
				
			{
				message2=" n'est pas diabétique " ;

			}
			
		return message1 + message2 ;

		}
		
		
}
