package PACKAGE;

import java.util.Scanner;

public class Prescription {
	
	// les attributs 
	
	private String nom_médicament ;
	private int nombre_administration ;
	private double dosage ;
	
	
	// les accesseurs et mutateurs
	
	public String getNom_médicament() {
		return nom_médicament;
	}
	public void setNom_médicament(String nom_médicament) {
		this.nom_médicament = nom_médicament;
	}
	public int getNombre_administration() {
		return nombre_administration;
	}
	public void setNombre_administration(int nombre_administration) {
		this.nombre_administration = nombre_administration;
	}
	public double getDosage() {
		return dosage;
	}
	public void setDosage(double dosage) {
		this.dosage = dosage;
	}
	
	
	// le constructeur
	
	public Prescription() {
		

		
		Scanner sc=new Scanner(System.in) ;
		System.out.println("Veuillez saisir le nom du médicament ") ;
		this.nom_médicament=sc.next() ;
		
		// Le nombre d'administration et le dosage ont une valeur minimale qui est 1
		
		do {
		
		System.out.println("Veuillez saisir le nombre d'administration par jour ") ;
		this.nombre_administration=sc.nextInt() ;
		System.out.println("Veuillez saisir le dosage ") ;
		this.dosage=sc.nextDouble() ;
		}while( (this.nombre_administration<1) || (this.dosage<1) ) ;
	}
	
	
	@Override
	
	// La méthode toString
	
	public String toString() {
		
		return " Le médicament  " +this.nom_médicament + "a comme nombre d'administartion par jour  " +this.nombre_administration + " avec un dosage de  " + this.dosage  ;

	}

}
