/**
 * @author TooHighToPlay
 * 
 */
public class Pussy extends DomesticAnimal {

	protected final String specialPhrase;

	public Pussy(int legsCount, String specialPhrase) {
		this.legsCount = legsCount;
		this.specialPhrase = specialPhrase;
	}

	@Override
	public DomesticAnimal deepClone() {

		return new Pussy(legsCount, specialPhrase);
	}

	@Override
	public void beCute() {
		System.out.println(specialPhrase + "!!!");
	}

	@Override
	public DomesticAnimal createFromString(String string) {

		String[] valueKeyPairs = string.trim().split(";");
		return new Pussy(Integer.parseInt(valueKeyPairs[0]), valueKeyPairs[1]);
	}

}