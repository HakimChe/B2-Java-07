package fr.voxi.admin;

public class Biographie extends Oeuvre {
	private String personnage ;

	public Biographie(int numero, String titre, int nb_audio_books,  String personnage) {
		super(numero, titre, nb_audio_books);
		this.personnage = personnage ;
		// TODO Auto-generated constructor stub
	}
	
	public Biographie(int numero, String titre, int nb_audio_books) {
		super(numero, titre, nb_audio_books);
	}

	public String getPersonnage() {
		return personnage;
	}

	public void setPersonnage(String personnage) {
		this.personnage = personnage;
	}

	@Override
	public String toString() {
		return "Biographie [personnage = " + personnage + " ]";
	}

	
	
}
