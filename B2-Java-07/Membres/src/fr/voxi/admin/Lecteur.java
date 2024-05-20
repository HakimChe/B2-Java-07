package fr.voxi.admin;

public class Lecteur extends Membre{
	private String langueMat ; 
	private int maitrise ;
	
	public Lecteur(int numero, String nom, String prenom, String email, String langueMat, int maitrise) {
		super(numero, nom, prenom, email);
		this.langueMat = langueMat;
		this.maitrise = maitrise;
	}

	public String getLangueMat() {
		return langueMat;
	}
	
	public void setLangueMat(String langueMat) {
		this.langueMat = langueMat;
	}
	
	public int getMaitrise() {
		return maitrise;
	}
	
	public void setMaitrise(int maitrise) {
		this.maitrise = maitrise;
	}
	
	public String toHTML() {
		String html = "" ;
		html += "<span id=" + getNumero() + "class=lecteur > \n" ;
		html += getNom() + "\n " ;
		if ( getMaitrise() == 1 ) {
			html += "<br/> \n " ; 
			html += "Degré de maêtrise : " + getMaitrise() + "\n</div>" ;
			return html ;
		}
		else if( getMaitrise() == 2 ) {
			html += "<br/> \n " ; 
			html += "Langue maternelle : " + getLangueMat() + "\n </div>" ;
			return html ;
		}
		else if(getMaitrise() == 3) {
			html += "<br/> \n " ; 
			html += "Degré de maêtrise : " + getMaitrise() + "\n</div>" ;
			html += "Préférence : " + getLangueMat() + "\n </div> " ;
			return html ;
		}
		else if( getMaitrise() == 4 || getMaitrise() == 5) {
			html += "(<em>" + getLangueMat() + "</em>) \n</span>" ;
			return html ;
		}
		html += "Il ne maitrise pas.";
		return html ;
		
	}
		
	

	@Override
	public String toString() {
		return "Lecteur [langueMat=" + langueMat + ", maitrise=" + maitrise + "]";
	} 
	
	

}
