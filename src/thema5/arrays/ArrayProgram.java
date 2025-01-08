package thema5.arrays;

public class ArrayProgram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] ages = new int[5];
		ages[0] = 12;
		ages[1] = 22;
		ages[2] = 2;
		ages[3] = 30;
		ages[4] = 50;
		
//		System.out.println(ages[0]);
//		System.out.println(ages[1]);
//		System.out.println(ages[2]);
//		System.out.println(ages[3]);
//		System.out.println(ages[4]);
		
		// Position im Index
		for(int i=0; i < ages.length; i++) {
			System.out.println(ages[i]);
		}
		//Ganze Linste
		for(int age : ages) {
			System.out.println(age);
		}
	}

}
