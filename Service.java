package heritage.version2;

/**
 * @author Ketwenty
 *
 */
public class Service {

	public String passerSoireeEnFamille() {
		String retour = "";
		Famille famille = new Famille();

		System.out.println(famille.passerSoiree());

		return retour;
	}
}
