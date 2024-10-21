package PACKAGE;

import java.util.ArrayList;
import java.util.Scanner;



public class Ordonnance {
	
	// les attributs
	
	
	private int identifiant ;
	private String date ;
	private String nom_médecin ;
	private ArrayList<Prescription> ListePrescription = new ArrayList<>() ;
	private Patient p ;
	
	// les accesseurs et mutateurs
	
	
	public int getIdentifiant() {
		return identifiant;
	}
	public void setIdentifiant(int identifiant) {
		this.identifiant = identifiant;
	}
	
	
	public String getDate() {
		return date;
	}
	public void setDate(String date) {
		this.date = date;
	}
	public String getNom_médecin() {
		return nom_médecin;
	}
	public void setNom_médecin(String nom_médecin) {
		this.nom_médecin = nom_médecin;
	}
	public Patient getP() {
		return p;
	}
	public void setP(Patient p) {
		this.p = p;
	}
	public ArrayList<Prescription> getListePrescription() {
		return ListePrescription;
	}
	public void setListePrescription(ArrayList<Prescription> listePrescription) {
		ListePrescription = listePrescription;
	}
	
	
	// constructeur, pour patient existant et liste de prescription vide
	
	
	public Ordonnance() {
		
		
		Scanner sc=new Scanner(System.in) ;
		
		
		
		do
		{
			
			System.out.println("Veuillez saisir l'identifiant unique de l'ordonnance ") ;
			this.setIdentifiant(sc.nextInt()) ;
			
			System.out.println("Veuillez saisir la date ") ;
			this.date=sc.next() ;
			
			System.out.println("Veuillez saisir le nom du médecin ") ;
			this.nom_médecin=sc.next() ;
			
			System.out.println("Veuillez saisir la cin du patient ") ;
			int c=sc.nextInt() ;
			
			Patient pa= new Patient(c) ;
			this.p=pa ;
			
			Prescription pre=new Prescription() ;
			
			ListePrescription.add(pre) ;
		
			
		
		}
		
		while(ListePrescription.size()!=0) ;
			
		
		
	}
	
	@Override
	
	// La méthode toString
	
	public String toString() {
		
		String message1=" à la date  " +this.date + ", le patient " +this.p.getNom() + " après les analyses du médecin  " + this.nom_médecin + "a cette liste de prescriptions :" + this.ListePrescription ;
return message1 ;
		
	}
	
	public void ajout_prescription(int x) {
		
		System.out.println("Ajout d'une nouvelle prescription ") ;
		System.out.println("------------------------------------------ ") ;
	
	Prescription nouvelle_prescription = new Prescription();
		ListePrescription.add(nouvelle_prescription) ;
		
	}
	
	
	
	
	

}
