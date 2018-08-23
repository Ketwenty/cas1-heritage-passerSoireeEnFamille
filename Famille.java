package heritage.version2;

/**
 * @author Ketwenty
 *
 */
public class Famille {
	private Maman maman;
	private Fils fils;
	private Fille fille;

	/**
	 * Constructeur
	 */
	public Famille() {
		maman = new Maman();
		fils = new Fils();
		fille = new Fille();
	}

	private String manger() {
		return maman.manger() + fils.manger() + fille.manger();
	}

	private String digerer() {
		return maman.digerer() + fils.digerer() + fille.digerer();
	}

	public String passerSoiree() {
		return maman.cuisiner() + manger() + digerer() + maman.netoyer();
	}

}
