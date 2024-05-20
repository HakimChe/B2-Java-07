package fr.voxi.admin;

public class Auditeur extends Membre {
	private int nbOeuvres ; 
	private String languePref ;
	
	public Auditeur(int numero, String nom, String prenom, String email) {
		super(numero, nom, prenom, email);
		// TODO Auto-generated constructor stub
	}

	public Auditeur(int numero, String nom, String prenom, String email, int nbOeuvres, String languePref) {
		super(numero, nom, prenom, email);
		this.nbOeuvres = nbOeuvres;
		this.languePref = languePref;
	}

	public int getNbOeuvres() {
		return nbOeuvres;
	}

	public void setNbOeuvres(int nbOeuvres) {
		this.nbOeuvres = nbOeuvres;
	}

	public String getLanguePref() {
		return languePref;
	}

	public void setLanguePref(String languePref) {
		this.languePref = languePref;
	}
	
	public String toHTML() {
		String html = "" ; 
		html += "\n" + "<span id=" + getNumero() + " class=auditeur > \n" ;
		html += getNom() + "(<em>" + getLanguePref() + "</em>) \n" ; 
		html += "</span>" ;
		return html ;
	}
	

	@Override
	public String toString() {
		return "Auditeur [ nbOeuvres = " + nbOeuvres + ", languePref = " + languePref + " ]";
	} 
	
	
	
	
}
