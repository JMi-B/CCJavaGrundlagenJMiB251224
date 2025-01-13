package oop.thema1.grundlagen;

public class AutoProgramm {
	
	public static void main(String[] args) {
		//vom Doz 
		Auto auto1 = new Auto("BMW", "X5", 2021);
		// auto1.fahren();
		
		Auto auto2 = new Auto("Mercedes", "AG15", 2024);
		// auto2.fahren();
		
		System.out.println(auto1.getMarke());
		auto1.setMarke("Audi");
		auto1.fahren();
		System.out.println(auto2.getMarke());
		auto2.fahren();
		System.out.println(auto1);
		System.out.println(Auto.ANZAHL_REIFEN);
		
		
	}

//	public static void main(String[] args) {
//		Meins
//		Auto meinAuto = new Auto();
//		meinAuto.marke="BMW";
//		meinAuto.modell="X5";
//		meinAuto.baujahr=2021;
//		
//		meinAuto.fahren();
//		//
////		System.out.print(meinAuto.marke +" "+ meinAuto.modell + " fährt.");
//	}

}
