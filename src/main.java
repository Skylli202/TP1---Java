/**
 * 
 */

/**
 * @author Skylli
 *	TP1 Java
 */
public class main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// 1
		Ville Dijon = new Ville("Dijon", 40.41, 375831);
		Ville Quetigny = new Ville("Quetigny", 8.19, 9690);
		Ville Beaune = new Ville("Beaune", 31.3, 52741);
		Ville Macon = new Ville("Macon", 27.0, 100172);
		Ville Chalon = new Ville("Chalon-sur-Saône", 15.22, 133557);
		
		// 2
		Departement coteDor = new Departement("Côte d'Or", 21, 3);
		Departement saoneEtLoire = new Departement("Saône-et-Loire", 71, 2);
		
		// 3
		coteDor.ajouterVille(Dijon);
		coteDor.ajouterVille(Quetigny);
		coteDor.ajouterVille(Beaune);
		System.out.println();
		
		// 4
		saoneEtLoire.ajouterVille(Macon);
		saoneEtLoire.ajouterVille(Chalon);
		System.out.println();
		
		// 5
		System.out.println(coteDor);
		System.out.println(saoneEtLoire);
		
		System.out.println(Dijon.estIdentiqueA(Dijon));
		System.out.println(Ville.sontIdentiques(Dijon,Dijon));
		
		// Ex 4
		/* 1)
		 * Toutes les instances de Ville porte désormais le même nom,
		 * qui se trouve être le dernier nom set
		 * */
				
		/*
		Ville Dijon = new Ville("Dijon", 40.41, 375831);
		System.out.println(Dijon);
		
		Departement coteDor = new Departement("Côte d'Or", 21, 3);
		coteDor.ajouterVille(Dijon);
		
		Ville Quetigny = new Ville("Quetigny", 8.19, 9690);
		Ville Beaune = new Ville("Beaune", 31.3, 52741);
		
		coteDor.ajouterVille(Quetigny);
		coteDor.ajouterVille(Beaune);
		
		System.out.println(coteDor);
		*/
	}

}
