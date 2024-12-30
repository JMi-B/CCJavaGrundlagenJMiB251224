package thema1grundlagen;

public class BMI2 {
	
	// BMI mit Rundung 

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		berechnenBmi(1.75, 85.0);
	}

	public static void berechnenBmi(double groesse, double gewicht) {
		
			
		double bmi = gewicht/(groesse*groesse);
	
	
		double rundBmi = 0;

		rundBmi = Math.round(bmi);
		
		System.out.println(bmi);
		System.out.println(rundBmi);
		
	

	
		
	

	}	}
