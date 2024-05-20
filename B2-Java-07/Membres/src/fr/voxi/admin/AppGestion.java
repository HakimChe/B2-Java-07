package fr.voxi.admin;

public class AppGestion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Auditeur membre289 = new Auditeur(289, "Selma", "DRADRI", "selam.dradri@gmail.com", 35, "Anglais") ; 
		System.out.println("-----------Auditeur----------");
		System.out.println(membre289.toHTML());
		
		Lecteur lecteur518 = new Lecteur(518, "Jules", "OLLOUCHE", "jules.ollouche@gmail.com", "Polonais", 4) ;
		System.out.println("----------Lecteur------------");
		System.out.println( lecteur518.toHTML());

	}

}
