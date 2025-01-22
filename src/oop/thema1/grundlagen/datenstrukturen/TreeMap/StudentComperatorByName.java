package oop.thema1.grundlagen.datenstrukturen.TreeMap;

import java.util.Comparator;

public class StudentComperatorByName implements Comparator<Student> {
	
	@Override
	public int compareTo(Student s1, Student s2) {
		return s1.name.compareTo(s2.name); // Alphabetische Sortierung
	}
	

}
