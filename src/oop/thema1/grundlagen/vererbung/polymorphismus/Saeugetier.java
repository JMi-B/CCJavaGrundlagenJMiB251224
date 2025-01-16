package oop.thema1.grundlagen.vererbung.polymorphismus;

public abstract class Saeugetier {
	
//Atribute
	
	private String name;

	
//Konstruktor
	
	public void name () {
		
	}
	
	
	
//Methoden
	
		
	//GetterSetter
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	};
	
	//weitere Methoden
	
	public void macheGeraesche() {
		System.out.println("Geraesch");
	}
	
	public void bewegeDich () {
		System.out.println("Bewegung");
	}
	@Override
    public String toString() {
        return "Name: " + name;
    }
}
