package fr.voxi.admin;

public class Membre {
	private int numero ; 
	private String nom ; 
	private String prenom ;
	private String email ; 
	
	public Membre(int numero, String nom, String prenom, String email) {
		super();
		this.numero = numero;
		this.nom = nom;
		this.prenom = prenom;
		this.email = email ;
	}

	public int getNumero() {
		return numero;
	}
	
	public void setNumero(int numero) {
		this.numero = numero;
	}
	
	public String getNom() {
		return nom;
	}
	
	public void setNom(String nom) {
		this.nom = nom;
	}
	
	public String getPrenom() {
		return prenom;
	}
	
	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	@Override
	public String toString() {
		return "Membre [ numero = " + numero + ", nom = " + nom + ", prenom = " + prenom + " ]";
	} 
	
	
	

}

