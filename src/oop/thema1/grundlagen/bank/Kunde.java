package oop.thema1.grundlagen.bank;

public class Kunde {

	private String kundenId;
	
	private String name;
	
	private String adresse;

	@Override
	public String toString() {
		return "Kunde [kundenId=" + kundenId + ", name=" + name + ", adresse=" + adresse + "]";
	}

	public String getKundenId() {
		return kundenId;
	}

	public void setKundenId(String kundenId) {
		this.kundenId = kundenId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAdresse() {
		return adresse;
	}

	public void setAdresse(String adresse) {
		this.adresse = adresse;
	}
	
}

