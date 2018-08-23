package heritage.version2;

/**
 * @author Ketwenty
 *
 */
public class Maman extends Humain {

	public String cuisiner() {
		return "Le repas est pret !\n";
	}

	@Override
	protected String manger() {
		return "J'ai bien mangé !\n";
	}

	@Override
	protected String digerer() {
		return "Je n'ai plus faim !\n";
	}

	public String netoyer() {
		return "C'est bien propre !\n";
	}

}
