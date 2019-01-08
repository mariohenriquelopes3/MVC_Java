package modelo;

public class Home {

	private String id;

	public Home(final String id) {
		this.id = id;
	}

	public String getId() {
		return this.id;
	}

	public void setId(final String id) {
		this.id = id;
	}

	@Override
	public String toString() {
		return this.id;
	}

}
