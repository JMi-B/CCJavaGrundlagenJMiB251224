package oop.thema1.grundlagen.datenstrukturen.TreeMap;

public class Student implements Comparable<Student>{

	private String name;
	private int age;
	
	public Student(String name, int age){
		this.name = name;
		this.age = age;
	}
	
	@Override
	public int compareTo(Student other) {
		return Integer.compare(this.age, other.age); //Sortierung nach Alter
	}
	@Override
	public String toString() {
		return name + "("+ age +")";
	}
}
