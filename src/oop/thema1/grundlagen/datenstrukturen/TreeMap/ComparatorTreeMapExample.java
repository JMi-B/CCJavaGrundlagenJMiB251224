package oop.thema1.grundlagen.datenstrukturen.TreeMap;

public class ComparatorTreeMapExample {

	public static void main(String[] args) {
		//TreeMap mit benutzerdefiniertem Comparator(Sortierung nach Name)
		TreeMap<Student, Sring> studentMap = new TreeMap<>(
				new StudentCommparatorByName());
		

	}

}
