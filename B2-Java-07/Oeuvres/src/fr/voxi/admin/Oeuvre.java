package fr.voxi.admin;

public class Oeuvre {
	private int numero ;
	private String titre ;
	private int nb_audio_books ; 
	public static final int NB_AUDIOBOOKS_MAX = 5 ;

	public Oeuvre(int numero, String titre, int nb_audio_books) {
		super();
		this.numero = numero;
		this.titre = titre;
		this.nb_audio_books = nb_audio_books ; 
	}
	
	public Oeuvre(int numero, String titre) {
		super();
		this.numero = numero;
		this.titre = titre;
	}

	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

	public String getTitre() {
		return titre;
	}

	public void setTitre(String titre) {
		this.titre = titre;
	}
	
	public int getNb_audio_books() {
		return nb_audio_books;
	}

	public void setNb_audio_books(int nb_audio_books) {
		this.nb_audio_books = nb_audio_books;
	}

	public String toHtml() {
		String html = "<div> " ; 
		html += "\n" ;
		if( getNb_audio_books() > NB_AUDIOBOOKS_MAX) {
			html += getNumero() + " <strong> Production bloquée </strong>" + " \n" ;
			html += getTitre() + " \n" ; 
		}
		else {
			html += getNumero() + " ( " + getNb_audio_books()+ " produits ) " + " \n " ;
			html += getTitre() + " \n" ; 
		}
		html += "</div>" ;
		return html ;
	}
	
	@Override
	public String toString() {
		return "Oeuvre [numero = " + numero + ", titre = " + titre + ", Nombre d'audio-books = " + nb_audio_books + " ]";
	}

}
