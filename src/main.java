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
		
		Ville Dijon = new Ville("Dijon", 40.41, 375831);
		System.out.println(Dijon);
		
		Departement coteDor = new Departement("Côte d'Or", 21, 3);
		coteDor.ajouterVille(Dijon);
		
		Ville Quetigny = new Ville("Quetigny", 8.19, 9690);
		Ville Beaune = new Ville("Beaune", 31.3, 52741);
		
		coteDor.ajouterVille(Quetigny);
		coteDor.ajouterVille(Beaune);
		
		System.out.println(coteDor);
	}

}
