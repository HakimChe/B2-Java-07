package fr.voxi.admin;

public class AppGestion {
	public static void main(String[] args) {
		System.out.println( "----------1.4-----------") ;
		Oeuvre oeuvre1 = new Oeuvre(1, "Au revoir là-haut") ; 
		System.out.println( oeuvre1.toHtml()) ; 
		
		System.out.println( "----------1.6-----------") ;
		Biographie oeuvre2 = new Biographie (2, "Hannibal Barca", 5, "Hannibal") ;
		System.out.println( oeuvre2.toHtml()) ;
		
	}
	
}
